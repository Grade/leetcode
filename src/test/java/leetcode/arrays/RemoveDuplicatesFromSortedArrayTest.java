package leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDuplicatesFromSortedArrayTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testRemoveDuplicates(int[] nums, int[] expected) throws Exception {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int result = solution.removeDuplicates(nums);

        assertEquals(expected.length, result);
        int[] slice = Arrays.copyOfRange(nums, 0, result);
        assertArrayEquals(expected, slice);
    }
}