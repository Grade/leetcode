package leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ProductOfArrayExceptSelfTest {

  static Stream<Arguments> parameters() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
        Arguments.of(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0})
    );
  }

  @ParameterizedTest
  @MethodSource("parameters")
  void productExceptSelf(int[] input, int[] expected) {
    ProductOfArrayExceptSelf sut = new ProductOfArrayExceptSelf();
    assertArrayEquals(expected, sut.productExceptSelf(input));
  }
}