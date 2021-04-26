package binary_search_tree;
import java.util.Stack;

public class Pre_in_post {

    static String pre = "";
    static String in = "";
    static String post = "";

    public static void print(BST_size.Node node){
        Stack<BST_size.Pair> st = new Stack<>();
        st.push(new BST_size.Pair(node, 0));
        while(st.size() != 0){
            BST_size.Pair top = st.peek();
            if(top.state == 0){
                pre += top.node.data + " ";
                if(top.node.left != null){
                    st.push(new BST_size.Pair(top.node.left, 0));
                }
                top.state++;
            }else if(top.state == 1){
                in += top.node.data + " ";
                if(top.node.right != null){
                    st.push(new BST_size.Pair(top.node.right, 0));
                }
                top.state++;
            }else{
                post += top.node.data + " ";
                st.pop();
            }

            
            
        }
        System.out.println("Pre : - " + pre);
        System.out.println("in : - " + in);
        System.out.println("Post : - " + post);

    }



}
