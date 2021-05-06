package at.kocmana.javachallenges.chapter01math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
    EvenOrOddNumber underTest = new EvenOrOddNumber();
    boolean actualResult = underTest.isOdd(number);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @ParameterizedTest
  @CsvSource({
      "1,false",
      "2,true",
      "3,false"
  })
  void isEvenReturnsCorrectResult(int number, boolean expectedResult) {
    EvenOrOddNumber underTest = new EvenOrOddNumber();
    boolean actualResult = underTest.isEven(number);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

}
