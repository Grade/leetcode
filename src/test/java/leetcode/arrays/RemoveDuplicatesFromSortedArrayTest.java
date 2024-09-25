package leetcode.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4})
        );
    }

    /*
    0, 0, 1, 1, 1, 2, 2, 3, 3, 4
    0, X, 1, X, X, 2, X, 3, X, 4

    0, 1, X, X, X, 2, X, 3, X, 4
    0, 1, 2, X, X, X, X, 3, X, 4
    0, 1, 2, 3, X, X, X, X, X, 4
    0, 1, 2, 3, 4, X, X, X, X, X
     */

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testRemoveDuplicates(int[] nums, int[] expected) throws Exception {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int result = solution.removeDuplicates(nums);

        assertEquals(expected.length, result);
        int[] slice = Arrays.copyOfRange(nums, 0, result);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(slice[i], expected[i]);
        }
    }
}