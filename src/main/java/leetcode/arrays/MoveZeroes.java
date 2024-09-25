package leetcode.arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int leastRecentZeroIndex = -1;
        for (int i = 0; i < nums.length && leastRecentZeroIndex == -1; i++) {
            if (nums[i] == 0) {
                leastRecentZeroIndex = i;
            }
        }
        if (leastRecentZeroIndex == -1) {
            return;
        }
        for (int i = leastRecentZeroIndex + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[leastRecentZeroIndex] = nums[i];
                nums[i] = 0;
                leastRecentZeroIndex++;
            }
        }
    }
}
