package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 1793
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/maximum-score-of-a-good-subarray">好子数组的最大分数</a>
 * <p>
 * 详情: 给你一个整数数组 nums （下标从 0 开始）和一个整数 k 。
 * <p>
 * 一个子数组 (i, j) 的 分数 定义为 min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1) 。一个 好 子数组的两个端点下标需要满足 i <= k <= j 。
 * <p>
 * 请你返回 好 子数组的最大可能 分数 。
 * @author 慕勋
 * @created 2024-03-19
 */
public class LeetCode1793 {

    /**
     * 思路: 双指针
     * 1. 从起点开始，分别向左和向右进行遍历
     * 谁更大，就移动谁，如果相同，随便移动哪个指针都可以，记录长度的最小值和面积的最大值
     * @param nums 数组
     * @param k    分割索引
     * @return 题目定义的最大分数
     */
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int min = nums[k];
        int ans = nums[k];
        int left = k;
        int right = k;
        for (int i = 0; i < n - 1; i++) {
            if (right == n - 1 || left > 0 && nums[left - 1] > nums[right + 1]) {
                min = Math.min(min, nums[--left]);
            } else {
                min = Math.min(min, nums[++right]);
            }
            ans = Math.max(ans, min * (right - left + 1));
        }
        return ans;
    }
}
