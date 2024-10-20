package leetcode.linkedlist;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode newHead = new ListNode(head.val);
    while (head.next != null) {
      //todo uses extra space because new list node is created. Rewrite it
      newHead = new ListNode(head.next.val, newHead);
      head = head.next;
    }
    return newHead;
  }

  public ListNode reverseRecursive(ListNode head) {
    if (head == null) {
      return null;
    }
    return f(head, head);
  }

  ListNode f(ListNode currentHead, ListNode currentNode) {
    if (currentNode.next == null) {
      return currentHead;
    }
    ListNode newHead = currentNode.next;
    currentNode.next = newHead.next;
    newHead.next = currentHead;
    return f(newHead, currentNode);
  }
}
