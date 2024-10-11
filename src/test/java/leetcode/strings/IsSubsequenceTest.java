package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsSubsequenceTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("", "ahbgdc", true),
                Arguments.of("abc", "", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testIsSubsequence(String s, String t, boolean expected) throws Exception {
        IsSubsequence solution = new IsSubsequence();

        Assertions.assertEquals(expected, solution.isSubsequence(s, t));
    }
}