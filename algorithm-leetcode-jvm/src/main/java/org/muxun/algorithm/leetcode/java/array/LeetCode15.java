package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 题号：15
 * <p>
 * 题目：<a href="https://leetcode-cn.com/problems/3sum/">三数之和</a>
 * <p>
 * 详情：给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 * <p>
 * 请你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * @author 慕勋
 * @date 2020/1/20
 */
public class LeetCode15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[i]);
                    result.add(nums[left]);
                    result.add(nums[right]);
                    resultList.add(result);
                    while (left < right && nums[left] == nums[++left])
                        ;
                    while (left < right && nums[right] == nums[--right])
                        ;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    while (left < right && nums[left] == nums[++left])
                        ;
                } else {
                    while (left < right && nums[right] == nums[--right])
                        ;
                }
            }
        }
        return resultList;
    }
}
