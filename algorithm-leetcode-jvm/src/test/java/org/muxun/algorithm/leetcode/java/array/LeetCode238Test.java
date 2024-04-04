package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/18
 */
@DisplayName("除自身以外数组的乘积测试用例")
public class LeetCode238Test {

    @Test
    public void testOne() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] res = new LeetCode238().productExceptSelf(nums);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] res = new LeetCode238().productExceptSelf(nums);
        Assertions.assertArrayEquals(expected, res);
    }
}
