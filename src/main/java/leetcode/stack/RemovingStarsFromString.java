package leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemovingStarsFromString {
    public String removeStars(String s) {
        Deque<Character> output = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '*') {
                output.push(c);
            } else {
                output.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!output.isEmpty()) {
            sb.append(output.pollLast());
        }
        return sb.toString();
    }
}
