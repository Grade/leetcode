package leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CanPlaceFlowersTest {

  static Stream<Arguments> parameters() {
    return Stream.of(
        Arguments.of(new int[]{1,0,0,0,1}, 1, true),
        Arguments.of(new int[]{1,0,0,0,1}, 2, false),
        Arguments.of(new int[]{1,0,0,0,0}, 1, true)
    );
  }

  @ParameterizedTest
  @MethodSource("parameters")
  void canPlaceFlowers(int[] input, int n, boolean expected) {
    CanPlaceFlowers sut = new CanPlaceFlowers();
    assertEquals(expected, sut.canPlaceFlowers(input, n));
  }
}