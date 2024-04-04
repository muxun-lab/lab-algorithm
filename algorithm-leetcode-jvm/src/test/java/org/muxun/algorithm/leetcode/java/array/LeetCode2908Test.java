package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-29
 */
@DisplayName("元素和最小的山形三元组 I测试用例")
public class LeetCode2908Test {

    @Test
    public void testOne() {
        int[] nums = {8, 6, 1, 5, 3};
        int expected = 9;
        int res = new LeetCode2908().minimumSum(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {5, 4, 8, 7, 10, 2};
        int expected = 13;
        int res = new LeetCode2908().minimumSum(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {6, 5, 4, 3, 4, 5};
        int expected = -1;
        int res = new LeetCode2908().minimumSum(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        int[] nums = {8, 6, 1, 5, 3};
        int expected = 9;
        int res = new LeetCode2908().minimumSumPrefix(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFive() {
        int[] nums = {5, 4, 8, 7, 10, 2};
        int expected = 13;
        int res = new LeetCode2908().minimumSumPrefix(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testSix() {
        int[] nums = {6, 5, 4, 3, 4, 5};
        int expected = -1;
        int res = new LeetCode2908().minimumSumPrefix(nums);
        Assertions.assertEquals(expected, res);
    }
}
