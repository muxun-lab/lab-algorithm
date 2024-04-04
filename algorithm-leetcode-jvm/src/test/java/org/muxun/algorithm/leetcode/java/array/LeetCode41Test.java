package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/18
 */
@DisplayName("缺失的第一个正数")
public class LeetCode41Test {

    @Test
    public void testOne() {
        int[] nums = {1, 2, 0};
        int res = new LeetCode41().firstMissingPositive(nums);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {3, 4, -1, 1};
        int res = new LeetCode41().firstMissingPositive(nums);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {7, 8, 9, 11, 12};
        int res = new LeetCode41().firstMissingPositive(nums);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }
}
