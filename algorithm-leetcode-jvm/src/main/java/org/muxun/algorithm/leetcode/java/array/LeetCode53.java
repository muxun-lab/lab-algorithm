package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 53
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/maximum-subarray">最大子数组和</a>
 * <p>
 * 详情: 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 子数组 是数组中的一个连续部分。
 * @author 慕勋
 * @created 2024/2/18
 */
public class LeetCode53 {

    /**
     * 思路: 动态规划
     * dp[i] = max(dp[i-1] + dp[i], dp[i])
     * @param nums 数组
     * @return 最大子数组和
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        int max = nums[0];
        for (int num : dp) {
            max = Math.max(max, num);
        }
        return max;
    }
}
