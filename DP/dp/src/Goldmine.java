package dp.src;
import java.util.Scanner;

public class Goldmine
 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] goldmine = new int[n][m];
        for(int c = 0; c < n; c++){
            for(int r = 0; r < m; r++){
                goldmine[c][r] = scn.nextInt();
            }
        }


        System.out.println(Solution(goldmine));
        scn.close();
    }


    public static int Solution(int[][] goldmine){
        int nr = goldmine.length, nc = goldmine[0].length;
        int[][] solution = new int[nr][nc];

        if(nr == 1) {
            for(int j = nc - 1; j >= 0; j--){
                if(j == nc - 1) solution[0][j] = goldmine[0][j];
                else solution[0][j] += goldmine[0][j] + solution[0][j+1];
            }
        }
        else{
            for(int c = nc- 1; c >= 0; c--){
                for(int r = nr - 1; r >= 0; r--){
                    if(c == nc -1) solution[r][c] = goldmine[r][c];
                    else{
                        if(r == 0) solution[r][c] = Math.max(solution[r][c+1], solution[r + 1][c+1]) + goldmine[r][c];
                        else if(r == nr - 1)solution[r][c] = Math.max(solution[r][c+1], solution[r - 1][c+1]) + goldmine[r][c];
                        else solution[r][c] = Math.max(Math.max(solution[r][c+1], solution[r+1][c+1]), solution[r-1][c+1]) + goldmine[r][c];
                    }
                }
            }
        }


        for(int i = 0; i < nr; i++){
            for(int j = 0; j < nc; j++){
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nr; i++){
            ans = Math.max(ans, solution[i][0]);
        }
        return ans;
    }
}
