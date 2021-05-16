public class remove_elements {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int len = 0;
            if(nums.length == 0) return len;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != val){
                    nums[len] = nums[i];
                    len++;
                }
            }
            return len;
        }
    }
}
