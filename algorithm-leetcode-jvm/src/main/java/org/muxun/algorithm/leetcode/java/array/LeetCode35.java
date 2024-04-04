package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 35
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/search-insert-position">搜索插入的位置</a>
 * <p>
 * 详情: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * <p>
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * @author 慕勋
 * @date 2020/1/20
 */
public class LeetCode35 {

    /**
     * 思路: 二分查找
     * 需要使用O(log n)的算法
     * @param nums   数组
     * @param target 目标值
     * @return 索引位置
     */
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
