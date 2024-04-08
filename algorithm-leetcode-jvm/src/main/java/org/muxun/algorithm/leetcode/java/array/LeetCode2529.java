package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 2529
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer">正整数和负整数的最大计数</a>
 * <p>
 * 详情: 给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。
 * <p>
 * <li> 换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。
 * 注意：0 既不是正整数也不是负整数。
 * @author 慕勋
 * @created 2024-04-09
 */
public class LeetCode2529 {

    /**
     * 思路: 二分查找
     * 由于数组是非递减顺序，所以查找第一个0数字和第一个1数字
     * @param nums 数组
     * @return 最大值
     */
    public int maximumCount(int[] nums) {
        int zeroIndex = binarySearch(nums, 0);
        int oneIndex = binarySearch(nums, 1);
        return Math.max(zeroIndex, nums.length - oneIndex);
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
