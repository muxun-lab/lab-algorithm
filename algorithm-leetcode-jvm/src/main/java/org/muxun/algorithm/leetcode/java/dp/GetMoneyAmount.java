package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：375
 * 题目：猜数字大小II
 * 详情：
 * 我们正在玩一个猜数游戏，游戏规则如下：
 * 我从1到n之间选择一个数字，你来猜我选了哪个数字
 * 每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了
 * 然而，当你猜了数字x并且猜错了的时候，你需要支付金额为x的现金
 * 直到你猜到我选的数字，你才算赢得了这个游戏
 * @author 慕勋
 * @created 2020-03-16
 */
public class GetMoneyAmount {

    /**
     * 思路：暴力
     * @param n 选择的数n
     * @return 猜中数需要的至少金额数
     */
    public int getMoneyAmountViolence(int n) {
        return calculate(1, n);
    }

    private int calculate(int low, int high) {
        if (low >= high) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = low; i <= high; i++) {
            // 当前选取的值，左半部分和右半部分的最大值
            int result = i + Math.max(calculate(i + 1, high), calculate(low, i - 1));
            // 和当前存储的值做一个取最小值的操作
            min = Math.min(min, result);
        }
        return min;
    }

    /**
     * 思路：动态规划
     * 状态定义：dp[1][n]为猜1~n数字不重复的情况下支付的金额
     * 转移方程：dp[1][3] = max(1+dp[2][3], 2+dp[1][1], 2+dp[3][3], 3+dp[1][2])
     * 初始值：dp[1][1]=0
     * 返回值：dp[1][n]
     * @param n 选择的数n
     * @return 猜中数需要的至少金额数
     */
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        dp[1][1] = 0;
        // 取最大值便于取最小值
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i <= n; i++) {
            dp[i][i] = 0;
        }
        for (int j = 2; j <= n; j++) {
            // 自下而上进行填充，比如先填4和2
            for (int i = j - 1; i >= 1; i--) {
                for (int k = i + 1; k < j; k++) {
                    // 获取当前选举的数字，向左选取和向右选取的最大值
                    int result = k + Math.max(dp[i][k - 1], dp[k + 1][j]);
                    // 和当前值取最小值
                    dp[i][j] = Math.min(result, dp[i][j]);
                }
                // 计算边界部分，比如[1][3] [3][3]部分
                dp[i][j] = Math.min(dp[i][j], i + dp[i + 1][j]);
                dp[i][j] = Math.min(dp[i][j], j + dp[i][j - 1]);
            }
        }
        return dp[1][n];
    }
}
