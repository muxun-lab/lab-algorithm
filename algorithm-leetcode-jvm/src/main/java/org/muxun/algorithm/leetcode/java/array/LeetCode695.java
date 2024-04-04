package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：695
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/max-area-of-island">岛屿的最大面积</a>
 * <p>
 * 详情：给定一个包含了一些0和1的非空二维数组grid。
 * <p>
 * 一个岛屿是由四个方向 (水平或垂直) 的1(代表土地) 构成的组合，你可以假设二维矩阵的四个边缘都被水包围着。
 * <p>
 * 找到给定的二维数组中最大的岛屿面积。
 * <p>
 * 如果没有岛屿，则返回面积为0
 * @author 慕勋
 * @created 2020-03-15
 */
public class LeetCode695 {

    /**
     * 思路：深度优先搜索
     * @param grid 给定的含有0，1的矩阵数组
     * @return 矩阵中的1连通的最大面积
     */
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] lineArray = grid[i];
            for (int j = 0; j < lineArray.length; j++) {
                int current = dfs(grid, i, j);
                max = Math.max(max, current);
            }
        }
        return max;
    }

    public int dfs(int[][] grid, int startLine, int startColumn) {
        if (startLine < 0 || startColumn < 0 || startLine >= grid.length || startColumn >= grid[0].length) {
            return 0;
        }
        if (grid[startLine][startColumn] != 1) {
            return 0;
        }
        // 搜索过的标记为2，避免再次搜索
        grid[startLine][startColumn] = 2;
        // 向左遍历，直到遇到0
        int left = dfs(grid, startLine - 1, startColumn);
        // 向右遍历，直到遇到0
        int right = dfs(grid, startLine + 1, startColumn);
        // 向上遍历，直到遇到0
        int up = dfs(grid, startLine, startColumn - 1);
        // 向下遍历，直到遇到0
        int down = dfs(grid, startLine, startColumn + 1);
        return left + right + up + down + 1;
    }
}
