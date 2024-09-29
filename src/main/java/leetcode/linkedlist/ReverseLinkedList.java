package leetcode.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode(head.val);
        while (head.next != null) {
            newHead = new ListNode(head.next.val, newHead);
            head = head.next;
        }
        return newHead;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
