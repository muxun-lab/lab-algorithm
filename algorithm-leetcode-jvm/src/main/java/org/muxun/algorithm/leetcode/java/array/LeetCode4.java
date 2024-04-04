package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 4
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/median-of-two-sorted-arrays">找两个正序数组的中位数</a>
 * <p>
 * 详情: 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * @author 慕勋
 * @created 2020-03-16
 */
public class LeetCode4 {

    /**
     * 思路：双指针
     * 如果总长度为基数的话，返回中间值即可
     * 否则返回两个中间相邻的数组，然后除以2即可
     * @param nums1 有序数组一
     * @param nums2 有序数组二
     * @return 给定的两个有序数组的中位数
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int medianIndex = (nums1.length + nums2.length) / 2;
        int i = 0;
        int j = 0;
        int count = 0;
        int first = 0;
        int second = 0;
        while (count <= medianIndex) {
            first = second;
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    second = nums2[j];
                    j++;
                } else {
                    second = nums1[i];
                    i++;
                }
            } else if (i >= nums1.length) {
                second = nums2[j];
                j++;
            } else {
                second = nums1[i];
                i++;
            }
            count++;
        }
        return ((nums1.length + nums2.length) & 1) == 0 ? (first + second) / 2.0 : second;
    }

    /**
     * 思路：递归
     * @param nums1 有序数组一
     * @param nums2 有序数组二
     * @return 给定的两个有序数组的中位数
     */
    public double findMedianSortedArraysUpgrade(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;
        // 将奇数和偶数的情况合并
        // 如果是奇数，则会求两次k
        return (getKth(nums1, nums2, 0, m - 1, 0, n - 1, left) + getKth(nums1, nums2, 0, m - 1, 0, n - 1, right)) * 0.5;
    }

    public int getKth(int[] nums1, int[] nums2, int start1, int end1, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        // 当有空数组时，则len1永远为空数组
        if (len1 > len2) {
            return getKth(nums2, nums1, start2, end2, start1, end2, k);
        }
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        // k=1时，谁最小，谁就是第k个数
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;
        // 求k/2位置的值，如果谁的值小，那么这个值的前面的值则不可能为第k个数
        // 继续求第k个数，直到k=1
        if (nums1[i] > nums2[j]) {
            return getKth(nums1, nums2, start1, end1, j + 1, end2, k - (j - start2 + 1));
        } else {
            return getKth(nums1, nums2, i + 1, end1, start2, end2, k - (i - start1 + 1));
        }
    }
}
