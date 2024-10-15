package leetcode.strings;

class ReverseString {

  public void reverseString(char[] s) {
    int leftIndex = 0;
    int rightIndex = s.length - 1;
    while (leftIndex < rightIndex) {
      char tmp = s[leftIndex];
      s[leftIndex] = s[rightIndex];
      s[rightIndex] = tmp;
      leftIndex++;
      rightIndex--;
    }
  }

  public void reverseStringRecursive(char[] s) {
    helper(s, 0, s.length - 1);
  }

  private void helper(char[] s, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
      char tmp = s[leftIndex];
      s[leftIndex] = s[rightIndex];
      s[rightIndex] = tmp;
      helper(s, ++leftIndex, --rightIndex);
    }
  }
}
