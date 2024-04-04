package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("前 K 个高频元素测试用例")
public class LeetCode347Test {

    @Test
    public void testOne() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        int[] ans = new LeetCode347().topKFrequent(nums, k);
        Arrays.sort(ans);
        Assertions.assertArrayEquals(expected, ans);
    }

    @Test
    public void testTwo() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        int[] ans = new LeetCode347().topKFrequent(nums, k);
        Arrays.sort(ans);
        Assertions.assertArrayEquals(expected, ans);
    }
}
