package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-3-7
 */
@DisplayName("乘积最大子数组测试用例")
public class LeetCode152Test {

    @Test
    public void testOne() {
        int[] nums = {2, 3, -2, 4};
        int expected = 6;
        int res = new LeetCode152().maxProduct(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {-2, 0, -1};
        int expected = 0;
        int res = new LeetCode152().maxProduct(nums);
        Assertions.assertEquals(expected, res);
    }
}
