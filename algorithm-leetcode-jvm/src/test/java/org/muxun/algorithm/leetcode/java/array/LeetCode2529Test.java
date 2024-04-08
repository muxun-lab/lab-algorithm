package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-09
 */
@DisplayName("正整数和负整数的最大计数测试用例")
public class LeetCode2529Test {

    @Test
    public void testOne() {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        int expected = 3;
        int res = new LeetCode2529().maximumCount(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        int expected = 3;
        int res = new LeetCode2529().maximumCount(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {5, 20, 66, 1314};
        int expected = 4;
        int res = new LeetCode2529().maximumCount(nums);
        Assertions.assertEquals(expected, res);
    }
}
