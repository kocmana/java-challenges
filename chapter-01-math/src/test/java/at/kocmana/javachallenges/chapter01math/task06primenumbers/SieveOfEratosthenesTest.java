package at.kocmana.javachallenges.chapter01math.task06primenumbers;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {

  @Test
  void sieveOfEratosthenesReturnsCorrectPrimeNumbers() {
    List<Integer> expectedResults = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);

    SieveOfEratosthenes underTest = SieveOfEratosthenes.withMaximumValue(50);
    List<Integer> actualResult = underTest.getPrimeNumbers();

    assertThat(actualResult).hasSameElementsAs(expectedResults);

  }

}
