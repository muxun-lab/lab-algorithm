package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/5
 */
@DisplayName("跳跃游戏 VI测试用例")
public class LeetCode1696Test {

    @Test
    public void testOne() {
        int[] nums = {1, -1, -2, 4, -7, 3};
        int k = 2;
        int res = new LeetCode1696().maxResult(nums, k);
        int expected = 7;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {10, -5, -2, 4, 0, 3};
        int k = 3;
        int res = new LeetCode1696().maxResult(nums, k);
        int expected = 17;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {1, -5, -20, 4, -1, 3, -6, -3};
        int k = 2;
        int res = new LeetCode1696().maxResult(nums, k);
        int expected = 0;
        Assertions.assertEquals(expected, res);
    }
}
