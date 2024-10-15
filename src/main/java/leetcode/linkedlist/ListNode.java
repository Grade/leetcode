package leetcode.linkedlist;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ListNode implements Iterable<ListNode> {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  //basically, copy pasted from LinkedList#equals
  public boolean equals(Object o) {
    Iterator<ListNode> e1 = iterator();
    Iterator<ListNode> e2 = ((ListNode) o).iterator();
    while (e1.hasNext() && e2.hasNext()) {
      ListNode o1 = e1.next();
      ListNode o2 = e2.next();
      if (o1.val != o2.val) {
        return false;
      }
    }
    return !(e1.hasNext() || e2.hasNext());
  }

  @Override
  public String toString() {
    return StreamSupport.stream(this.spliterator(), false)
        .map(node -> String.valueOf(node.val))
        .collect(Collectors.joining("->", "[", "]"));
  }

  @Override
  public Iterator<ListNode> iterator() {
    return new ListNodeIterator();
  }

  class ListNodeIterator implements Iterator<ListNode> {

    private ListNode cursor = ListNode.this;

    @Override
    public boolean hasNext() {
      return cursor != null;
    }

    @Override
    public ListNode next() {
      ListNode next = cursor;
      cursor = cursor.next;
      return next;
    }
  }
}
