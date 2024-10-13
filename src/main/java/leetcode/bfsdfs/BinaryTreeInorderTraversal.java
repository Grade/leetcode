package leetcode.bfsdfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinaryTreeInorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    List<Integer> traverseList = new ArrayList<>();
    func(root, traverseList);
    return traverseList;
  }

  private void func(TreeNode root, List<Integer> list) {
    if (root.left != null) {
      func(root.left, list);
    }
    list.add(root.val);
    if (root.right != null) {
      func(root.right, list);
    }
  }

}
