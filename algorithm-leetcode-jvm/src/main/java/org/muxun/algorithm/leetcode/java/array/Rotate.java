package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：189
 * 题目：数组移位
 * 题链：https://leetcode-cn.com/problems/rotate-array/
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 说明:
 * * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * * 要求使用空间复杂度为 O(1) 的 原地 算法。
 * @author 慕勋
 * @date 2018-12-26 19:44
 */
public class Rotate {

    /**
     * 思路：递归
     * 转换数组，采用归并的思想
     * 先将数组中所有的元素进行旋转
     * 然后以k为分界线，前后分别进行翻转
     * @param nums 给定的数组
     * @param k    向右移动k个位置
     */
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * 环装替换
     * @param nums 给定的数组
     * @param k    向右移动k个位置
     */
    public void rotateUpgrade(int[] nums, int k) {

    }
}
