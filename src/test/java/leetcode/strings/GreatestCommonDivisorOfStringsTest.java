package leetcode.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GreatestCommonDivisorOfStringsTest {

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of("ABCABC", "ABC", "ABC"),
        Arguments.of("ABABAB", "ABAB", "AB"),
        Arguments.of("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX",
            "TAUXX"),
        Arguments.of("NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM",
            "NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM", "NLZGM"),
        Arguments.of("AA", "A", "A"),
        Arguments.of("AAA", "AAA", "AAA"),
        Arguments.of("LEET", "CODE", ""));
  }

  @ParameterizedTest
  @MethodSource("arguments")
  void gcdOfStrings(String str1, String str2, String expected) {
    GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();

    assertEquals(expected, solution.gcdOfStrings(str1, str2));
  }
}