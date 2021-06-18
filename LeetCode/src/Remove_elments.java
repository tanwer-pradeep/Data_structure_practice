public class Remove_elments {
    //ref :- https://leetcode.com/problems/remove-element/
    
    public int removeElement(int[] nums, int val) {
        int ans = 0;

        for(int i = 0, j = 0; j < nums.length;){

            if(nums[j] == val) j++;
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
                ans++; 
            }
        }


        return ans;
    }
}
