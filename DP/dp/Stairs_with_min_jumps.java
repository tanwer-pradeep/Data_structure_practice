package dp;
import java.util.Scanner;

public class Stairs_with_min_jumps {

    public static int minsteps(int[] arr){
        int m = arr.length;
        int[] ans = new int[m+1];

        for(int i = m; i >= 0; i--){
            if(i == m) ans[i] = 0;
            int maxjmps = arr[i];
            if(maxjmps == 0) ans[i] = Integer.MAX_VALUE;
            else{
                int minstep = Integer.MAX_VALUE;
                for(int j = 1; j < maxjmps && i + j <= m; j++){
                    minstep = Math.min(minstep, ans[j+i]);
                }
                if(minstep == Integer.MAX_VALUE) ans[i] = Integer.MAX_VALUE;
                else ans[i] = minstep + 1;
            }
        }



        return ans[0];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 1; i < n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(minsteps(arr));
        scn.close();
    }
}
