package at.kocmana.javachallenges.chapter01math.task06primenumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.Getter;

@Getter
class SieveOfEratosthenes {

  private final int maxValue;
  private List<Integer> primeNumbers;

  static SieveOfEratosthenes withMaximumValue(int maximumValue) {
    return new SieveOfEratosthenes(maximumValue);
  }

  private SieveOfEratosthenes(int maxValue) {
    this.maxValue = maxValue;
    List<Integer> primeCandidates = initializePrimeCandidates();
    primeNumbers = calculatePrimeNumbers(primeCandidates);
  }

  private List<Integer> calculatePrimeNumbers(List<Integer> primeCandidates) {

    List<Integer> primes = new ArrayList<>();

    Optional<Integer> primeOptional = identifyFirstPrimeNumber(primeCandidates);
    while (primeOptional.isPresent()) {
      Integer firstPrimeNumber = primeOptional.get();

      primes.add(firstPrimeNumber);

      primeCandidates = primeCandidates.stream()
          .filter(potentialMultiple -> !isMultiple(firstPrimeNumber, potentialMultiple))
          .collect(Collectors.toUnmodifiableList());

      primeOptional = identifyFirstPrimeNumber(primeCandidates);
    }

    return primes;
  }

  private List<Integer> initializePrimeCandidates() {
    return IntStream.range(2, maxValue)
        .boxed()
        .collect(Collectors.toUnmodifiableList());
  }

  private boolean isMultiple(int value, int potentialMultiple) {
    return potentialMultiple % value == 0;
  }

  private boolean isPrime(int primeCandidate) {
    int optimizedEndCriterion = primeCandidate / 2;

    return IntStream.range(2, optimizedEndCriterion)
        .noneMatch(value -> primeCandidate % value == 0);
  }

  private Optional<Integer> identifyFirstPrimeNumber(List<Integer> primeCandidates) {
    return primeCandidates.stream()
        .filter(this::isPrime)
        .findFirst();
  }

}
