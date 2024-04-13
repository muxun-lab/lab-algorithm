package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyfour;

/**
 * 题号: 3034
 * 题目: 匹配模式数组的子数组数目 I
 * 链接: <a href="https://leetcode.cn/problems/number-of-subarrays-that-match-a-pattern-i">匹配模式数组的子数组数目 I</a>
 * 详情: 给你一个下标从 0 开始长度为 n 的整数数组 nums，
 * 和一个下标从 0 开始长度为 m 的整数数组 pattern ，pattern 数组只包含整数 -1 ，0 和 1 。
 * 大小为 m + 1 的子数组
 * nums[i..j] 如果对于每个元素 pattern[k] 都满足以下条件，那么我们说这个子数组匹配模式数组 pattern ：
 * 如果 pattern[k] == 1 ，那么 nums[i + k + 1] > nums[i + k]
 * 如果 pattern[k] == 0 ，那么 nums[i + k + 1] == nums[i + k]
 * 如果 pattern[k] == -1 ，那么 nums[i + k + 1] < nums[i + k]
 * 请你返回匹配 pattern 的 nums 子数组的 数目 。
 * @author 慕勋
 * @created 2024/2/12
 */
public class LeetCode3034 {

    /**
     * 思路: 暴力
     * @param nums    指定数组
     * @param pattern 模式匹配数组
     * @return 模式匹配的子数组数量
     */
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int m = nums.length;
        int n = pattern.length;
        int ans = 0;
        for (int i = 0; i < m - n; i++) {
            boolean match = true;
            for (int j = i; j < i + n; j++) {
                if (pattern[j - i] == 1) {
                    if (nums[j + 1] <= nums[j]) {
                        match = false;
                    }
                } else if (pattern[j - i] == 0) {
                    if (nums[j + 1] != nums[j]) {
                        match = false;
                    }
                } else {
                    if (nums[j + 1] >= nums[j]) {
                        match = false;
                    }
                }
            }
            if (match) {
                ans++;
            }
        }
        return ans;
    }

    /**
     * 思路: KMP
     * @param nums    指定数组
     * @param pattern 模式匹配数组
     * @return 模式匹配的子数组数量
     */
    public int countMatchingSubarraysByKMP(int[] nums, int[] pattern) {
        int m = nums.length;
        int n = pattern.length;
        int[] next = new int[n + 1];
        next[0] = -1;
        // 构造前缀表，整体右移一位
        int pre = -1;
        for (int i = 0; i < n; i++) {
            // 回退
            while (pre >= 0 && pattern[i] != pattern[pre]) {
                pre = next[pre];
            }
            pre++;
            next[i + 1] = pre;
            if (i < n - 1 && pattern[i + 1] == pattern[pre]) {
                next[i + 1] = next[pre];
            }
        }
        int ans = 0;
        // 进行kmp匹配，将(nums[i], nums[i-1])构造为kmp中的一个字符
        // 接下来就是kmp纯匹配了
        for (int i = 1, j = 0; i < m; i++) {
            int compare = Integer.compare(nums[i], nums[i - 1]);
            while (j >= 0 && pattern[j] != compare) {
                j = next[j];
            }
            j++;
            if (j == n) {
                ans++;
                j = next[j];
            }
        }
        return ans;
    }
}
