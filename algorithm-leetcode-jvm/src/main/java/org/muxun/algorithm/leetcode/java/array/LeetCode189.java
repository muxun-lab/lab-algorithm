package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 189
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/rotate-array">轮转数组</a>
 * <p>
 * 详情: 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * @author 慕勋
 * @created 2024/2/18
 */
public class LeetCode189 {

    /**
     * 思路: 轮转数组本质上是交换数字，相当于把后面k个数字和前面几个数接上
     * 额外数组空间此题非常简单，这里需要节省空间的写法
     * 其实简单来说就是翻转数组
     * @param nums 指定数组
     * @param k    轮转位置
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
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
}
