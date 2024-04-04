package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-09
 */
@DisplayName("找出数组的第 K 大和测试用例")
public class LeetCode2368Test {

    @Test
    public void testOne() {
        int[] nums = {2, 4, -2};
        int k = 5;
        long expected = 2;
        long res = new LeetCode2368().kSum(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, -2, 3, 4, -10, 12};
        int k = 16;
        long expected = 10;
        long res = new LeetCode2368().kSum(nums, k);
        Assertions.assertEquals(expected, res);
    }
}
