package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：746
 * 题目：使用最小花费爬楼梯
 * 详情：数组的每个索引做为一个阶梯，第i个阶梯对应着一个非负数的体力花费值cost[i](索引从0开始)
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯
 * 您需要找到达到楼层顶部的最低花费
 * 在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯
 * @author 慕勋
 * @created 2020-03-14
 */
public class MinCostClimbingStairs {

    /**
     * 思路：动态规划
     * 状态定义：dp[i]为爬到此层楼梯时消耗的最少体力数
     * 转移方程：登第i级台阶时，有两种登法：
     * 1. 从i-2级台阶登起
     * 2. 从i-1级台阶登起
     * 由于第i级台阶消耗的体力是固定的，只取上面两种情况体力消耗最少的情况即可
     * 初始值：dp[0]=cost[0], dp[1]=cost[1]
     * 返回：min(dp[i-2], dp[i-1])
     * @param cost 爬每层楼梯花费的体力
     * @return 爬楼梯消耗最少体力数
     */
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length];
        // 前两级台阶必然是独自上比较快
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        // 最后两级台阶都可以到达最顶端，需要计算下二者的最小值
        return Math.min(dp[cost.length - 2], dp[cost.length - 1]);
    }
}
