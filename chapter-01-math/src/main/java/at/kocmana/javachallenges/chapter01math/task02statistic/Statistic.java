package at.kocmana.javachallenges.chapter01math.task02statistic;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Statistic {

  static StatisticResult calcSumAndCountAllNumbersDividableBy2Or7(int maxValue) {
    IntPredicate dividableByTwo = value -> value % 2 == 0;
    IntPredicate dividableBySeven = value -> value % 7 == 0;

    int[] results = IntStream.range(1, maxValue)
        .filter(dividableByTwo.or(dividableBySeven))
        .toArray();

    return StatisticResult.builder()
        .sum(Arrays.stream(results).sum())
        .count(Arrays.stream(results).count())
        .build();
  }
}
