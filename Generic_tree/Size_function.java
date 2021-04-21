package Generic_tree;
// import java.util.Scanner;

// import java.util.ArrayList;

import Generic_tree.concepts.*;

public class Size_function {

    public static int main(Node node) {
       return size(node);
       
    }
    
    // public static class Node{
    //     int data;
    //     ArrayList<Node> Children = new ArrayList<Node>();
    // }
    public static int size(Node node){

        int res = 0;
        for(Node child : node.Children){
            size(child);
        }
        return res + 1;
    }
}
