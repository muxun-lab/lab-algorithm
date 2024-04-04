package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：34
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array">在排序数组中查找元素的第一个和最后一个位置</a>
 * <p>
 * 详情：
 * <p>
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * @author 慕勋
 * @created 2020-02-17
 */
public class LeetCode34 {

    /**
     * 思路: 使用二分查找第一个target索引和第一个大于target的索引
     * @param nums   给定的正序数组
     * @param target 进行搜索的目标值
     * @return 给定目标值在数组内的范围
     */
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return new int[]{-1, -1};
        }
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false) - 1;
        if (left <= right && right < n && nums[left] == target && nums[right] == target) {
            return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }

    private int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
