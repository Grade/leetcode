package leetcode.bst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import leetcode.bfsdfs.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MinimumAbsoluteDifferenceInBSTTest {

  static Stream<Arguments> parameters() {
    return Stream.of(
        Arguments.of(
            new TreeNode(4,
                new TreeNode(2,
                    new TreeNode(1),
                    new TreeNode(3)),
                new TreeNode(6)),
            1),
        Arguments.of(
            new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48,
                    new TreeNode(12),
                    new TreeNode(49))),
            1),
        Arguments.of(new TreeNode(543,
                new TreeNode(384,
                    null,
                    new TreeNode(445)),
                new TreeNode(652,
                    null,
                    new TreeNode(699))),
            47),
        Arguments.of(new TreeNode(236,
                new TreeNode(104,
                    null,
                    new TreeNode(227)),
                new TreeNode(701,
                    null,
                    new TreeNode(911))),
            9)
    );
  }

  @ParameterizedTest
  @MethodSource("parameters")
  void getMinimumDifference(TreeNode root, int expected) {
    MinimumAbsoluteDifferenceInBST sut = new MinimumAbsoluteDifferenceInBST();
    assertEquals(expected, sut.getMinimumDifference(root));
  }
}