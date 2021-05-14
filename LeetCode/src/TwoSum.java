import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            ans[0] = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[ans[0]] + nums[j] == target){
                    ans[1] = j;
                    return ans;
                }
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        int[] ans = twoSum(arr, target);
        // System.out.println(twoSum(arr, target));

        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

        scn.close();
    }

}
