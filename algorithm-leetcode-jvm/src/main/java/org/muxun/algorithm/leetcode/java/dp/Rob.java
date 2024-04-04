package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：198
 * 题目：打家劫舍
 * 详情：你是一个专业的小偷，计划偷窃沿街的房屋
 * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警
 * 给定一个代表每个房屋存放金额的非负整数数组
 * 计算你在不触动警报装置的情况下，能够偷窃到的最高金额
 * @author 慕勋
 * @created 2020-03-14
 */
public class Rob {

    /**
     * 思路：动态规划
     * 状态定义：dp[i]是给定位置的最大金额
     * 状态转移：当i >= 2时，有两种情况：
     * * dp[i - 2] + nums[i]
     * * dp[i - 1]
     * 初始值：dp[0]=nums[0],dp[1]=nums[1]
     * 返回值：max，可偷窃的最高金额
     * @param nums 给定的房屋藏有的金额
     * @return 可偷窃的最高金额
     */
    public int rob(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
