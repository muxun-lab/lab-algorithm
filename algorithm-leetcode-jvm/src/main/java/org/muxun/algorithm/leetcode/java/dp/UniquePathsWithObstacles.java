package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：63
 * 题目：不同路径II
 * 详情：一个机器人位于一个m x n网格的左上角（起始点在下图中标记为“Start”）
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）
 * 现在考虑网格中有障碍物
 * 那么从左上角到右下角将会有多少条不同的路径
 * @author 慕勋
 * @created 2020-03-19
 */
public class UniquePathsWithObstacles {

    /**
     * 思路：动态规划
     * 状态定义：dp[i][j]为当前位置需要的最小路径
     * 转移方程：dp[i][j]=dp[i-1][j]+dp[i][j-1]
     * 初始值：dp[0][0]=1
     * 返回值：dp[m][n]
     * @param obstacleGrid 网格矩阵
     * @return 到达终点的不同路径数
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            if (obstacleGrid[i - 1][0] == 1) {
                break;
            }
            dp[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if (obstacleGrid[0][i - 1] == 1) {
                break;
            }
            dp[1][i] = 1;
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (obstacleGrid[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
