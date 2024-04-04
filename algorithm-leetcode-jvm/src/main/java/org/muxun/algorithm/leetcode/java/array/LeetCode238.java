package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 238
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/product-of-array-except-self">除自身以外数组的乘积</a>
 * <p>
 * 详情: 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * <p>
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 * <p>
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * @author 慕勋
 * @created 2024/2/18
 */
public class LeetCode238 {

    /**
     * 思路: 数学计算的方式
     * 不与自身相乘，可以判定为自身为1
     * @param nums 指定数组
     * @return 数组乘积
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        int[] ans = new int[n];
        leftArr[0] = 1;
        rightArr[n - 1] = 1;
        // 计算当前值左侧的乘积
        for (int i = 1; i < n; i++) {
            leftArr[i] = nums[i - 1] * leftArr[i - 1];
        }
        // 计算当前值右侧的乘积
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = nums[i + 1] * rightArr[i + 1];
        }
        // 左右相乘
        for (int i = 0; i < n; i++) {
            ans[i] = leftArr[i] * rightArr[i];
        }
        return ans;
    }
}
