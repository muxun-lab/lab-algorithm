package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyseven;

/**
 * 题号: 100272
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/biweekly-contest-127/problems/shortest-subarray-with-or-at-least-k-i">或值至少 K 的最短子数组 I</a>
 * <p>
 * 详情: 给你一个 非负 整数数组 nums 和一个整数 k 。
 * <p>
 * 如果一个数组中所有元素的按位或运算 OR 的值 至少 为 k ，那么我们称这个数组是 特别的 。
 * <p>
 * 请你返回 nums 中 最短特别非空 子数组的长度，如果特别子数组不存在，那么返回 -1 。
 * @author 慕勋
 * @created 2024-03-30
 */
public class LeetCode100272 {

    /**
     * 思路: 暴力
     * @param nums 数组
     * @param k    阈值
     * @return 最短子数组长度
     */
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            sum |= nums[i];
            if (sum >= k) {
                ans = Math.min(ans, 1);
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                sum |= nums[j];
                if (sum >= k) {
                    ans = Math.min(ans, j - i + 1);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
