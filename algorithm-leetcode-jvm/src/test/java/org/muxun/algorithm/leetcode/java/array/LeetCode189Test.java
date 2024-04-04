package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/18
 */
@DisplayName("轮转数组测试用例")
public class LeetCode189Test {

    @Test
    public void testOne() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        new LeetCode189().rotate(nums, k);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void testTwo() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expected = {3, 99, -1, -100};
        new LeetCode189().rotate(nums, k);
        Assertions.assertArrayEquals(expected, nums);
    }
}
