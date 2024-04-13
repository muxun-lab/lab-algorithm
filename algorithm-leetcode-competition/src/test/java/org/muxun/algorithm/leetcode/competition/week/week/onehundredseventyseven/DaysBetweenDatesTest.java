package org.muxun.algorithm.leetcode.competition.week.week.onehundredseventyseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredseventyseven.DaysBetweenDates;

/**
 * @author sunshine
 * @created 2020-02-23
 */
@DisplayName("日期之间隔几天测试类")
public class DaysBetweenDatesTest {

    @Test
    public void daysBetweenDatesTestOne() {
        Assertions.assertEquals(15, new DaysBetweenDates().daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    @Test
    public void daysBetweenDatesTestTwo() {
        Assertions.assertEquals(1, new DaysBetweenDates().daysBetweenDates("2020-06-30", "2020-06-29"));
    }

    @Test
    public void daysBetweenDatesTestThree() {
        Assertions.assertEquals(2, new DaysBetweenDates().daysBetweenDates("2020-02-28", "2020-03-01"));
    }

    @Test
    public void daysBetweenDatesTestFour() {
        Assertions.assertEquals(2924, new DaysBetweenDates().daysBetweenDates("2016-02-28", "2024-03-01"));
    }

    @Test
    public void daysBetweenDatesTestFive() {
        Assertions.assertEquals(367, new DaysBetweenDates().daysBetweenDates("2019-02-28", "2020-03-01"));
    }

    @Test
    public void daysBetweenDatesTestSix() {
        Assertions.assertEquals(32671, new DaysBetweenDates().daysBetweenDates("2008-10-20", "2098-04-02"));
    }

    @Test
    public void daysBetweenDatesTestSeven() {
        Assertions.assertEquals(32671, new DaysBetweenDates().daysBetweenDates("2098-04-02", "2008-10-20"));
    }

    @Test
    public void daysBetweenDatesTestEight() {
        Assertions.assertEquals(20897, new DaysBetweenDates().daysBetweenDates("2076-01-01", "2018-10-15"));
    }
}
