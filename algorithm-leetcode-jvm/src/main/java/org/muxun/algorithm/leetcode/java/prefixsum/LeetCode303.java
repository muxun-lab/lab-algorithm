package org.muxun.algorithm.leetcode.java.prefixsum;

/**
 * 题号: 303
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/range-sum-query-immutable">区域和检索 - 数组不可变</a>
 * <p>
 * 详情: 给定一个整数数组  nums，处理以下类型的多个查询:
 * <p>
 * 计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right
 * <p>
 * 实现 NumArray 类：
 * <li>NumArray(int[] nums) 使用数组 nums 初始化对象
 * <li>int sumRange(int i, int j) 返回数组 nums 中索引 left 和 right 之间的元素的 总和 ，包含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] )
 * @author 慕勋
 * @created 2024-03-18
 */
public class LeetCode303 {

    private final int[] sums;

    /**
     * 思路: 前缀和
     * @param nums 数组
     */
    public LeetCode303(int[] nums) {
        int n = nums.length;
        this.sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
