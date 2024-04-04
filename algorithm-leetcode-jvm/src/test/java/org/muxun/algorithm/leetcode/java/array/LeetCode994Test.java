package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-15
 */
@DisplayName("腐烂的橘子测试用例")
public class LeetCode994Test {

    @Test
    public void testOne() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int expected = 4;
        int res = new LeetCode994().orangesRotting(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int expected = -1;
        int res = new LeetCode994().orangesRotting(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[][] grid = {{0, 2}};
        int expected = 0;
        int res = new LeetCode994().orangesRotting(grid);
        Assertions.assertEquals(expected, res);
    }
}
