package org.muxun.algorithm.leetcode.java.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("只出现一次的数字测试用例")
public class LeetCode136Test {

    @Test
    public void testOne() {
        int[] nums = {2, 2, 1};
        int expected = 1;
        int res = new LeetCode136().singleNumber(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {4, 1, 2, 1, 2};
        int expected = 4;
        int res = new LeetCode136().singleNumber(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {1};
        int expected = 1;
        int res = new LeetCode136().singleNumber(nums);
        Assertions.assertEquals(expected, res);
    }
}
