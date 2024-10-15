package leetcode.strings;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseStringTest {

  static Stream<Arguments> provideParameters() {
    return Stream.of(
        Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}),
        Arguments.of(new char[]{'H', 'a', 'n', 'n', 'a', 'h'},
            new char[]{'h', 'a', 'n', 'n', 'a', 'H'}));
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  void reverseString(char[] input, char[] expected) {
    ReverseString sut = new ReverseString();

    sut.reverseString(input);

    assertArrayEquals(expected, input);
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  void reverseStringRecursive(char[] input, char[] expected) {
    ReverseString sut = new ReverseString();

    sut.reverseStringRecursive(input);

    assertArrayEquals(expected, input);
  }
}