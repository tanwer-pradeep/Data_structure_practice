package Generic_tree;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

// first file, contains an overview of a generic tree and its properties.
// generally used to store generic type of data / hereditary data.
// all trees are graph.

public class concepts{

    static Node root;
    public static Node constructor(int[] a){
        Node root = null;
        Stack<Node> st = new Stack<Node>();

        for(int i = 0; i < a.length; i++){
            if(a[i] == -1){
                st.pop();
            }else{
                Node t = new Node();
                t.data = a[i];

                if(st.size() > 0){
                    st.peek().Children.add(t);
                }else{
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }


    public static void display(Node node){
        if(node.Children.size() == 0){
            return;
        }

        System.out.print(node.data + " >");
        for(Node child : node.Children){
            System.out.print(child.data + " ");  
        }
        System.out.println();

        for(Node child : node.Children){
            display(child);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n]; 

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        root = constructor(arr);

        display(root);
        System.out.println(Size_function.size(root));

        scn.close();
    }
}