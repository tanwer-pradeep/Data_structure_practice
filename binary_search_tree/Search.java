package binary_search_tree;

public class Search{
    public static boolean search(BST_size.Node node, int data){
        if(node == null){
            return false;
        }else if(node.data == data){
            return true;
        }

        boolean lres = search(node.left, data);
        if(lres) return true;
        boolean rres = search(node.right, data);
        if(rres) return true;

        return false;

    }
}
