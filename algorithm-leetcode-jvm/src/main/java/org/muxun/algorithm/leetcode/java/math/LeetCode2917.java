package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号: 2917
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-the-k-or-of-an-array">找出数组中的K-or值</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。
 * <p>
 * nums 中的 K-or 是一个满足以下条件的非负整数：
 * * 只有在 nums 中，至少存在 k 个元素的第 i 位值为 1 ，那么 K-or 中的第 i 位的值才是 1 。
 * <p>
 * 返回 nums 的 K-or 值。
 * 注意 ：对于整数 x ，如果 (2i AND x) == 2i ，则 x 中的第 i 位值为 1 ，其中 AND 为按位与运算符。
 * @author 慕勋
 * @created 2024-03-06
 */
public class LeetCode2917 {

    /**
     * 思路: 看不懂题目，直接复制粘贴走人
     * @param nums 数组
     * @param k    整数K
     * @return K-or值
     */
    public int findKOr(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < 31; i++) {
            int cnt1 = 0;
            for (int x : nums) {
                cnt1 += x >> i & 1;
            }
            if (cnt1 >= k) {
                ans |= 1 << i;
            }
        }
        return ans;
    }
}
