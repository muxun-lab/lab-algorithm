package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;

/**
 * 题号：16
 * 题目：最接近的三数之和
 * 详情：给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。
 * 假定每组输入只存在唯一答案。
 * @author 慕勋
 * @created 2020-01-30
 */
public class ThreeSumClosest {

    /**
     * 思路：双指针
     * @param nums   给定的整数数组
     * @param target 目标值
     * @return 最接近目标值的三数之和
     */
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                // 比较三数之和是不是更接近目标值
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                // 因为已经排序，所以如果超过了目标值，就取一个小一些的数
                // 没有超过目标值，就取大一些的数
                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    // 如果命中目标值，直接返回目标值，因为题目要求值存在唯一答案
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 思路：双指针
     * 优化掉已经计算过的值
     * @param nums   给定的整数数组
     * @param target 目标值
     * @return 最接近目标值的三数之和
     */
    public int threeSumClosestOptimization(int[] nums, int target) {
        int result = nums[1] + nums[2] + nums[3];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                // 此时判断一次最小值，如果最小值比target目标还要大，则后面的循环无需进行下去
                int min = nums[i] + nums[start] + nums[end];
                if (target < min) {
                    if (Math.abs(target - min) < Math.abs(target - result)) {
                        result = min;
                    }
                    break;
                }
                // 计算最大值，和正常的逻辑相同
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                if (sum > target) {
                    end--;
                    // 相同的值，直接跳过
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if (sum < target) {
                    start++;
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                } else {
                    return result;
                }
            }
            // 去掉重复计算
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }
}
