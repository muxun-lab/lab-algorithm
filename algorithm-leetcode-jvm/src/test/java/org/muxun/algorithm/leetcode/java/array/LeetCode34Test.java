package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-17
 */
@DisplayName("在排序数组中查找元素的第一个和最后一个位置测试用例")
public class LeetCode34Test {

    @Test
    public void testOne() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        int[] res = new LeetCode34().searchRange(nums, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        int[] res = new LeetCode34().searchRange(nums, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        int[] res = new LeetCode34().searchRange(nums, target);
        Assertions.assertEquals(expected, res);
    }
}
