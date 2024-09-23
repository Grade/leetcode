package leetcode.arrays;

import java.util.TreeSet;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> minHeap = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > 3) {
                minHeap.pollFirst();
            }
        }
        return minHeap.size() == 3 ? minHeap.first() : minHeap.last();
    }
}
