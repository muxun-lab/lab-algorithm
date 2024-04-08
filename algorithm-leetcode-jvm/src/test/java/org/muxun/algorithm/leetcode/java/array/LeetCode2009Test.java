package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-08
 */
@DisplayName("使数组连续的最少操作数测试用例")
public class LeetCode2009Test {

    @Test
    public void testOne() {
        int[] nums = {4, 2, 5, 3};
        int expected = 0;
        int res = new LeetCode2009().minOperations(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 2, 3, 5, 6};
        int expected = 1;
        int res = new LeetCode2009().minOperations(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {1, 10, 100, 1000};
        int expected = 3;
        int res = new LeetCode2009().minOperations(nums);
        Assertions.assertEquals(expected, res);
    }
}
