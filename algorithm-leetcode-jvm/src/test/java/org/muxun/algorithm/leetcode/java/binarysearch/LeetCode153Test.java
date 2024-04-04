package org.muxun.algorithm.leetcode.java.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-27
 */
@DisplayName("寻找旋转排序数组中的最小值测试用例")
public class LeetCode153Test {

    @Test
    public void testOne() {
        int[] nums = {3, 4, 5, 1, 2};
        int expected = 1;
        int res = new LeetCode153().findMin(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int expected = 0;
        int res = new LeetCode153().findMin(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {11, 13, 15, 17};
        int expected = 11;
        int res = new LeetCode153().findMin(nums);
        Assertions.assertEquals(expected, res);
    }
}
