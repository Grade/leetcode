package leetcode.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
                Arguments.of(new int[]{5}, -5, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testSearch(int[] nums, int target, int expected) throws Exception {
        BinarySearch solution = new BinarySearch();

        assertEquals(expected, solution.search(nums, target));
    }
}