import java.util.*;

public class height_of_tree{
    
    public static class Node{
        int data;
        ArrayList<Node> children;

        Node (int data){
            this.data = data;
            children = new ArrayList<>();
        }
    }
    
    public static int Size(Node node){
        int size = 0;
        for(Node child : node.children) size += Size(child);
        size++;
        return size;
    }

    public static int height(Node node){

        int ht = -1;
        for(Node child : node.children){
            int temp = height(child);
            if(temp > ht) ht = temp;

        }

        return ht + 1;
    }

    public static Node constructor(int[] arr){
        Node root = new Node(arr[0]);

        Stack<Node> st = new Stack<>();
        st.push(root);

        for(int i = 1; i < arr.length; i++){
            

            if(arr[i] == -1){
                st.pop();
            }else{
                Node newnode = new Node(arr[i]);
                st.peek().children.add(newnode);
                st.push(newnode);
            }
        }
        return root;
    }

    public static void Display(Node node){
        System.out.print(node.data + "---> ");

        for(Node child : node.children){
            System.out.print(child.data + " ");
        }
        System.out.println(".");

        for(Node child : node.children){
            Display(child);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i= 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        Node root = constructor(arr);
        Display(root);

        System.out.println("Size of Tree : " + Size(root));
        System.out.println("Height of Tree : " + height(root));
    }
}