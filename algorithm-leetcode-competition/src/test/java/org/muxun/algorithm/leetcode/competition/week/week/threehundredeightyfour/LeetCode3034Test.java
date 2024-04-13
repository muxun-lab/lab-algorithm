package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyfour.LeetCode3034;

/**
 * @author 慕勋
 * @created 2024/2/12
 */
@DisplayName("匹配模式数组的子数组数目 I")
public class LeetCode3034Test {

    @Test
    public void testOne() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] pattern = {1, 1};
        int res = new LeetCode3034().countMatchingSubarrays(nums, pattern);
        int expected = 4;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 4, 4, 1, 3, 5, 5, 3};
        int[] pattern = {1, 0, -1};
        int res = new LeetCode3034().countMatchingSubarrays(nums, pattern);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] pattern = {1, 1};
        int res = new LeetCode3034().countMatchingSubarraysByKMP(nums, pattern);
        int expected = 4;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        int[] nums = {1, 4, 4, 1, 3, 5, 5, 3};
        int[] pattern = {1, 0, -1};
        int res = new LeetCode3034().countMatchingSubarraysByKMP(nums, pattern);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }
}
