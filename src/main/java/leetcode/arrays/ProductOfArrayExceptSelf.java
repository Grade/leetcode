package leetcode.arrays;

class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int[] products = new int[nums.length];
    products[0] = 1;
    //first we fill the array with prefix products
    //[a,b,c,d] -> [1,a,ab,abc]
    for (int i = 1; i < nums.length; i++) {
      products[i] = products[i - 1] * nums[i - 1];
    }
    /*
    then we go backwards and multiply current element to suffix
    suff = d, [1,a,ab,abc] => [1,a,abd,abc]
    suff = cd, [1,a,abd,abc] => [1,acd,abd,abc]
    suff = bcd, [1,acd,abd,abc] => [bcd,acd,abd,abc]
    */
    int suffix = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      products[i] = products[i] * suffix;
      suffix = suffix * nums[i];
    }
    return products;
  }
}
