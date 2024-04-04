package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-22
 */
@DisplayName("网格图中最少访问的格子数测试用例")
public class LeetCode2617Test {

    @Test
    public void testOne() {
        int[][] grid = {{3, 4, 2, 1}, {4, 2, 3, 1}, {2, 1, 0, 0}, {2, 4, 0, 0}};
        int expected = 4;
        int res = new LeetCode2617().minimumVisitedCells(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{3, 4, 2, 1}, {4, 2, 1, 1}, {2, 1, 1, 0}, {3, 4, 1, 0}};
        int expected = 3;
        int res = new LeetCode2617().minimumVisitedCells(grid);
        Assertions.assertEquals(expected, res);
    }
}
