import java.io.*;
import java.util.*;

public class Main {
   
    static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt){
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int k = scn.nextInt();
      
      ArrayList<Edge>[] graph = new ArrayList[n];
      for(int i = 0; i < n; i++){
         graph[i] = new ArrayList<>();
      }

      for(int i = 0; i < k; i++){
         int v1 = scn.nextInt();
         int v2 = scn.nextInt();
         int wt = 0;
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
      
      
   }

}
