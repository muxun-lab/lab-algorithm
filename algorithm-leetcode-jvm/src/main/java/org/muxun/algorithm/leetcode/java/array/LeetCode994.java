package org.muxun.algorithm.leetcode.java.array;

import java.util.LinkedList;

/**
 * 题号: 994
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/rotting-oranges">腐烂的橘子</a>
 * <p>
 * 详情: 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
 * <p>
 * * 值 0 代表空单元格；
 * * 值 1 代表新鲜橘子；
 * * 值 2 代表腐烂的橘子。
 * * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
 * <p>
 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 * @author 慕勋
 * @created 2024-03-12
 */
public class LeetCode994 {

    /**
     * 思路: 广度优先遍历
     * @param grid 二维矩阵
     * @return 最短遍历时间
     */
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        LinkedList<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        int ans = 0;
        while (count > 0 && !queue.isEmpty()) {
            ans++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] index = queue.poll();
                int x = index[0];
                int y = index[1];
                if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                    count--;
                    grid[x - 1][y] = 2;
                    queue.add(new int[]{x - 1, y});
                }
                if (x + 1 < m && grid[x + 1][y] == 1) {
                    count--;
                    grid[x + 1][y] = 2;
                    queue.add(new int[]{x + 1, y});
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                    count--;
                    grid[x][y - 1] = 2;
                    queue.add(new int[]{x, y - 1});
                }
                if (y + 1 < n && grid[x][y + 1] == 1) {
                    count--;
                    grid[x][y + 1] = 2;
                    queue.add(new int[]{x, y + 1});
                }
            }
        }
        if (count > 0) {
            return -1;
        }
        return ans;
    }
}
