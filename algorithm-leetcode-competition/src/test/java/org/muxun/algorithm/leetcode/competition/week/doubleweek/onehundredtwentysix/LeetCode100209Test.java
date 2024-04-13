package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentysix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentysix.LeetCode100209;

/**
 * @author 慕勋
 * @created 2024-03-16
 */
@DisplayName("执行操作标记数组中的元素测试用例")
public class LeetCode100209Test {

    @Test
    public void testOne() {
        int[] nums = {1, 2, 2, 1, 2, 3, 1};
        int[][] queries = {{1, 2}, {3, 3}, {4, 2}};
        long[] expected = {8, 3, 0};
        long[] res = new LeetCode100209().unmarkedSumArray(nums, queries);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 4, 2, 3};
        int[][] queries = {{0, 1}};
        long[] expected = {7};
        long[] res = new LeetCode100209().unmarkedSumArray(nums, queries);
        Assertions.assertArrayEquals(expected, res);
    }
}
