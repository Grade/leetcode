package leetcode.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int lastIndex = nums.length - 1;
        int currentIndex = 0;
        do {
            if (nums[currentIndex] == val) {
                nums[currentIndex] = -1;
                int tmp = nums[lastIndex];
                nums[lastIndex] = nums[currentIndex];
                nums[currentIndex] = tmp;
                lastIndex--;
            } else {
                currentIndex++;
            }
        } while (currentIndex <= lastIndex);
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                break;
            } else {
                k++;
            }
        }
        return k;
    }
}
