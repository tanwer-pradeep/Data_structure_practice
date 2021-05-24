package dp;
import java.util.Scanner;

public class Multijumps {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(paths(arr));;
        scn.close();
    }

    public static int paths(int[] arr){
        int n = arr.length;
        int[] ans = new int[n + 1];


        for(int i = n; i >= 0; i--){
            if(i == n) ans[i] = 1;
            else{
                int maxjmp = arr[i];
                if(maxjmp == 0){
                    ans[i] = 0;
                }else{
                    for(int j = 1; j <= maxjmp && i + j < n; j++){

                        ans[i] += ans[i + j];
                    }
                }
            }
        }
        return ans[0];
    }
}
