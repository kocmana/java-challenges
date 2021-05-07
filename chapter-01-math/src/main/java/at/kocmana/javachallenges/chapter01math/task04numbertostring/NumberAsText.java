package at.kocmana.javachallenges.chapter01math.task04numbertostring;

import java.util.Arrays;

enum NumberAsText {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    ZERO(0),
    UNKNOWN(-1);

    private final int number;

    NumberAsText(int number) {
        this.number = number;
    }

    static NumberAsText fromNumber(int number) {
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("Illegal number provided.");
        }

        return Arrays.stream(NumberAsText.values())
                .filter(numberAsText -> numberAsText.number == number)
                .findFirst()
                .orElse(UNKNOWN);
    }
}
