package leetcode.bst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import leetcode.bfsdfs.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidateBinarySearchTreeTest {

  static Stream<Arguments> provideParameters() {
    return Stream.of(
        Arguments.of(
            new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3)),
            true),
        Arguments.of(
            new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4,
                    new TreeNode(3),
                    new TreeNode(6))),
            false
        ),
        Arguments.of(new TreeNode(1), true),
        Arguments.of(
            new TreeNode(2, new TreeNode(2), new TreeNode(2)),
            false),
        Arguments.of(
            new TreeNode(5,
                new TreeNode(4),
                new TreeNode(6,
                    new TreeNode(3),
                    new TreeNode(7))),
            false
        ),
        Arguments.of(
            new TreeNode(120,
                new TreeNode(70,
                    new TreeNode(50,
                        new TreeNode(20),
                        new TreeNode(55)),
                    new TreeNode(100,
                        new TreeNode(75),
                        new TreeNode(110))),
                new TreeNode(140,
                    new TreeNode(130,
                        new TreeNode(119),
                        new TreeNode(135)),
                    new TreeNode(160,
                        new TreeNode(150),
                        new TreeNode(200)))),
            false
        ),
        Arguments.of(
            new TreeNode(-2147483648,
                null,
                new TreeNode(2147483647)),
            true
        )
    );
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  void isValidBST(TreeNode root, boolean expected) {
    ValidateBinarySearchTree sut = new ValidateBinarySearchTree();
    assertEquals(expected, sut.isValidBST(root));
  }
}