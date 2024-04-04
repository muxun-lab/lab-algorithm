package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：303
 * 题目：区域和检索——数组不可变
 * 详情：给定一个整数数组nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点
 * 说明：
 * * 你可以假设数组不可变。
 * * 会多次调用sumRange方法。
 * @author 慕勋
 * @created 2020-03-14
 */
public class NumArray {

    private int[][] dp;

    private final int length;

    private int[] sum;

    public NumArray(int[] nums) {
        if (nums.length <= 0) {
            length = -1;
            return;
        }
        length = nums.length;
        dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                dp[i][j] = sum;
            }
        }
    }

    public NumArray(int[] nums, int b) {
        if (nums.length <= 0) {
            length = -1;
            return;
        }
        length = nums.length;
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i >= length || j >= length) {
            return 0;
        }
        return dp[i][j];
    }

    public int sumRange(int i, int j, int b) {
        if (i >= length || j >= length) {
            return 0;
        }
        return sum[j + 1] - sum[i];
    }
}
