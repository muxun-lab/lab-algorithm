package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyseven;

/**
 * 题号: 100271
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/biweekly-contest-127/problems/shortest-subarray-with-or-at-least-k-ii">或值至少为 K 的最短子数组 II</a>
 * <p>
 * 详情: 给你一个 非负 整数数组 nums 和一个整数 k 。
 * <p>
 * 如果一个数组中所有元素的按位或运算 OR 的值 至少 为 k ，那么我们称这个数组是 特别的 。
 * <p>
 * 请你返回 nums 中 最短特别非空 子数组的长度，如果特别子数组不存在，那么返回 -1 。
 * @author 慕勋
 * @created 2024-03-30
 */
public class LeetCode100271 {

    /**
     * 思路: 双指针
     * 思路没错，需要怎么把左指针的数减去，这里使用的是二进制运算的知识
     * 把对应为1相减，然后变成十进制传回来
     * @param nums 数组
     * @param k    阈值
     * @return 最短子数组长度
     */
    public int minimumSubarrayLength(int[] nums, int k) {
        if (k == 0) {
            return 1;
        }
        if (nums[0] >= k) {
            return 1;
        }
        int[] sum = new int[30];
        int n = nums.length;
        int left = 0;
        int cnt = nums[0];
        add(sum, nums[0]);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            cnt = cnt | nums[i];
            add(sum, nums[i]);
            while (cnt >= k) {
                ans = Math.min(ans, i - left + 1);
                cnt = remove(sum, nums[left]);
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private void add(int[] sum, int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == '1') {
                sum[29 - (n - 1 - i)]++;
            }
        }
    }

    private int remove(int[] sum, int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == '1') {
                sum[29 - (n - 1 - i)]--;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            if (sum[i] == 0) {
                builder.append(0);
            }
            if (sum[i] != 0) {
                builder.append(1);
            }
        }
        return Integer.parseInt(builder.toString(), 2);
    }
}
