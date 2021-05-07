package at.kocmana.javachallenges.chapter01math.task05perfectnumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class PerfectNumberCalculator {

    static List<Integer> calculatePerfectNumbersUpTo(int maxValue) {
        return IntStream.range(1,maxValue)
                .filter(PerfectNumberCalculator::checkIfIsPerfectNumber)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
    }

    static boolean checkIfIsPerfectNumber(int number){
        int sumOfTrueDivisors = Arrays.stream(calculateDivisorsFor(number))
                .sum();

        return sumOfTrueDivisors == number;
    }

    static int[] calculateDivisorsFor(int number) {
        return IntStream.range(1,number)
                .filter((currentNumber) -> number % currentNumber == 0 )
                .toArray();
    }

}
