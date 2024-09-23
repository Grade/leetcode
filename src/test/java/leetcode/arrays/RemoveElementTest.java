package leetcode.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 0, 1, 3, 4}),
                Arguments.of(new int[]{}, 2, new int[]{}),
                Arguments.of(new int[]{1}, 1, new int[]{}),
                Arguments.of(new int[]{3, 3}, 3, new int[]{}),
                Arguments.of(new int[]{2}, 1, new int[]{2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testRemoveElement(int nums[], int val, int[] expected) throws Exception {
        RemoveElement solution = new RemoveElement();

        int result = solution.removeElement(nums, val);

        assertEquals(expected.length, result);
        int[] slice = Arrays.copyOfRange(nums, 0, result);
        Arrays.sort(slice);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(slice[i], expected[i]);
        }
    }
}