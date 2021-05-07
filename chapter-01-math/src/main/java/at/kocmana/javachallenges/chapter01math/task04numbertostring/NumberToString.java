package at.kocmana.javachallenges.chapter01math.task04numbertostring;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor(staticName = "fromNumber")
public class NumberToString {

    private final int number;

    public String toString() {
        List<Integer> digits = toDigitList();

        return digits.stream()
                .map(NumberAsText::fromNumber)
                .map(NumberAsText::toString)
                .collect(Collectors.joining(" "));
    }

    private List<Integer> toDigitList() {
        List<Integer> numbers = new ArrayList<>();

        for (var i = 1; number / i > 0; i *= 10) {
            int currentNumber = number / i;
            numbers.add(currentNumber % 10);
        }

        Collections.reverse(numbers);

        return numbers;
    }
}
