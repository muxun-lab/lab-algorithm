package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/1/31
 */
@DisplayName("找出不同元素数目差数组测试用例")
public class LeetCode2670Test {

    @Test
    public void testOne() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] res = new LeetCode2670().distinctDifferenceArray(nums);
        int[] expected = new int[]{-3, -1, 1, 3, 5};
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = new int[]{3, 2, 3, 4, 2};
        int[] res = new LeetCode2670().distinctDifferenceArray(nums);
        int[] expected = new int[]{-2, -1, 0, 2, 3};
        Assertions.assertArrayEquals(expected, res);
    }
}
