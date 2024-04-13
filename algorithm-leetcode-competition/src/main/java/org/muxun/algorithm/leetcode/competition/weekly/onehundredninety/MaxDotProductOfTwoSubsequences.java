package org.muxun.algorithm.leetcode.competition.weekly.onehundredninety;

import java.util.Arrays;

/**
 * 题号：5419
 * 题目：两个子序列的最大点积
 * 题链：https://leetcode-cn.com/problems/max-dot-product-of-two-subsequences/
 * 详情：给你两个数组 nums1 和 nums2
 * 请你返回 nums1 和 nums2 中两个长度相同的 非空 子序列的最大点积
 * 数组的非空子序列是通过删除原数组中某些元素（可能一个也不删除）后剩余数字组成的序列
 * 但不能改变数字间相对顺序
 * 比方说，[2,3,5] 是 [1,2,3,4,5] 的一个子序列而 [1,5,3] 不是
 * @author sunshine
 * @created 2020-05-24
 */
public class MaxDotProductOfTwoSubsequences {

    /**
     * 思路：动态规划
     * @param nums1 序列1
     * @param nums2 序列2
     * @return 最大子序列点机
     */
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mdp = new int[n];
        int[] ndp = new int[n];
        Arrays.fill(mdp, Integer.MIN_VALUE);
        Arrays.fill(ndp, Integer.MIN_VALUE);
        int result = Integer.MIN_VALUE;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int current = nums1[i] * nums2[j];
                if (j == n - 1) {
                    mdp[j] = Math.max(ndp[j], current);
                } else {
                    int temp;
                    if (ndp[j + 1] != Integer.MIN_VALUE) {
                        temp = Math.max(current + ndp[j + 1], current);
                    } else {
                        temp = current;
                    }
                    mdp[j] = Math.max(ndp[j], temp);
                }
                result = Math.max(mdp[j], result);
            }
            ndp[n - 1] = mdp[n - 1];
            for (int k = n - 2; k >= 0; k--) {
                ndp[k] = Math.max(mdp[k], ndp[k + 1]);
            }
        }
        return result;
    }
}
