package org.muxun.algorithm.leetcode.competition.week.week.onehundredseventyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredseventyeight.SmallerNumbersThanCurrent;

/**
 * @author sunshine
 * @created 2020-03-01
 */
@DisplayName("有多少小于当前数字的数字测试类")
public class SmallerNumbersThanCurrentTest {

    @Test
    public void smallerNumbersThanCurrentTestOne() {
        Assertions.assertArrayEquals(new int[]{4, 0, 1, 1, 3}, new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
    }

    @Test
    public void smallerNumbersThanCurrentTestTwo() {
        Assertions.assertArrayEquals(new int[]{2, 1, 0, 3}, new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
    }

    @Test
    public void smallerNumbersThanCurrentTestThree() {
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0}, new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
    }
}
