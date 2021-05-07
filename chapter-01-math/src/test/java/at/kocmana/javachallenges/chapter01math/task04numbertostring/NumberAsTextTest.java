package at.kocmana.javachallenges.chapter01math.task04numbertostring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberAsTextTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 11})
    void numberAsTextThrowsExceptionWhenOutOfRanged(int value) {
        assertThrows(IllegalArgumentException.class, () -> NumberAsText.fromNumber(value));
    }

    @Test
    void numberAsTextReturnsCorrectString() {
        NumberAsText actualEnum = NumberAsText.fromNumber(0);

        assertThat(actualEnum).isEqualTo(NumberAsText.ZERO);
    }

}
