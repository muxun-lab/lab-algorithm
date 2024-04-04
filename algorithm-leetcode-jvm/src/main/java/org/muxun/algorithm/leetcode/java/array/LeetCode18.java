package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题号：18
 * 题目：<a href="https://leetcode.cn/problems/4sum">四数之和</a>
 * 详情：给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 * <p>
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * @author 慕勋
 * @created 2020-01-30
 */
public class LeetCode18 {

    /**
     * 思路：在三数之和{@link LeetCode15}基础之上，再多加一层for循环和与上一个已处理元素的等值判断
     * @param nums   整数数组
     * @param target 目标值
     * @return 四数之和等于目标值的所有不重复情况列表
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return resultList;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) {
                    continue;
                }
                int start = j + 1;
                int end = n - 1;
                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum > target) {
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        List<Integer> currentList = new ArrayList<>();
                        currentList.add(nums[i]);
                        currentList.add(nums[j]);
                        currentList.add(nums[start]);
                        currentList.add(nums[end]);
                        resultList.add(currentList);
                        while (start < end && nums[start] == nums[++start])
                            ;
                        while (start < end && nums[end] == nums[--end])
                            ;
                    }
                }
            }
        }
        return resultList;
    }
}

