package leetcode.linkedlist;

import leetcode.linkedlist.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseLinkedListTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, prepareNode(new int[]{1, 2, 3, 4, 5})),
                Arguments.of(new int[]{1, 2}, prepareNode(new int[]{1, 2})),
                Arguments.of(new int[]{}, null)
        );
    }

    static ListNode prepareNode(int[] initial) {
        ListNode head = null;
        for (int i = initial.length - 1; i >= 0; i--) {
            head = new ListNode(initial[i], head);
        }
        return head;
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testReverseList(int[] initial, ListNode head) throws Exception {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode newHead = solution.reverseList(head);

        int i = initial.length - 1;
        while (newHead.next != null) {
            Assertions.assertEquals(initial[i], newHead.val);
            i--;
            newHead = newHead.next;
        }
    }
}