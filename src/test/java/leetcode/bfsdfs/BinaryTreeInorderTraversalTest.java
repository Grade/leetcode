package leetcode.bfsdfs;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BinaryTreeInorderTraversalTest {

  /*
    1
     \
      2
     /
    3
     */
  @Test
  void inorderTraversal_1() {
    BinaryTreeInorderTraversal sut = new BinaryTreeInorderTraversal();
    TreeNode node3 = new TreeNode(3);
    TreeNode node2 = new TreeNode(2, node3, null);
    TreeNode root = new TreeNode(1, null, node2);

    assertIterableEquals(Arrays.asList(1, 3, 2), sut.inorderTraversal(root));
  }

  /*
                     1
                   /   \
                  2     3
                 / \     \
                4   5     8
                   / \   /
                  6   7  9
   */
  @Test
  void inorderTraversal_2() {
    BinaryTreeInorderTraversal sut = new BinaryTreeInorderTraversal();
    TreeNode node9 = new TreeNode(9);
    TreeNode node8 = new TreeNode(8, node9, null);
    TreeNode node3 = new TreeNode(3, null, node8);

    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);
    TreeNode node5 = new TreeNode(5, node6, node7);
    TreeNode node4 = new TreeNode(4);
    TreeNode node2 = new TreeNode(2, node4, node5);

    TreeNode root = new TreeNode(1, node2, node3);

    assertIterableEquals(Arrays.asList(4, 2, 6, 5, 7, 1, 3, 9, 8), sut.inorderTraversal(root));
  }

  @Test
  void inorderTraversal_3() {
    BinaryTreeInorderTraversal sut = new BinaryTreeInorderTraversal();
    TreeNode root = new TreeNode(1);

    assertIterableEquals(Arrays.asList(1), sut.inorderTraversal(root));
  }

  @Test
  void inorderTraversal_4() {
    BinaryTreeInorderTraversal sut = new BinaryTreeInorderTraversal();

    assertTrue(sut.inorderTraversal(null).isEmpty());
  }
}