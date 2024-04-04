package org.muxun.algorithm.leetcode.java.array;

import java.util.LinkedList;

/**
 * 题号: 1696
 * 题目: 跳跃游戏 VI
 * 链接: <a href="https://leetcode.cn/problems/jump-game-vi">跳跃游戏 VI</a>
 * 详情: 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。
 * 一开始你在下标 0 处。每一步，你最多可以往前跳 k 步，但你不能跳出数组的边界。
 * 也就是说，你可以从下标 i 跳到 [i + 1， min(n - 1, i + k)] 包含 两个端点的任意位置。
 * 你的目标是到达数组最后一个位置（下标为 n - 1 ），你的 得分 为经过的所有数字之和。
 * 请你返回你能得到的 最大得分 。
 * @author 慕勋
 * @created 2024/2/5
 */
public class LeetCode1696 {

    /**
     * 思路: 动态规划
     * 转移方程：dp[i]为到达当前节点可以获得的最大得分
     * @param nums 指定数组
     * @param k    最大跳跃步数
     * @return 最大得分
     */
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                max = Math.max(max, dp[i - j]);
            }
            dp[i] = nums[i] + max;
        }
        return dp[n - 1];
    }

    /**
     * 思路: 动态规划+双端队列
     * 使用双端队列优化滑动窗口，以更快速的方式获得最大空间
     * @param nums 指定数组
     * @param k    最大跳跃步数
     * @return 最大得分
     */
    public int maxResultByDeque(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        LinkedList<Integer> deque = new LinkedList<>();
        deque.offerLast(0);
        for (int i = 1; i < n; i++) {
            while (deque.peekFirst() < i - k) {
                deque.pollFirst();
            }
            dp[i] = dp[deque.peekFirst()] + nums[i];
            while (!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return dp[n - 1];
    }
}
