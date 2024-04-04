package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/18
 */
@DisplayName("最大子数组和测试用例")
public class LeetCode53Test {

    @Test
    public void testOne() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = new LeetCode53().maxSubArray(nums);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1};
        int res = new LeetCode53().maxSubArray(nums);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {5, 4, -1, 7, 8};
        int res = new LeetCode53().maxSubArray(nums);
        int expected = 23;
        Assertions.assertEquals(expected, res);
    }
}
