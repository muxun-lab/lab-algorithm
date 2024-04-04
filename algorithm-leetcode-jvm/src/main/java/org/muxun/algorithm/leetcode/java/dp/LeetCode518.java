package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：518
 * <p>
 * 题目：<a href="https://leetcode-cn.com/problems/coin-change-2/">零钱兑换 II</a>
 * <p>
 * 详情：给定不同面额的硬币和一个总金额
 * <p>
 * 写出函数来计算可以凑成总金额的硬币组合数
 * <p>
 * 假设每一种面额的硬币有无限个
 * @author 慕勋
 * @date 2020/6/1
 */
public class LeetCode518 {

    /**
     * 思路：动态规划
     * 状态定义：前i个硬币，总金额为j时，有dp[i][j]中方法凑法
     * 转移方程：dp[i][j]=
     * @param amount 总金额
     * @param coins  不同面额的硬币
     * @return 凑成总金额的硬币组合
     */
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        // 初始值，目标金额为0，则凑法只有一种，就是不凑
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                // 如果可以继续凑，则获取上一次凑硬币的结果+当前硬币的金额组成的最大次数
                if (j - coins[i - 1] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                } else {
                    // 不可以继续凑，则直接获取上一次凑硬币的结果
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
