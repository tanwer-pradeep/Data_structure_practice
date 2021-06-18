// ref :- https://leetcode.com/problems/remove-duplicates-from-sorted-array/


public class Remove_duplicates {

    public static void main(String[] args) {
//         int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }

    }

    public int removeDuplicates(int[] nums) {
        int ans = 0;
        if (nums.length != 0) {
            for (int i = 0, j = 0; j < nums.length;) {
                if (nums[i] == nums[j]) {
                    j++;
                } else {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                    i++;
                    ans++;
                    j++;
                }
            }
        }

        return ans + 1;
    }
}
