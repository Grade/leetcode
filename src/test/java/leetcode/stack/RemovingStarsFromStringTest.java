package leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RemovingStarsFromStringTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("leet**cod*e", "lecoe"),
                Arguments.of("erase*****", "")
                );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testRemoveStars(String input, String expected) throws Exception {
        RemovingStarsFromString solution = new RemovingStarsFromString();

        Assertions.assertEquals(expected, solution.removeStars(input));

    }
}