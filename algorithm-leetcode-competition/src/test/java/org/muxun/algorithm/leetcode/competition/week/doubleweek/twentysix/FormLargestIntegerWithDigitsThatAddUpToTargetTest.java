package org.muxun.algorithm.leetcode.competition.week.doubleweek.twentysix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix.FormLargestIntegerWithDigitsThatAddUpToTarget;

/**
 * @author sunshine
 * @created 2020-05-25
 */
@DisplayName("数位成本和为目标值的最大数字单元测试")
public class FormLargestIntegerWithDigitsThatAddUpToTargetTest {

    @Test
    public void largestNumberTestOne() {
        Assertions.assertEquals("7772", new FormLargestIntegerWithDigitsThatAddUpToTarget().largestNumber(new int[]{4, 3, 2, 5, 6, 7, 2, 5, 5}, 9));
    }

    @Test
    public void largestNumberTestTwo() {
        Assertions.assertEquals("85", new FormLargestIntegerWithDigitsThatAddUpToTarget().largestNumber(new int[]{7, 6, 5, 5, 5, 6, 8, 7, 8}, 12));
    }

    @Test
    public void largestNumberTestThree() {
        Assertions.assertEquals("0", new FormLargestIntegerWithDigitsThatAddUpToTarget().largestNumber(new int[]{2, 4, 6, 2, 4, 6, 4, 4, 4}, 5));
    }

    @Test
    public void largestNumberTestFour() {
        Assertions.assertEquals("32211", new FormLargestIntegerWithDigitsThatAddUpToTarget().largestNumber(new int[]{6, 10, 15, 40, 40, 40, 40, 40, 40}, 47));
    }
}
