package org.muxun.algorithm.leetcode.java.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("颜色分类测试用例")
public class LeetCode75Test {

    @Test
    public void testOne() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        new LeetCode75().sortColors(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void testTwo() {
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        new LeetCode75().sortColors(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
