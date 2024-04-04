package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：62
 * 题目：不同路径
 * 详情：一个机器人位于一个m x n网格的左上角（起始点在下图中标记为“Start”）
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）
 * 问总共有多少条不同的路径？
 * @author 慕勋
 * @created 2020-03-17
 */
public class UniquePaths {

    /**
     * 思路：动态规划
     * 状态定义：dp[m][n]为矩阵是否可以通向中点
     * 转移方程：(m, n)处的格子，由于只能向右或者向下移动，所以只能通过(m,n)左面或者上面的各自进行访问，以此类推
     * 初始值：dp[1][1]=1，dp[1][2]=1，dp[2][1]=1，dp[2][2]=2
     * 返回值：dp[m][n]
     * @param m 矩阵长
     * @param n 矩阵宽
     * @return 到达矩阵的不同路径数
     */
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 0; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int i = 0; i <= n; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}
