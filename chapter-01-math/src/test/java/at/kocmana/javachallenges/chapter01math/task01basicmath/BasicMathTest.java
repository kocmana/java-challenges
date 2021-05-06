package at.kocmana.javachallenges.chapter01math.task01basicmath;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BasicMathTest {

  @ParameterizedTest
  @CsvSource({
      "6,7,0",
      "3,4,6",
      "5,5,5"
  })
  void calculateReturnsCorrectValues(int firstValue, int secondValue, int expectedResult) {
    BasicMath underTest = new BasicMath();
    int actualResult = underTest.calc(firstValue, secondValue);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

}
