package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 41
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/first-missing-positive">缺失的第一个正数</a>
 * <p>
 * 详情: 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 * @author 慕勋
 * @created 2024/2/17
 */
public class LeetCode41 {

    /**
     * 思路:
     * @param nums 指定数组
     * @return 缺失的第一个正数
     */
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
