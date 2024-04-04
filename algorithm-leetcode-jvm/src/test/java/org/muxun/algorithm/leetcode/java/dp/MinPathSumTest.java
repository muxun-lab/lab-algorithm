package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-17
 */
@DisplayName("最小路径和单元测试")
public class MinPathSumTest {

    @Test
    public void minPathSumTestOne() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assertions.assertEquals(7, new MinPathSum().minPathSum(grid));
    }

    @Test
    public void minPathSumWithNoSpaceTestOne() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assertions.assertEquals(7, new MinPathSum().minPathSumWithNoSpace(grid));
    }

    @Test
    public void minPathSumDynamicProgrammingOneDimensionalTestOne() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assertions.assertEquals(7, new MinPathSum().minPathSumDynamicProgrammingOneDimensional(grid));
    }
}
