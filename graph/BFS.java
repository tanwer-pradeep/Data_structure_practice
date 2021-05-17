import java.io.*;
import java.util.*;

public class BFS {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static class Pair{
       int src;
       String psf;
       Pair(int src, String psf){
           this.src = src;
           this.psf = psf;
       }
   }

   public static void BFS(ArrayList<Edge>[] graph, int src){
        Queue<Pair> qu = new ArrayDeque<>();

        qu.add(new Pair(src, "" + src));
        boolean [] visited = new boolean[graph.length];
        while(qu.size() > 0){
            Pair fpair = qu.remove();
            if(visited[fpair.src] == false){
                visited[fpair.src] = true;
                System.out.println(fpair.src + "@" + fpair.psf);

                for(Edge e : graph[fpair.src]){
                    if(visited[e.nbr] == false){
                        qu.add(new Pair(e.nbr, fpair.psf + e.nbr));
                    }
                }
            }
        }
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

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      BFS(graph,src);
   }
}