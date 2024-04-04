package org.muxun.algorithm.leetcode.java.binarysearch;

/**
 * 题号: 153
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array">寻找旋转排序数组中的最小值</a>
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024-03-27
 */
public class LeetCode153 {

    /**
     * 思路: 二分查找
     * @param nums 数组
     * @return 数组中的最小元素
     */
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
