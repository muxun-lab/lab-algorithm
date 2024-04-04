package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 2684
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/maximum-number-of-moves-in-a-grid/description/">矩阵中移动的最大次数</a>
 * <p>
 * 详情: 给你一个下标从 0 开始、大小为 m x n 的矩阵 grid ，矩阵由若干 正 整数组成。
 * <p>
 * 你可以从矩阵第一列中的 任一 单元格出发，按以下方式遍历 grid ：
 * <li> 从单元格 (row, col) 可以移动到 (row - 1, col + 1)、(row, col + 1) 和 (row + 1, col + 1) 三个单元格中任一满足值 严格 大于当前单元格的单元格。
 * 返回你在矩阵中能够 移动 的 最大 次数。
 * @author 慕勋
 * @created 2024-03-16
 */
public class LeetCode2684 {

    private int[][] grid;

    private int m;

    private int n;

    private int ans;

    /**
     * 思路: 深度优先遍历
     * @param grid 二维矩阵
     * @return 可移动的最大次数
     */
    public int maxMoves(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.ans = 0;
        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, dfs(i, 0));
        }
        return ans;
    }

    private int dfs(int i, int j) {
        int top = 0;
        int right = 0;
        int bottom = 0;
        int cur = grid[i][j];
        grid[i][j] = 0;
        if (i - 1 >= 0 && j + 1 < n && grid[i - 1][j + 1] != 0 && grid[i - 1][j + 1] > cur) {
            top = 1 + dfs(i - 1, j + 1);
        }
        if (j + 1 < n && grid[i][j + 1] != 0 && grid[i][j + 1] > cur) {
            right = 1 + dfs(i, j + 1);
        }
        if (i + 1 < m && j + 1 < n && grid[i + 1][j + 1] != 0 && grid[i + 1][j + 1] > cur) {
            bottom = 1 + dfs(i + 1, j + 1);
        }
        return Math.max(top, Math.max(right, bottom));
    }
}
