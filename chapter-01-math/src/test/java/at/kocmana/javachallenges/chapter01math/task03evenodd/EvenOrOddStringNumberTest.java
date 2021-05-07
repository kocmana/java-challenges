package at.kocmana.javachallenges.chapter01math.task03evenodd;

import static org.assertj.core.api.Assertions.assertThat;

import at.kocmana.javachallenges.chapter01math.task03evenodd.EvenOrOddNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvenOrOddNumberTest {

  @ParameterizedTest
  @CsvSource({
      "1,true",
      "2,false",
      "3,true"
  })
  void isOddReturnsCorrectResult(int number, boolean expectedResult) {
    boolean actualResult = EvenOrOddNumber.isOdd(number);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @ParameterizedTest
  @CsvSource({
      "1,false",
      "2,true",
      "3,false"
  })
  void isEvenReturnsCorrectResult(int number, boolean expectedResult) {
    boolean actualResult = EvenOrOddNumber.isEven(number);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

}
