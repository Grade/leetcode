package leetcode.arrays;

import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexPerValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { //O(n)
            int diff = target - nums[i];
            Integer index = indexPerValue.get(diff); //O(1)
            if (index != null) {
                return new int[]{i, index};
            } else {
                indexPerValue.put(nums[i], i); //0(1)
            }
        }
        throw new IllegalArgumentException();
    }
}
