package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 题号: 560
 * 题目: 和为 K 的子数组
 * 链接: <a href="https://leetcode.cn/problems/subarray-sum-equals-k">和为 K 的子数组</a>
 * 详情: 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数
 * 子数组是数组中元素的连续非空序列
 * @author 慕勋
 * @created 2024/1/30
 */
public class LeetCode560 {

    /**
     * 思路: 排序，然后使用前缀和
     * @param nums 指定数组
     * @param k    计算和
     * @return 子数组个数
     */
    public int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        // 前缀和 => 前缀和次数
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        int prefix = 0;
        int count = 0;
        for (int num : nums) {
            prefix += num;
            count += countMap.getOrDefault(prefix - k, 0);
            countMap.put(prefix, countMap.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    /**
     * 思路: 暴力是解决一切问题的办法
     * @param nums 指定数组
     * @param k    计算和
     * @return 子数组个数
     */
    public int subarraySumForce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
