package leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDifferenceTwoArraysTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4, 6}, new int[]{1, 3}, new int[]{4, 6}),
                Arguments.of(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}, new int[]{3}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testFindDifference(int[] nums1, int[] nums2, int[] diff1, int[] diff2) throws Exception {
        FindDifferenceTwoArrays solution = new FindDifferenceTwoArrays();

        List<List<Integer>> result = solution.findDifference(nums1, nums2);

        Set<Integer> diff1Set = Arrays.stream(diff1).boxed().collect(Collectors.toSet());
        Set<Integer> diff2Set = Arrays.stream(diff2).boxed().collect(Collectors.toSet());
        Assertions.assertEquals(diff1Set, new HashSet<>(result.get(0)));
        Assertions.assertEquals(diff2Set, new HashSet<>(result.get(1)));
    }
}