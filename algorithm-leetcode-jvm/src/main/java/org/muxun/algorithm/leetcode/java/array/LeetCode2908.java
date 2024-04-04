package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 2908
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-sum-of-mountain-triplets-i">元素和最小的山形三元组 I</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数数组 nums 。
 * <p>
 * 如果下标三元组 (i, j, k) 满足下述全部条件，则认为它是一个 山形三元组 ：
 * <p>
 * <li> i < j < k
 * <li> nums[i] < nums[j] 且 nums[k] < nums[j]
 * 请你找出 nums 中 元素和最小 的山形三元组，并返回其 元素和 。如果不存在满足条件的三元组，返回 -1 。
 * @author 慕勋
 * @created 2024-03-29
 */
public class LeetCode2908 {

    /**
     * 思路: 双指针
     * 1. 找出右指针比左指针大的数
     * 2. 从右指针开始找到比右指针更小的数
     * @param nums 数组
     * @return 最小山行三元组的元素之和
     */
    public int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        min = Math.min(min, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    /**
     * 思路: 前后缀分解
     * @param nums 数组
     * @return 最小山行三元组的元素之和
     */
    public int minimumSumPrefix(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        int[] prefix = new int[n];
        suffix[n - 1] = nums[n - 1];
        prefix[0] = nums[0];
        for (int i = n - 2; i > 1; i--) {
            suffix[i] = Math.min(suffix[i + 1], nums[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            prefix[i] = Math.min(prefix[i - 1], nums[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            int cur = nums[i];
            if (prefix[i - 1] < cur && suffix[i + 1] < cur) {
                ans = Math.min(ans, prefix[i - 1] + nums[i] + suffix[i + 1]);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
