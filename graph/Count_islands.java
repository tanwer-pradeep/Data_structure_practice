import java.io.*;
import java.util.*;

public class Count_islands {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }
      System.out.println(numberofisland(arr));

      // write your code here
   }
   
   public static int numberofisland(int arr[][]){
       int nr = arr.length, nc = arr[0].length;
       boolean visited [][] = new boolean[nr][nc];
       int count = 0;
       
       for(int i = 0; i < nr; i++){
           for(int j = 0; j < nc; j++){
               if(arr[i][j] == 0 && visited[i][j] == false){
                   gcc(arr,visited,i,j);
                   count++;
               }
           }
       }
       
       return count;
   }
   
   public static void gcc(int[][] arr, boolean[][] visited, int r, int c){
       if(r < 0 || c < 0 || r >= arr.length|| c >= arr[0].length||arr[r][c] == 1 || visited[r][c] == true) return;
       
       visited[r][c] = true;
       gcc(arr,visited,r-1,c);
       gcc(arr,visited,r,c + 1);
       gcc(arr,visited,r,c - 1);
       gcc(arr,visited,r+1,c);
   }
    
}