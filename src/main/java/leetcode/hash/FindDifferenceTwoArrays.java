package leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> distincts1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            distincts1.add(nums1[i]);
        }
        Set<Integer> distincts2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            distincts2.add(nums2[i]);
        }
        List<Integer> diff1 = new ArrayList<>();
        for (Integer num : distincts1) {
            if (!distincts2.contains(num)) {
                diff1.add(num);
            }
        }
        List<Integer> diff2 = new ArrayList<>();
        for (Integer num : distincts2) {
            if (!distincts1.contains(num)) {
                diff2.add(num);
            }
        }
        return Arrays.asList(diff1, diff2);
    }
}
