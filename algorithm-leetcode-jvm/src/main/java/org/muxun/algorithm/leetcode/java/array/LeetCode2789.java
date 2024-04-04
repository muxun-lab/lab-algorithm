package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 2789
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/largest-element-in-an-array-after-merge-operations">合并后数组中的最大元素</a>
 * <p>
 * 详情: 给你一个下标从 0 开始、由正整数组成的数组 nums 。
 * <p>
 * 你可以在数组上执行下述操作 任意 次：
 * <p>
 * * 选中一个同时满足 0 <= i < nums.length - 1 和 nums[i] <= nums[i + 1] 的整数 i 。将元素 nums[i + 1] 替换为 nums[i] + nums[i + 1] ，并从数组中删除元素 nums[i] 。
 * <p>
 * 返回你可以从最终数组中获得的 最大 元素的值。
 * @author 慕勋
 * @created 2024-03-14
 */
public class LeetCode2789 {

    /**
     * 思路: 正常思路是从正向进行暴力循环
     * 但是如果从后面开始逐步前移，直到第一个为止，即可以算出最大值
     * @param nums 数组
     * @return 合并后的最大值
     */
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long sum = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= sum) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
        }
        return sum;
    }
}
