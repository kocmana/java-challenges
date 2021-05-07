package at.kocmana.javachallenges.chapter01math.task02statistic;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StatisticTest {

  @ParameterizedTest
  @CsvSource({
      "3,1,2",
      "8,4,19",
      "15,8,63"
  })
  void calculateReturnsCorrectValues(int maxRange, long count, long sum) {
    StatisticResult actualResult = Statistic.calcSumAndCountAllNumbersDividableBy2Or7(maxRange);

    assertThat(actualResult.getCount()).isEqualTo(count);
    assertThat(actualResult.getSum()).isEqualTo(sum);
  }

}
