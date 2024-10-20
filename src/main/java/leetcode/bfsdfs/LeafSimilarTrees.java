package leetcode.bfsdfs;

import java.util.ArrayList;
import java.util.List;

class LeafSimilarTrees {

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> root1Leaves = new ArrayList<>();
    List<Integer> root2Leaves = new ArrayList<>();

    helper(root1, root1Leaves);
    helper(root2, root2Leaves);

    return root1Leaves.equals(root2Leaves);
  }

  void helper(TreeNode node, List<Integer> list) {
    if (node.left == null && node.right == null) {
      list.add(node.val);
    } else {
      if (node.left != null) {
        helper(node.left, list);
      }
      if (node.right != null) {
        helper(node.right, list);
      }
    }
  }
}
