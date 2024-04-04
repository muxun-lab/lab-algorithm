package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/11
 */
@DisplayName("最长连续子序列测试用例")
public class LeetCode128Test {

    @Test
    public void testOne() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int res = new LeetCode128().longestConsecutive(nums);
        int expected = 4;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int res = new LeetCode128().longestConsecutive(nums);
        int expected = 9;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int res = new LeetCode128().longestConsecutiveByDP(nums);
        int expected = 4;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int res = new LeetCode128().longestConsecutiveByDP(nums);
        int expected = 9;
        Assertions.assertEquals(expected, res);
    }
}
