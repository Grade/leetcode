package leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseLinkedListTest {

  static Stream<Arguments> provideParameters() {
    return Stream.of(
        Arguments.of(
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
            new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))
        ),
        Arguments.of(
            new ListNode(1, new ListNode(2)),
            new ListNode(2, new ListNode(1))
        ),
        Arguments.of(null, null)
    );
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  public void reverseList(ListNode input, ListNode expected) {
    ReverseLinkedList solution = new ReverseLinkedList();

    assertEquals(expected, solution.reverseList(input));
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  public void reverseRecursive(ListNode input, ListNode expected) {
    ReverseLinkedList solution = new ReverseLinkedList();

    assertEquals(expected, solution.reverseRecursive(input));
  }
}