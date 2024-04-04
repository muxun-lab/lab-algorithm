package org.muxun.algorithm.leetcode.java.array;

import org.muxun.algorithm.leetcode.java.Lack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题号: 2617
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-number-of-visited-cells-in-a-grid">网格图中最少访问的格子数</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的 m x n 整数矩阵 grid 。你一开始的位置在 左上角 格子 (0, 0) 。
 * <p>
 * 当你在格子 (i, j) 的时候，你可以移动到以下格子之一：
 * <li> 满足 j < k <= grid[i][j] + j 的格子 (i, k) （向右移动），或者
 * <li> 满足 i < k <= grid[i][j] + i 的格子 (k, j) （向下移动）。
 * 请你返回到达 右下角 格子 (m - 1, n - 1) 需要经过的最少移动格子数，如果无法到达右下角格子，请你返回 -1 。
 * @author 慕勋
 * @created 2024-03-22
 */
@Lack
public class LeetCode2617 {

    /**
     * 思路:
     * @param grid 二维矩阵
     * @return 最少移动格子数量
     */
    public int minimumVisitedCells(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], 1);
        }
        dist[0][0] = 1;
        PriorityQueue<int[]>[] rows = new PriorityQueue[m];
        PriorityQueue<int[]>[] cols = new PriorityQueue[n];
        for (int i = 0; i < m; i++) {
            rows[i] = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        }
        for (int i = 0; i < n; i++) {
            cols[i] = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (!rows[i].isEmpty() && rows[i].peek()[1] + grid[i][rows[i].peek()[1]] < j) {
                    rows[i].poll();
                }
                if (!rows[i].isEmpty()) {
                    dist[i][j] = update(dist[i][j], dist[i][rows[i].peek()[1]] + 1);
                }

                while (!cols[j].isEmpty() && cols[j].peek()[1] + grid[cols[j].peek()[1]][j] < i) {
                    cols[j].poll();
                }
                if (!cols[j].isEmpty()) {
                    dist[i][j] = update(dist[i][j], dist[cols[j].peek()[1]][j] + 1);
                }

                if (dist[i][j] != -1) {
                    rows[i].offer(new int[]{dist[i][j], j});
                    cols[j].offer(new int[]{dist[i][j], i});
                }
            }
        }
        return dist[m - 1][n - 1];
    }

    private int update(int x, int y) {
        return x == -1 || y < x ? y : x;
    }
}
