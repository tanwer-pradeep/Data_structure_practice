package dp.src;
import java.util.*;

public class goldmine2 {

 public static int maxgold(int[][] mine){
        int nr = mine.length, nc = mine[0].length;
        int[][] dp = new int[nr][nc];

        for(int c = nc - 1; c >= 0; c--){
            for(int r = 0; r < nr; r++){
                if(c == nc - 1){
                    dp[r][c] = mine[r][c];
                }else{
                    if(r == 0){
                        dp[r][c] = Math.max(dp[r][c+1], dp[r+1][c+1]) + mine[r][c];
                    }else if(r == nr -1){
                        dp[r][c] = Math.max(dp[r][c+1], dp[r - 1][c+1]) + mine[r][c];
                    }else{
                        dp[r][c] = Math.max(Math.max(dp[r][c+1], dp[r+1][c+1]), dp[r-1][c+1]) + mine[r][c];
                    }
                }
            }
        }

        
        for(int i = 0; i < nr; i++){
            for(int j = 0; j < nc; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int ans = 0;
        for(int r = 0; r < nr; r++){
            ans = Math.max(ans, dp[r][0]);
        }
        return ans;
        // return 0;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        // int nc = scn.nextInt();

        int [][] mine = new int[nr][nr];

        for(int i = 0; i < nr; i++){
            for(int j = 0; j< nr; j++){
                mine[i][j] = scn.nextInt();
            }
        }
        System.out.println(maxgold(mine));
        scn.close();
    }
}