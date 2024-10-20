package leetcode.bfsdfs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LeafSimilarTreesTest {

  @Test
  void leafSimilar_1() {
    TreeNode node2_1 = new TreeNode(2);
    TreeNode node3_1 = new TreeNode(3);
    TreeNode root_1 = new TreeNode(1, node2_1, node3_1);

    TreeNode node3_2 = new TreeNode(3);
    TreeNode node2_2 = new TreeNode(2);
    TreeNode root_2 = new TreeNode(1, node3_2, node2_2);

    LeafSimilarTrees sut = new LeafSimilarTrees();
    assertFalse(sut.leafSimilar(root_1, root_2));
  }

  @Test
  void leafSimilar_2() {
    TreeNode node2_1 = new TreeNode(2);
    TreeNode node3_1 = new TreeNode(3);
    TreeNode root_1 = new TreeNode(1, node2_1, node3_1);

    TreeNode node2_2 = new TreeNode(2);
    TreeNode node3_2 = new TreeNode(3);
    TreeNode root_2 = new TreeNode(1, node2_2, node3_2);

    LeafSimilarTrees sut = new LeafSimilarTrees();
    assertTrue(sut.leafSimilar(root_1, root_2));
  }

  @Test
  void leafSimilar_3() {
    TreeNode node9_1 = new TreeNode(9);
    TreeNode node8_1 = new TreeNode(8);
    TreeNode node1_1 = new TreeNode(1, node9_1, node8_1);
    TreeNode node6_1 = new TreeNode(6);
    TreeNode node7_1 = new TreeNode(7);
    TreeNode node4_1 = new TreeNode(4);
    TreeNode node2_1 = new TreeNode(2, node7_1, node4_1);
    TreeNode node5_1 = new TreeNode(5, node6_1, node2_1);
    TreeNode root1 = new TreeNode(3, node5_1, node1_1);

    TreeNode node6_2 = new TreeNode(6);
    TreeNode node7_2 = new TreeNode(7);
    TreeNode node5_2 = new TreeNode(5, node6_2, node7_2);
    TreeNode node9_2 = new TreeNode(9);
    TreeNode node8_2 = new TreeNode(8);
    TreeNode node2_2 = new TreeNode(2, node9_2, node8_2);
    TreeNode node4_2 = new TreeNode(4);
    TreeNode node1_2 = new TreeNode(1, node4_2, node2_2);
    TreeNode root2 = new TreeNode(3, node5_2, node1_2);

    LeafSimilarTrees sut = new LeafSimilarTrees();
    assertTrue(sut.leafSimilar(root1, root2));
  }
}