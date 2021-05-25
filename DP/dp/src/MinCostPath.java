package dp.src;
import java.util.Scanner;

public class MinCostPath {

    public static int mincost(int[][] cost){
        int nr = cost.length;
        int nc = cost[0].length;
        int [][] ans = new int[nr][nc];

        
        
        


        return ans[0][0];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int[][] cost = new int[nr][nc];

        for(int i = 0; i < nr; i++){
            for(int j = 0; j < nc; j++){
                cost[i][j] = scn.nextInt();
            }
        }

        System.out.println(mincost(cost));
        scn.close();
    }
}
