package org.muxun.algorithm.leetcode.java.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 题号：219
 * 题目：存在重复元素 II
 * 题链：https://leetcode-cn.com/problems/contains-duplicate-ii/
 * 详情：给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
 * 使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * @author 慕勋
 * @created 2020-01-29
 */
public class ContainsNearbyDuplicate {

    /**
     * 思路：滑动窗口思想
     * k个索引跨度是个窗口，从头开始遍历数组，让元素依次添加到set中
     * 如果超出窗口后，仍没有满足的条件，则删除左面超出窗口的元素
     * 如果在窗口内存在nums[i]==nums[j]，则符合条件
     * @param nums 给定的整数数组
     * @param k    等值索引差值的绝对值
     * @return 是否存在等值索引差值绝对值的情况
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (tempSet.contains(nums[i])) {
                return true;
            }
            tempSet.add(nums[i]);
            if (tempSet.size() > k) {
                tempSet.remove(nums[i - k]);
            }
        }
        return false;
    }
}
