package leetcode.bfsdfs;

class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return subtreeDepth(root);
  }

  private int subtreeDepth(TreeNode root) {
    int leftSize = root.left == null ? 0 : subtreeDepth(root.left);
    int rightSize = root.right == null ? 0 : subtreeDepth(root.right);
    return 1 + Math.max(leftSize, rightSize);
  }
}
