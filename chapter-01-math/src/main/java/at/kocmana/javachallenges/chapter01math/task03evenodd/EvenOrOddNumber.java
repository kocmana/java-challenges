package at.kocmana.javachallenges.chapter01math.task03evenodd;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class EvenOrOddNumber {

  static boolean isEven(int n) {
    return n % 2 == 0;
  }

  static boolean isOdd(int n) {
    return !isEven(n);
  }

}
