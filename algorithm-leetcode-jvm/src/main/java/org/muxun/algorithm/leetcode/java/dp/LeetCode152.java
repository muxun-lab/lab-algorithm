package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号: 152
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/maximum-product-subarray">乘积最大子数组</a>
 * <p>
 * 详情: 给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * <p>
 * 测试用例的答案是一个 32-位 整数。
 * <p>
 * 子数组 是数组的连续子序列。
 * @author 慕勋
 * @created 2024-3-7
 */
public class LeetCode152 {

    /**
     * 思路: 伪动态规划
     * @param nums 数组
     * @return 最大乘积
     */
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        System.arraycopy(nums, 0, max, 0, n);
        System.arraycopy(nums, 0, min, 0, n);
        for (int i = 1; i < n; i++) {
            // 如果都是正数，默认采用的计算方式是，上一位的最大乘积和当前值的最大值
            // 但是可能出现负负得正，超过正数相乘的情况，所以这里可以可以计算一个最小值，看会不会出现负负得正的情况
            max[i] = Math.max(max[i - 1] * nums[i], Math.max(nums[i], nums[i] * min[i - 1]));
            min[i] = Math.min(min[i - 1] * nums[i], Math.min(nums[i], nums[i] * max[i - 1]));
        }
        int ans = max[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, max[i]);
        }
        return ans;
    }
}
