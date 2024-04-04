package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：64
 * 题目：最小路径和
 * 详情：给定一个包含非负整数的m x n网格
 * 请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
 * 说明：每次只能向下或者向右移动一步
 * @author 慕勋
 * @created 2020-03-17
 */
public class MinPathSum {

    /**
     * 思路：动态规划
     * 状态定义：dp[m][n]为m*n矩阵的最短路径
     * 转移方程：dp[m][n] = grid[m][n] + min(dp[m-1][n] + dp[m][n-1])
     * 初始值：dp[0][0]=grid[0][0]
     * 返回值：dp[m-1][n-1]
     * @param grid 矩阵数组
     * @return 从矩阵的左上角到右下角的最短路径
     */
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += grid[i][0];
            dp[i][0] = sum;
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += grid[0][i];
            dp[0][i] = sum;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * 思路：动态规划，不需要额外的数组和空间
     * 是对上面思路进行优化，可以自上而下进行，使用grid进行存储
     * @param grid 矩阵数组
     * @return 从矩阵的左上角到右下角的最短路径
     */
    public int minPathSumWithNoSpace(int[][] grid) {
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i != grid.length - 1 || j != grid[0].length - 1) {
                    if (j == grid[0].length - 1) {
                        grid[i][j] = grid[i][j] + grid[i + 1][j];
                    } else if (i == grid.length - 1) {
                        grid[i][j] = grid[i][j] + grid[i][j + 1];
                    } else {
                        grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j], grid[i][j + 1]);
                    }
                }
            }
        }
        return grid[0][0];
    }

    /**
     * 思路：动态规划
     * 只记录列，并使用最小值进行覆盖
     * @param grid 矩阵数组
     * @return 从矩阵的左上角到右下角的最短路径
     */
    public int minPathSumDynamicProgrammingOneDimensional(int[][] grid) {
        int[] dp = new int[grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j != grid[0].length - 1) {
                    // 垂直方向在边界上，需要向左移动
                    dp[j] = grid[i][j] + dp[j + 1];
                } else if (j == grid[0].length - 1 && i != grid.length - 1) {
                    // 垂直方向在边界上，需要向上移动
                    dp[j] = grid[i][j] + dp[j];
                } else if (i != grid.length - 1 && j != grid[0].length - 1) {
                    // 非矩阵角落节点处理dp[j]为向上移动，dp[j+1]为向左移动
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j + 1]);
                } else {
                    // 右下角节点处理
                    dp[j] = grid[i][j];
                }
            }
        }
        // 返回左上角记录的最短路径
        return dp[0];
    }
}
