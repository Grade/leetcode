package leetcode.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaximumNumberTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1}, 1),
                Arguments.of(new int[]{1, 2}, 2),
                Arguments.of(new int[]{2, 2, 3, 1}, 1),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{1, 2, 2, 5, 3, 5}, 2),
                Arguments.of(new int[]{-2147483648, 3, 2}, -2147483648),
                Arguments.of(new int[]{-2147483648, 2, 2, 3}, -2147483648)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testThirdMax(int[] nums, int expected) throws Exception {
        ThirdMaximumNumber solution = new ThirdMaximumNumber();

        assertEquals(expected, solution.thirdMax(nums));
    }
}