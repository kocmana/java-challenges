package at.kocmana.javachallenges.chapter01math.task05perfectnumbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PerfectNumberCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "3,false",
            "6,true",
            "28,true",
            "29,false"
    })
    void checkIfPerfectNumberCorrectsCorrectValue(int number, boolean expectedResult) {
        boolean actualResult = PerfectNumberCalculator.checkIfIsPerfectNumber(number);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void calculatePerfectNumbersUpToReturnsCorrectValue() {
        List<Integer> expectedResults = List.of(6, 28, 496, 8128);

        List<Integer> actualResult = PerfectNumberCalculator.calculatePerfectNumbersUpTo(10_000);

        assertThat(actualResult.size()).isEqualTo(actualResult.size());
        assertThat(actualResult).allMatch(expectedResults::contains);
    }

}
