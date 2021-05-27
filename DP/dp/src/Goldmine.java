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

        for(int c = solution[0].length - 1; c >= 0; c--){
            for(int r = solution.length - 1; r >= 0; r--){
                if(c == nc -1) solution[r][c] = goldmine[r][c];
                else{
                    if(r == 0) solution[r][c] = Math.max(solution[r][c+1], solution[r + 1][c+1]) + goldmine[r][c];
                    else if(r == nr - 1)solution[r][c] = Math.max(solution[r][c+1], solution[r - 1][c+1]) + goldmine[r][c];
                    else solution[r][c] = Math.max(Math.max(solution[r][c+1], solution[r+1][c+1]), solution[r-1][c+1]) + goldmine[r][c];
                }
            }
        }


        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nr; i++){
            ans = Math.max(ans, solution[i][0]);
        }
        return ans;
    }
}
