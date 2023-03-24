package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToSevenThenSeven() {
        int start = 5;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToSixteenThenSeventyTwo() {
        int start = 0;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 72;
        assertThat(result).isEqualTo(expected);
    }
}