package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3to1Then1() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4to2Then1() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2to6Then1() {
        int left = 2;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2to2ThenAny() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax15to2and3() {
        int first = 15;
        int second = 2;
        int threed = 3;
        int result = Max.max(first, second, threed);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax15to2and3and4() {
        int first = 4;
        int second = 2;
        int threed = 3;
        int four = 15;
        int result = Max.max(first, second, threed, four);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}