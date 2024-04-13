package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyfive;

/**
 * 题号: 100231
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-operations-to-exceed-threshold-value-i">超过阈值的最少操作数 I</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。
 * <p>
 * 一次操作中，你可以删除 nums 中的最小元素。
 * <p>
 * 你需要使数组中的所有元素都大于或等于 k ，请你返回需要的 最少 操作次数。
 * @author 慕勋
 * @created 2024-03-02
 */
public class LeetCode100231 {

    /**
     * 思路: 循环一次即可
     * @param nums 数组
     * @param k    最小值
     * @return 最少操作次数
     */
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for (int n : nums) {
            if (n < k) {
                ans++;
            }
        }
        return ans;
    }
}
