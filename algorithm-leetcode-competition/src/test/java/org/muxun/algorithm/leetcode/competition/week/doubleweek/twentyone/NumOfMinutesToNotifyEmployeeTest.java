package org.muxun.algorithm.leetcode.competition.week.doubleweek.twentyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredseventynine.NumOfMinutesToNotifyEmployee;

/**
 * @author sunshine
 * @created 2020-03-08
 */
public class NumOfMinutesToNotifyEmployeeTest {

    @Test
    public void numOfMinutesToNotifyEmployeeTestOne() {
        Assertions.assertEquals(21, new NumOfMinutesToNotifyEmployee().numOfMinutes(7, 6, new int[]{1, 2, 3, 4, 5, 6, -1}, new int[]{0, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void numOfMinutesToNotifyEmployeeTestTwo() {
        Assertions.assertEquals(3, new NumOfMinutesToNotifyEmployee().numOfMinutes(15, 0, new int[]{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void numOfMinutesToNotifyEmployeeTestThree() {
        Assertions.assertEquals(2560, new NumOfMinutesToNotifyEmployee().numOfMinutes(11, 4, new int[]{5, 9, 6, 10, -1, 8, 9, 1, 9, 3, 4}, new int[]{0, 213, 0, 253, 686, 170, 975, 0, 261, 309, 337}));
    }
}
