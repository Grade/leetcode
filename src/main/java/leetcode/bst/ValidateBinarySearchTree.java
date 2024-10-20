package leetcode.bst;

import leetcode.bfsdfs.TreeNode;

class ValidateBinarySearchTree {

  private long lastTraversedValue = Long.MIN_VALUE;

  public boolean isValidBST(TreeNode root) {
    if (root.left == null && root.right == null) {
      return true;
    }
    try {
      func(root);
      return true;
    } catch (IllegalArgumentException e) {
      return false;
    }
  }

  private void func(TreeNode current) {
    if (current.left != null) {
      func(current.left);
    }
    if (current.val <= lastTraversedValue) {
      throw new IllegalArgumentException();
    }
    lastTraversedValue = current.val;
    if (current.right != null) {
      func(current.right);
    }
  }
}
