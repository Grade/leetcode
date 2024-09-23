package leetcode.arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
//        System.out.println("input " + Arrays.toString(nums));
        //first set all duplicated elements to -101
        int lastMetElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == lastMetElement) {
                nums[i] = -101;
            } else {
                lastMetElement = nums[i];
            }
        }
//        System.out.println("after nullification:" + Arrays.toString(nums));

        int firstNullableIndex = -1;
        for (int i = 1; i < nums.length && firstNullableIndex == -1; i++) {
            if (nums[i] == -101) {
                firstNullableIndex = i;
            }
        }
        if (firstNullableIndex == -1) {
            return nums.length;
        }
//        System.out.println("firstNullableIndex " + firstNullableIndex);
        for (int i = firstNullableIndex + 1; i < nums.length; i++) {
            if (nums[i] != -101) {
                int tmp = nums[i];
                nums[i] = -101;
                nums[firstNullableIndex] = tmp;
                firstNullableIndex++;
            }
//            System.out.println(Arrays.toString(nums));
        }
        return firstNullableIndex;
    }
}
