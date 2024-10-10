package leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumAverageSubarrayITest {

  static Stream<Arguments> provideParameters() {
    return Stream.of(
        Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
        Arguments.of(new int[]{5}, 1, 5)
    );
  }

  @ParameterizedTest
  @MethodSource("provideParameters")
  void findMaxAverage(int[] nums, int k, double expected) {
    MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

    assertEquals(expected, solution.findMaxAverage(nums, k));
  }
}