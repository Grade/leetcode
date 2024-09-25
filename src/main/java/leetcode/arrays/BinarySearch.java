package leetcode.arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        do {
            int pivotIndex = (startIndex + endIndex) / 2;
            int pivotElem = nums[pivotIndex];
            if (target == pivotElem) {
                return pivotIndex;
            } else if (target < pivotElem) {
                endIndex = pivotIndex - 1;
            } else {
                startIndex = pivotIndex + 1;
            }
        } while (startIndex <= endIndex);
        return -1;
    }
}
