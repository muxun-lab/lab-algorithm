package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-15
 */
@DisplayName("使二叉树所有路径值相等的最小代价测试用例")
public class LeetCode2673Test {

    @Test
    public void testOne() {
        int n = 7;
        int[] cost = {1, 5, 2, 2, 3, 3, 1};
        int expected = 6;
        int res = new LeetCode2673().minIncrements(n, cost);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 3;
        int[] cost = {5, 3, 3};
        int expected = 0;
        int res = new LeetCode2673().minIncrements(n, cost);
        Assertions.assertEquals(expected, res);
    }
}
