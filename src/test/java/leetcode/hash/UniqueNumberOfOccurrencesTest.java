package leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UniqueNumberOfOccurrencesTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1, 1, 3}, true),
                Arguments.of(new int[]{1, 2}, false),
                Arguments.of(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testUniqueOccurrences(int[] arr, boolean expected) throws Exception {
        UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        Assertions.assertEquals(expected, solution.uniqueOccurrences(arr));
    }
}