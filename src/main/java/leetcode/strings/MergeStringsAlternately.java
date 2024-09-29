package leetcode.strings;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String largerString = word1.length() >= word2.length() ? word1 : word2;
        char[] merged = new char[word1.length() + word2.length()];
        int smallerStringLen = Math.min(word1.length(), word2.length());
        for (int i = 0; i < smallerStringLen; i++) {
            merged[2 * i] = word1.charAt(i);
            merged[2 * i + 1] = word2.charAt(i);
        }
        for (int i = smallerStringLen, j = 2 * i; i < largerString.length(); i++, j++) {
            merged[j] = largerString.charAt(i);
        }
        return new String(merged);
    }
}
