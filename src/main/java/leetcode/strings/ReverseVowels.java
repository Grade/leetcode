package leetcode.strings;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            boolean isLeftVowel = isVowel(chars[i]);
            boolean isRightVowel = isVowel(chars[j]);
            if (isLeftVowel && isRightVowel) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            } else {
                if (!isLeftVowel) {
                    i++;
                }
                if (!isRightVowel) {
                    j--;
                }
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
