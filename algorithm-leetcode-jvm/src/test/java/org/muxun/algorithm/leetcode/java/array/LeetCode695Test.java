package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-15
 */
@DisplayName("岛屿的最大面积测试用例")
public class LeetCode695Test {

    @Test
    public void maxAreaOfIslandTestOne() {
        int[][] matrix = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int res = new LeetCode695().maxAreaOfIsland(matrix);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void maxAreaOfIslandTestTwo() {
        int[][] matrix = {{0, 0, 0, 0, 0, 0, 0, 0}};
        int res = new LeetCode695().maxAreaOfIsland(matrix);
        int expected = 0;
        Assertions.assertEquals(expected, res);
    }
}
