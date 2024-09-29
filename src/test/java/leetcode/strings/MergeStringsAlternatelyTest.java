package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MergeStringsAlternatelyTest {

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd"),
                Arguments.of("abcd", "", "abcd")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testMergeAlternately(String word1, String word2, String expected) throws Exception {
        MergeStringsAlternately solution = new MergeStringsAlternately();

        Assertions.assertEquals(expected, solution.mergeAlternately(word1, word2));
    }
}