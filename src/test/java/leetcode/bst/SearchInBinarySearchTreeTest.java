package leetcode.bst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import leetcode.bfsdfs.TreeNode;
import org.junit.jupiter.api.Test;

//todo tests are pathetic. Maybe one day I'll write an assertion function to compare trees
class SearchInBinarySearchTreeTest {

  @Test
  void searchBST_1() {
    SearchInBinarySearchTree sut = new SearchInBinarySearchTree();
    TreeNode res = sut.searchBST(tree(), 2);

    assertEquals(2, res.val);
  }

  @Test
  void searchBST_2() {
    SearchInBinarySearchTree sut = new SearchInBinarySearchTree();
    TreeNode res = sut.searchBST(tree(), 5);

    assertNull(res);
  }

  private TreeNode tree() {
    return new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
  }
}