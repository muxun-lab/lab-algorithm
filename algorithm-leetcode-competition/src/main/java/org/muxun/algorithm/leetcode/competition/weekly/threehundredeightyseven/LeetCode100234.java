package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyseven;

/**
 * 题号: 234
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-operations-to-write-the-letter-y-on-a-grid">在矩阵上写出字母 Y 所需的最少操作次数</a>
 * <p>
 * 详情: 给你一个下标从 0 开始、大小为 n x n 的矩阵 grid ，其中 n 为奇数，且 grid[r][c] 的值为 0 、1 或 2 。
 * <p>
 * 如果一个单元格属于以下三条线中的任一一条，我们就认为它是字母 Y 的一部分：
 * <p>
 * 从左上角单元格开始到矩阵中心单元格结束的对角线。
 * 从右上角单元格开始到矩阵中心单元格结束的对角线。
 * 从中心单元格开始到矩阵底部边界结束的垂直线。
 * 当且仅当满足以下全部条件时，可以判定矩阵上写有字母 Y ：
 * <p>
 * 属于 Y 的所有单元格的值相等。
 * 不属于 Y 的所有单元格的值相等。
 * 属于 Y 的单元格的值与不属于Y的单元格的值不同。
 * 每次操作你可以将任意单元格的值改变为 0 、1 或 2 。返回在矩阵上写出字母 Y 所需的 最少 操作次数。
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode100234 {

    /**
     * 思路: 枚举法
     * @param grid 矩阵
     * @return 字母Y的最小操作次数
     */
    public int minimumOperationsToWriteY(int[][] grid) {
        int n = grid.length;
        int res = n * n;
        for (int i = 0; i <= 2; i++) {
            int changeForY = needChangeForY(grid, i);
            for (int j = 0; j <= 2; j++) {
                if (i == j) {
                    continue;
                }
                int changeForNotY = needChangeForNotY(grid, j);
                res = Math.min(res, changeForY + changeForNotY);
            }
        }
        return res;
    }

    /**
     * 把Y字锁在的位置，都改成目标t所需要的操作次数
     * @param grid 矩阵
     * @param t    目标值
     * @return 修改次数
     */
    public int needChangeForY(int[][] grid, int t) {
        int n = grid.length;
        int res = 0;
        for (int i = 0; i < n / 2; i++) {
            // 左上角的对角线
            if (grid[i][i] != t) {
                res++;
            }
            // 右上角对角线
            if (grid[i][n - 1 - i] != t) {
                res++;
            }
        }
        // 中心点向下
        for (int i = n / 2; i <= n - 1; i++) {
            if (grid[i][n / 2] != t) {
                res++;
            }
        }
        return res;
    }

    /**
     * 去除Y字所在的位置，其余部分修改的次数
     * @param grid 矩阵
     * @param t    目标值
     * @return 修改次数
     */
    public int needChangeForNotY(int[][] grid, int t) {
        int n = grid.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 左上角对角线位置
                if (i == j && i < n / 2) {
                    continue;
                }
                // 右上角对角线
                if (i + j == (n - 1) && i < n / 2) {
                    continue;
                }
                // 中心点向下
                if (i >= (n / 2) && j == (n / 2)) {
                    continue;
                }
                if (grid[i][j] != t) {
                    res++;
                }
            }
        }
        return res;
    }
}
