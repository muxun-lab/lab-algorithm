package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-16
 */
@DisplayName("矩阵中移动的最大次数测试用例")
public class LeetCode2684Test {

    @Test
    public void testOne() {
        int[][] grid = {{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 11}, {10, 9, 13, 15}};
        int expected = 3;
        int res = new LeetCode2684().maxMoves(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{3, 2, 4}, {2, 1, 9}, {1, 1, 7}};
        int expected = 0;
        int res = new LeetCode2684().maxMoves(grid);
        Assertions.assertEquals(expected, res);
    }
}
