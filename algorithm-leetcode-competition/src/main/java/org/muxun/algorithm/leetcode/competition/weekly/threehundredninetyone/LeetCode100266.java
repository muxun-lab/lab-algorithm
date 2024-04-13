package org.muxun.algorithm.leetcode.competition.weekly.threehundredninetyone;

/**
 * 题号: 100266
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-391/problems/count-alternating-subarrays">交替子数组计数</a>
 * <p>
 * 详情: 给你一个二进制数组 nums 。
 * <p>
 * 如果一个子数组中 不存在 两个 相邻 元素的值 相同 的情况，我们称这样的子数组为 交替子数组 。
 * <p>
 * 返回数组 nums 中交替子数组的数量。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode100266 {

    /**
     * 思路:
     * @param nums 数组
     * @return 交替子数组的数量
     */
    public long countAlternatingSubarrays(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int left = 0;
        int right = 0;
        while (left < n && right < n) {
            if (right > 0 && nums[right] == nums[right - 1]) {
                left = right;
            }
            ans += right - left + 1;
            right++;
        }
        return ans;
    }
}
