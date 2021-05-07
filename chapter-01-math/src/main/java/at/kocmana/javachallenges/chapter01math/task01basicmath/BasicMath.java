package at.kocmana.javachallenges.chapter01math.task01basicmath;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class BasicMath {

  static int calc(int firstInput, int secondInput) {
    return (firstInput * secondInput / 2) % 7;
  }

}
