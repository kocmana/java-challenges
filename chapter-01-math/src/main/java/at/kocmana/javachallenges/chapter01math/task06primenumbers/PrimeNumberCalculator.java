package at.kocmana.javachallenges.chapter01math.task06primenumbers;

import java.util.List;

class PrimeNumberCalculator {

  static List<Integer> calcPrimesUpTo(int maxValue) {
    SieveOfEratosthenes sieveOfEratosthenes = SieveOfEratosthenes.withMaximumValue(maxValue);

    return sieveOfEratosthenes.getPrimeNumbers();
  }

}
