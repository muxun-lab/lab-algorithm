package org.muxun.algorithm.leetcode.java.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号: 1
 * 题目: 两数之和
 * 链接: <a href="https://leetcode.cn/problems/two-sum">两数之和</a>
 * 详情: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * @author 慕勋
 * @date 2020/1/20
 */
public class LeetCode1 {

    /**
     * 暴力穷举
     * @param nums   数组
     * @param target 目标值
     * @return 两数之和等于目标值的数组元素索引
     */
    public int[] twoSumFirstSolution(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return new int[0];
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return nums;
            } else {
                return new int[0];
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 使用HashMap
     * @param nums   数组
     * @param target 目标值
     * @return 两数之和等于目标值的数组元素索引
     */
    public int[] twoSumSecondSolution(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return new int[0];
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return nums;
            } else {
                return new int[0];
            }
        }
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.containsKey(nums[i])) {
                return new int[]{sumMap.get(nums[i]), i};
            }
            sumMap.put(target - nums[i], i);
        }
        return new int[0];
    }
}
