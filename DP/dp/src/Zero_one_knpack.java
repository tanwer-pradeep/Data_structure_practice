package dp.src;
import java.util.Scanner;

public class Zero_one_knpack {
 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int vls[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            vls[i] = scn.nextInt();
        }
        int wts[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        
        System.out.println(zeroOneKnapsack(wts,vls,cap));
        scn.close();
    }
    
    public static int zeroOneKnapsack(int wts[],int vls[],int cap){
        int nr = wts.length + 1;
        int nc = cap + 1;
        
        int[][] ans = new int[nr][nc];
        
        for(int r = 1; r < nr; r++){
            int wt = wts[r - 1];
            int val = vls[r - 1];
            for(int c = 1; c < nc; c++){
                int exc = ans[r-1][c];
                int inc = (c-wt >= 0)? (val + ans[r-1][c-wt]) : 0;
                ans[r][c] = Math.max(exc,inc);
            }
        }

        return ans[nr-1][nc-1];
    }

}
