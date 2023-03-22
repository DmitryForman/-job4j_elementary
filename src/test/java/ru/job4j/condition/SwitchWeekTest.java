package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void nameOfDayMonday() {
        int day = 1;
        String out = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, out, "Понедельник");
    }

    @Test
    public void nameOfDayError() {
        int day = 8;
        String out = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, out, "Ошибка");
    }

    @Test
    public void nameOfDayFriday() {
        int day = 5;
        String out = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assert.assertEquals(expected, out);
    }
}