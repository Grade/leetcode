package leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseVowelsTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("IceCreAm", "AceCreIm"),
                Arguments.of("leetcode", "leotcede")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testReverseVowels(String input, String expected) throws Exception {
        ReverseVowels solution = new ReverseVowels();
        Assertions.assertEquals(expected, solution.reverseVowels(input));
    }
}