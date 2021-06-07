package dp.src;
import java.util.Scanner;

public class Unbounded {
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
        
        System.out.println(unboundedKnapsack(wts,vls,cap));
        scn.close();
        
    }

    public static int unboundedKnapsack(int[] wts, int[] val, int cap){
        int[] ans = new int[cap + 1];

        for(int i = 0; i < ans.length; i++){

        }
        return ans[cap];
    }
}
