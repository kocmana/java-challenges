package at.kocmana.javachallenges.chapter01math;

public class EvenOrOddNumber {

  public boolean isEven(int n) {
    return n % 2 == 0;
  }

  public boolean isOdd(int n) {
    return !isEven(n);
  }

}
