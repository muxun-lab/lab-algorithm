package org.muxun.algorithm.leetcode.java.array;

import java.util.*;

/**
 * 题号：532
 * 题目：数组中的K-diff对
 * 详情：给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。
 * 这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
 * @author 慕勋
 * @created 2020-02-29
 */
public class FindKDiffPairs {

    /**
     * 思路：双循环
     * @param nums 给定的整数数组
     * @param k    差值绝对值的目标值
     * @return 等于差值绝对值的目标值的整数对数
     */
    public int findPairs(int[] nums, int k) {
        if (nums.length <= 1) {
            return 0;
        }
        if (k < 0) {
            return 0;
        }
        if (nums.length == 2) {
            return Math.abs(nums[1] - nums[0]) == k ? 1 : 0;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[j - 1] && k != 0) {
                    continue;
                }
                int current = Math.abs(nums[i] - nums[j]);
                if (current == k) {
                    resultMap.put(i, j);
                }
            }
        }
        return resultMap.size();
    }

    /**
     * 思路：指针
     * @param nums 给定的整数数组
     * @param k    差值绝对值的目标值
     * @return 等于差值绝对值的目标值的整数对数
     */
    public int findPairsUpgrade(int[] nums, int k) {
        if (nums.length <= 1) {
            return 0;
        }
        if (k < 0) {
            return 0;
        }
        if (nums.length == 2) {
            return Math.abs(nums[1] - nums[0]) == k ? 1 : 0;
        }
        // 使用Set保证值不重复
        // 已遍历的数
        Set<Integer> alreadyHasSet = new HashSet<>();
        // 所有符合条件的记录
        Set<Integer> diffSet = new HashSet<>();
        for (int num : nums) {
            // 计算公式满足 x - y = k 和 y - x = k
            // 转换一下就是 x = y + k 和 x = y - k
            // 如果满足条件，就向记录Set中记录最小值(记录最大值也可以)
            if (alreadyHasSet.contains(num - k)) {
                diffSet.add(num - k);
            }
            if (alreadyHasSet.contains(num + k)) {
                diffSet.add(num);
            }
            alreadyHasSet.add(num);
        }
        // 返回记录的大小
        return diffSet.size();
    }
}
