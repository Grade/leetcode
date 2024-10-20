package leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SwapNodesInPairsTest {

  static Stream<Arguments> provideParameters() {
    return Stream.of(
        Arguments.of(
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))),
            new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))))
        ),
        Arguments.of(
            new ListNode(1, new ListNode(2, new ListNode(3))),
            new ListNode(2, new ListNode(1, new ListNode(3)))
        ),
        Arguments.of(null, null),
        Arguments.of(new ListNode(1), new ListNode(1))
    );
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  void swapPairs(ListNode head, ListNode expected) {
    SwapNodesInPairs sut = new SwapNodesInPairs();

    ListNode result = sut.swapPairs(head);

    assertEquals(expected, result);
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  void swapPairsRecursive(ListNode head, ListNode expected) {
    SwapNodesInPairs sut = new SwapNodesInPairs();

    ListNode result = sut.swapPairsRecursive(head);

    assertEquals(expected, result);
  }
}