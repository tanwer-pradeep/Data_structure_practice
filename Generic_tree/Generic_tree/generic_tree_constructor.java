import java.util.*;

public class generic_tree_constructor{
    
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

    

    public static int maximum(Node node){
        if(node == null) return Integer.MIN_VALUE;
        
        int max = node.data;

        for(Node child : node.children){
            int val = maximum(child);
            if(max < val) max = val;
        }
        return max;
    }

    public static int minimum(Node node){
        if(node == null) return Integer.MAX_VALUE;
        
        int min = node.data;

        for(Node child : node.children){
            int val = minimum(child);
            if(min > val) min = val;
        }
        return min;
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

        Node root = constructor(arr);
        Display(root);

        System.out.println("Size of Tree : " + Size(root));
        System.out.println("maximum of Tree : " + maximum(root));
        System.out.println("minimum of Tree : " + minimum(root));
    }
}