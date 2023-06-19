package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    static List<Integer> numbers;
    static List<Integer> emptyNumbers;

    @BeforeAll
    static void addList() {
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @BeforeAll
    static void emptyList() {
        emptyNumbers = new ArrayList<>();
    }

    @Test
    void testTake() {
        // BEGIN
        List<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        List<Integer> actual = App.take(numbers, 3);
        assertThat(actual).isEqualTo(testNumbers);

        testNumbers.add(4);
        actual = App.take(numbers, 4);
        assertThat(actual).isEqualTo(testNumbers);

        actual = App.take(numbers, 0);
        assertThat(actual).isEqualTo(emptyNumbers);

        actual = App.take(emptyNumbers, 1);
        assertThat(actual).isEqualTo(emptyNumbers);

        actual = App.take(emptyNumbers, 2);
        assertThat(actual).isEqualTo(emptyNumbers);
        // END
    }
}
