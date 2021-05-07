package at.kocmana.javachallenges.chapter01math.task04numbertostring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberToStringTest {

    @ParameterizedTest
    @CsvSource({
            "7, SEVEN",
            "42, FOUR TWO",
            "24680, TWO FOUR SIX EIGHT ZERO",
            "13579, ONE THREE FIVE SEVEN NINE"
    })
    void numberToStringReturnsCorrectValues(int number, String expectedString) {
        NumberToString underTest = NumberToString.fromNumber(number);

        String actualString = underTest.toString();

        assertThat(actualString).isEqualTo(expectedString);
    }

}
