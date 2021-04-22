package Generic_tree;

public class Size_function {
    public static int size(Node node){

        int res = 0;
        for(Node child : node.Children){
            res += size(child);
        }
        return res + 1;
    }
}
