package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-17
 */
@DisplayName("搜索旋转排序数组测试用例")
public class LeetCode33Test {

    @Test
    public void testOne() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        int res = new LeetCode33().search(nums, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        int res = new LeetCode33().search(nums, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {1};
        int target = 0;
        int expected = -1;
        int res = new LeetCode33().search(nums, target);
        Assertions.assertEquals(expected, res);
    }
}
