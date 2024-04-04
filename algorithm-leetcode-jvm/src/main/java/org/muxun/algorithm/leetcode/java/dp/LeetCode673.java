package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：673
 * 题目：最长递增子序列的个数
 * 详情：给定一个未排序的整数数组 nums 返回最长递增子序列的个数 。
 * 注意 这个数列必须是 严格 递增的。
 */
public class LeetCode673 {

    /**
     * 思路：动态规划
     * 定义：dp[i]为nums[i]结尾的最长上升子序列，cnt[i]为num[i]结尾的最长上升子序列的个数
     * 设nums最长子序列的个数为maxLength
     * dp[i]=max(dp[j])+1
     * @param nums 整数数组
     * @return 最长上升子序列的个数
     */
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        int ans = 0;
        int[] dp = new int[n];
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            // 最小值肯定是1
            dp[i] = 1;
            cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                // 可以继续上升
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        cnt[i] = cnt[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        // 已经达到最大了，计数累加一下
                        cnt[i] += cnt[j];
                    }
                }
            }
            // 如果累加的值超过了最大长度，那么记下最大长度，并记下达到最大长度的次数
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                ans = cnt[i];
            } else if (dp[i] == maxLength) {
                ans += cnt[i];
            }
        }
        return ans;
    }
}

