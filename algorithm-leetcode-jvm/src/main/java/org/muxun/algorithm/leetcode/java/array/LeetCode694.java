package org.muxun.algorithm.leetcode.java.array;

import java.util.HashSet;

/**
 * 题号: 694
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/number-of-distinct-islands">不同岛屿的数量</a>
 * <p>
 * 详情: 给定一个非空 01 二维数组表示的网格，一个岛屿由四连通（上、下、左、右四个方向）的 1 组成，你可以认为网格的四周被海水包围。
 * <p>
 * 请你计算这个网格中共有多少个形状不同的岛屿。两个岛屿被认为是相同的，当且仅当一个岛屿可以通过平移变换（不可以旋转、翻转）和另一个岛屿重合。
 * @author 慕勋
 * @created 2024/2/24
 */
public class LeetCode694 {

    /**
     * 思路:
     * @param grid 二维矩阵
     * @return 不同岛屿数量
     */
    public int numDistinctIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        HashSet<String> res = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, 0, sb);
                    res.add(sb.toString());
                }
            }
        }
        return res.size();
    }

    private void dfs(int[][] grid, int i, int j, int dir, StringBuilder sb) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return;
        }
        // 标记一下，避免找回来
        grid[i][j] = 0;
        sb.append(dir).append(',');
        // 向上
        dfs(grid, i - 1, j, 1, sb);
        // 向下
        dfs(grid, i + 1, j, 2, sb);
        // 向左
        dfs(grid, i, j - 1, 3, sb);
        // 向右
        dfs(grid, i, j + 1, 4, sb);
        // 返回
        sb.append(-dir).append(',');
    }
}
