package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyfive.LeetCode100231;

/**
 * @author 慕勋
 * @created 2024-03-15
 */
@DisplayName("超过阈值的最少操作数 I测试用例")
public class LeetCode100231Test {

    @Test
    public void testOne() {
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;
        int expected = 3;
        int res = new LeetCode100231().minOperations(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 1, 2, 4, 9};
        int k = 1;
        int expected = 0;
        int res = new LeetCode100231().minOperations(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {1, 1, 2, 4, 9};
        int k = 9;
        int expected = 4;
        int res = new LeetCode100231().minOperations(nums, k);
        Assertions.assertEquals(expected, res);
    }
}
