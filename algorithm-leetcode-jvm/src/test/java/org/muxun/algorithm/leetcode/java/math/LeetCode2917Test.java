package org.muxun.algorithm.leetcode.java.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-06
 */
@DisplayName("找出数组中的K-or值测试用例")
public class LeetCode2917Test {

    @Test
    public void testOne() {
        int[] nums = {7, 12, 9, 8, 9, 15};
        int k = 4;
        int expected = 9;
        int res = new LeetCode2917().findKOr(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {2, 12, 1, 11, 4, 5};
        int k = 6;
        int expected = 0;
        int res = new LeetCode2917().findKOr(nums, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {10, 8, 5, 9, 11, 6, 8};
        int k = 1;
        int expected = 15;
        int res = new LeetCode2917().findKOr(nums, k);
        Assertions.assertEquals(expected, res);
    }
}
