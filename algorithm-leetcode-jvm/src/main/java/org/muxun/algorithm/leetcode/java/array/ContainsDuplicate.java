package org.muxun.algorithm.leetcode.java.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目：存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 题号：217
 * @author 慕勋
 * @created 2020-01-29
 */
public class ContainsDuplicate {

    /**
     * 借助外界条件
     * @param nums 给定的整数数组
     * @return 是否包含重复元素
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> tempList = new HashSet<>();
        for (int num : nums) {
            if (tempList.contains(num)) {
                return true;
            }
            tempList.add(num);
        }
        return false;
    }

    /**
     * 执行时间提升优化
     * 失败
     * @param nums 给定的整数数组
     * @return 是否包含重复元素
     */
    public boolean containsDuplicateOptimizationOne(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}