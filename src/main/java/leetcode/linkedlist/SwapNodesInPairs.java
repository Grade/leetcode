package leetcode.linkedlist;

class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    //swap first two nodes
    // swap() method is not used here because there is no node before head, and a null check is never necessary for other nodes
    ListNode newHead = head.next;
    head.next = newHead.next;
    newHead.next = head;

    ListNode cursor = head; //former head in now a cursor after the first swap
    while (cursor.next != null && cursor.next.next != null) {
      swap(cursor, cursor.next, cursor.next.next);
      cursor = cursor.next.next;
    }
    return newHead;
  }

  void swap(ListNode preLeft, ListNode left, ListNode right) {
    left.next = right.next;
    right.next = left;
    preLeft.next = right;
  }
}
