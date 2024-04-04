package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/24
 */
@DisplayName("不同岛屿的数量测试用例")
public class LeetCode694Test {

    @Test
    public void testOne() {
        int[][] grid = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        int expected = 1;
        int res = new LeetCode694().numDistinctIslands(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{1, 1, 0, 1, 1}, {1, 0, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 1, 1}};
        int expected = 3;
        int res = new LeetCode694().numDistinctIslands(grid);
        Assertions.assertEquals(expected, res);
    }
}
