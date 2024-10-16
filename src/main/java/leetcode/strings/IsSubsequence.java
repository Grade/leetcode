package leetcode.strings;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int sPointer = 0;
        for (int tPointer = 0; tPointer < t.length() && sPointer < s.length(); tPointer++) {
            if (t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer++;
            }
        }
        return sPointer == s.length();
    }
}
