package org.muxun.algorithm.leetcode.competition.week.week.threehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredninetyone.LeetCode100263;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("哈沙德数测试用例")
public class LeetCode100263Test {

    @Test
    public void testOne() {
        int x = 18;
        int expected = 9;
        int res = new LeetCode100263().sumOfTheDigitsOfHarshadNumber(x);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int x = 23;
        int expected = -1;
        int res = new LeetCode100263().sumOfTheDigitsOfHarshadNumber(x);
        Assertions.assertEquals(expected, res);
    }
}
