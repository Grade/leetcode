package leetcode.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0, 1}, new int[]{1, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testMoveZeroes(int[] nums, int[] expected) throws Exception {
        MoveZeroes solution = new MoveZeroes();

        solution.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }
}