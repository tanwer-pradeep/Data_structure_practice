import java.util.*;

public class Graph_creation {

    public static class Edge{
        int src, dest, wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        public String toString(){
            return src + " --> " + dest + " @ " +wt;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //no of vertices
        int n = scn.nextInt();

        // no of edges
        int e = scn.nextInt();

        //array to store data of vertices
        // array of type arraylist
        ArrayList<Edge>[] arr = new ArrayList[n];

        // handeling null point exception at array

        for(int i = 0; i < n; i++){
            arr[i] = new ArrayList();
        }

        // accepting n inputs of vertices
        for(int i = 0; i < e; i++){
            int src = scn.nextInt();
            int dest = scn.nextInt();
            int wt = 0;
            arr[src].add(new Edge(src,dest,wt));
            arr[dest].add(new Edge(dest, src, wt));
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " --> " + arr[i]);
        }
    }
}
