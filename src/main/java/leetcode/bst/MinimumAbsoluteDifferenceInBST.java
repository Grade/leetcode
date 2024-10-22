package leetcode.bst;

import leetcode.bfsdfs.TreeNode;

class MinimumAbsoluteDifferenceInBST {

  private int min = Integer.MAX_VALUE;

  public int getMinimumDifference(TreeNode root) {
    inorderTraversal(root, new TreeNode[]{null});
    return min;
  }

  private void inorderTraversal(TreeNode current, TreeNode[] lastInorder) {
    if (min == 1) {
      return; // stop traversing at this point since min diff can't be smaller than 1
    }
    if (current.left != null) {
      inorderTraversal(current.left, lastInorder);
    }
    min = lastInorder[0] != null ? Math.min(min, current.val - lastInorder[0].val) : min;
    lastInorder[0] = current;
    if (current.right != null) {
      inorderTraversal(current.right, lastInorder);
    }
  }
}
