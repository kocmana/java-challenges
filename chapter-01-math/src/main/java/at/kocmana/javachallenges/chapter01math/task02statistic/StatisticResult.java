package at.kocmana.javachallenges.chapter01math.task02statistic;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StatisticResult {
  long sum;
  long count;
}
