import java.io.*;
import java.util.*;

public class Is_graph_cyclic {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static boolean isGraphCyclic(ArrayList<Edge>[] graph){
       boolean visited[] = new boolean[graph.length];

       for(int i = 0; i < graph.length; i++){
           if(visited[i] == false){
               boolean res = IsComponentCyclic(graph, i, visited);
               if(res) return true;
           }
       }
       return false;
   }

   public static boolean IsComponentCyclic(ArrayList<Edge>[] graph, int src, boolean visited[]){
        Queue<Integer> qu = new ArrayDeque<>();

        qu.add(src);
        while(qu.size() > 0){
            int fpair = qu.remove();
            if(visited[fpair] == false){
                visited[fpair] = true;

                for(Edge e : graph[fpair]){
                    if(visited[e.nbr] == false){
                        qu.add(e.nbr);
                    }
                }
            }
            else return true;
        }

        return false;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

    //   int src = Integer.parseInt(br.readLine());

      // write your code here  
      System.out.println(isGraphCyclic(graph));
   }
}