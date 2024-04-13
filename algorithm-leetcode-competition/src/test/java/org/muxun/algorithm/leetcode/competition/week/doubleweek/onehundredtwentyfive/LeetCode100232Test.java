package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyfive.LeetCode100232;

/**
 * @author 慕勋
 * @created 2024-03-02
 */
@DisplayName("超过阈值的最少操作数 II测试用例")
public class LeetCode100232Test {

    @Test
    public void testOne() {
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;
        int expected = 2;
        int res = new LeetCode100232().minOperations(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 1, 2, 4, 9};
        int k = 20;
        int expected = 4;
        int res = new LeetCode100232().minOperations(nums, k);
        Assertions.assertEquals(expected, res);
    }
}
