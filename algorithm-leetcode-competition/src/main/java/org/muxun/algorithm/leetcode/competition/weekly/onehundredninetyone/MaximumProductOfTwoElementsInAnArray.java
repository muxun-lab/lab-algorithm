package org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone;

/**
 * 题号：数组中两元素的最大乘积
 * 题目：5424
 * 题链：https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 * 详情：给你一个整数数组 nums
 * 请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值
 * 请你计算并返回该式的最大值
 * @author sunshine
 * @created 2020-05-31
 */
public class MaximumProductOfTwoElementsInAnArray {

    /**
     * 思路：暴力
     * @param nums 整数数组
     * @return 公式计算的最大值
     */
    public int maxProduct(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
            }
        }
        return max;
    }
}
