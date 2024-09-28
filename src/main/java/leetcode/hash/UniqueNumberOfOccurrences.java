package leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurencesPerNumber = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer occurences = occurencesPerNumber.get(arr[i]);
            if (occurences == null) {
                occurencesPerNumber.put(arr[i], 1);
            } else {
                occurencesPerNumber.put(arr[i], ++occurences);
            }
        }
        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (Integer occurence : occurencesPerNumber.values()) {
            if (!uniqueOccurrences.add(occurence)) {
                return false;
            }
        }
        return true;
    }
}
