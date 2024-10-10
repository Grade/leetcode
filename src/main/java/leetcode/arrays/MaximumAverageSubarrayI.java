package leetcode.arrays;

class MaximumAverageSubarrayI {

  public double findMaxAverage(int[] nums, int k) {
    int prevSum = 0;
    for (int i = 0; i < k; i++) {
      prevSum += nums[i];
    }
    int maxSum = prevSum;
    for (int i = 1; i <= nums.length - k; i++) {
      prevSum = prevSum - nums[i - 1] + nums[i + k - 1];
      maxSum = Math.max(maxSum, prevSum);
    }
    return maxSum * 1.0 / k;
  }
}
