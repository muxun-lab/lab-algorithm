package org.muxun.algorithm.leetcode.java.binarysearch;

/**
 * 题号: 287
 * 题目: 寻找重复数
 * 链接: <a href="https://leetcode.cn/problems/find-the-duplicate-number">寻找重复数</a>
 * 详情: 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 [1, n] 范围内（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设 nums 只有 一个重复的整数 ，返回 这个重复的数 。
 * 你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。
 * @author 慕勋
 * @created 2024/2/13
 */
public class LeetCode287 {

    /**
     * 思路: 环形链表
     * @param nums 指定数组
     * @return 重复的数
     */
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = next(nums, slow);
            fast = next(nums, next(nums, fast));
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = next(nums, slow);
            fast = next(nums, fast);
        }
        return slow;
    }

    private int next(int[] nums, int index) {
        return nums[index];
    }
}
