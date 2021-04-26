package binary_search_tree;

public class BST_sum {
    public static int sum(BST_size.Node node){
        if(node == null){
            return 0;
        }
        int lsum = sum(node.left);
        int rsum = sum(node.right);

        return(lsum + rsum + node.data);

    }
}
