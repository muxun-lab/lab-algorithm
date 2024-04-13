package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyseven.LeetCode100272;

/**
 * @author 慕勋
 * @created 2024-03-30
 */
@DisplayName("或值至少 K 的最短子数组 I测试用例")
public class LeetCode100272Test {

    @Test
    public void testOne() {
        int[] nums = {16, 1, 2, 20, 32};
        int k = 45;
        int expected = 2;
        int res = new LeetCode100272().minimumSubarrayLength(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 2, 3};
        int k = 2;
        int expected = 1;
        int res = new LeetCode100272().minimumSubarrayLength(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {2, 1, 8};
        int k = 10;
        int expected = 3;
        int res = new LeetCode100272().minimumSubarrayLength(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        int[] nums = {1, 2};
        int k = 0;
        int expected = 1;
        int res = new LeetCode100272().minimumSubarrayLength(nums, k);
        Assertions.assertEquals(expected, res);
    }
}
