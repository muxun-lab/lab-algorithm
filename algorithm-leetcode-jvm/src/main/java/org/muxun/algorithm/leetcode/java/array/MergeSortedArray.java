package org.muxun.algorithm.leetcode.java.array;

/**
 * 合并两个有序数组
 * 题目：No.88
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组
 * ·初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * ·你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * @author 慕勋
 * @date 2020/1/21
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从nums1数组的右侧开始
        int right = m + n;
        for (int i = right - 1; i >= 0; i--) {
            if (m > 0 && n > 0) {
                if (nums1[m - 1] >= nums2[n - 1]) {
                    nums1[i] = nums1[--m];
                } else {
                    nums1[i] = nums2[--n];
                }
            } else if (n > 0) {
                System.arraycopy(nums2, 0, nums1, 0, n);
            }
        }
    }
}
