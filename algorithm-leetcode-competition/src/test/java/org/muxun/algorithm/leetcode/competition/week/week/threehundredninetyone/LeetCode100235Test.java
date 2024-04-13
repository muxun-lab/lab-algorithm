package org.muxun.algorithm.leetcode.competition.week.week.threehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredninetyone.LeetCode100235;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("换水问题测试用例")
public class LeetCode100235Test {

    @Test
    public void testOne() {
        int numBottles = 10;
        int numExchange = 3;
        int expected = 13;
        int res = new LeetCode100235().maxBottlesDrunk(numBottles, numExchange);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int numBottles = 13;
        int numExchange = 6;
        int expected = 15;
        int res = new LeetCode100235().maxBottlesDrunk(numBottles, numExchange);
        Assertions.assertEquals(expected, res);
    }
}
