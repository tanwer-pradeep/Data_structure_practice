package binary_search_tree;

import java.util.ArrayList;

public class Node_to_root {
    public static ArrayList<Integer> node_to_root(BST_size.Node node, int data){
        if(node == null){
            return new ArrayList<>();
        }

        if(node.data == data){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(data);
            return al;
        }

        ArrayList<Integer> lres = node_to_root(node.left, data);
        if(lres.size() > 0){
            lres.add(node.data);
            return lres;
        }

        ArrayList<Integer> rres = node_to_root(node.left, data);
        if(rres.size() > 0){
            rres.add(node.data);
            return rres;
        }

        return new ArrayList<>();
    }
}
