package leetcode.bfsdfs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {

  /*
            3
          /   \
         9     20
              / \
             15  7
   */
  @Test
  void maxDepth_1() {
    TreeNode node9 = new TreeNode(9);
    TreeNode node15 = new TreeNode(15);
    TreeNode node7 = new TreeNode(7);
    TreeNode node20 = new TreeNode(20, node15, node7);
    TreeNode root = new TreeNode(3, node9, node20);

    MaximumDepthOfBinaryTree sut = new MaximumDepthOfBinaryTree();
    assertEquals(3, sut.maxDepth(root));
  }

  /*
   1
    \
     2
   */
  @Test
  void maxDepth_2() {
    TreeNode node2 = new TreeNode(2);
    TreeNode root = new TreeNode(1, null, node2);

    MaximumDepthOfBinaryTree sut = new MaximumDepthOfBinaryTree();
    assertEquals(2, sut.maxDepth(root));
  }

  @Test
  void maxDepth_3() {
    MaximumDepthOfBinaryTree sut = new MaximumDepthOfBinaryTree();
    assertEquals(0, sut.maxDepth(null));
  }
}
