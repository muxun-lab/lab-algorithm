package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-19
 */
@DisplayName("好子数组的最大分数测试用例")
public class LeetCode1793Test {

    @Test
    public void testOne() {
        int[] nums = {1, 4, 3, 7, 4, 5};
        int k = 3;
        int expected = 15;
        int res = new LeetCode1793().maximumScore(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {5, 5, 4, 5, 4, 1, 1, 1};
        int k = 0;
        int expected = 20;
        int res = new LeetCode1793().maximumScore(nums, k);
        Assertions.assertEquals(expected, res);
    }
}
