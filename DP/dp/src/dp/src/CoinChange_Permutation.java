package dp.src;

import java.util.Scanner;

public class CoinChange_Permutation{

    public static int Solution(int[] arr, int tar){

        int[] dp = new int[tar + 1];

        for(int c = 0; c <= tar; c++){
            if(c == 0) dp[c] = 1;

            else{
                for(int coin : arr){
                    if(c >= coin){
                        dp[c] += dp[c-coin];
                    }
                }
            }
        }
        return dp[tar];
    }
    


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        System.out.println(Solution(arr, tar));

        scn.close();
    }
}