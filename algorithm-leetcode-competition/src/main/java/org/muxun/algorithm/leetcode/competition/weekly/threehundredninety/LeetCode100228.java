package org.muxun.algorithm.leetcode.competition.weekly.threehundredninety;

/**
 * 题号: 100228
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-390/problems/apply-operations-to-make-sum-of-array-greater-than-or-equal-to-k">执行操作使数据元素之和大于等于 K</a>
 * <p>
 * 详情: 给你一个正整数 k 。最初，你有一个数组 nums = [1] 。
 * <p>
 * 你可以对数组执行以下 任意 操作 任意 次数（可能为零）：
 * <p>
 * <li> 选择数组中的任何一个元素，然后将它的值 增加 1 。
 * <li> 复制数组中的任何一个元素，然后将它附加到数组的末尾。
 * 返回使得最终数组元素之 和 大于或等于 k 所需的 最少 操作次数。
 * @author 慕勋
 * @created 2024-03-24
 */
public class LeetCode100228 {

    /**
     * 思路: 贪心算法
     * 1. 先加到指定值
     * 2. 然后再复制
     * @param k 阈值
     * @return 最少操作次数
     */
    public int minOperations(int k) {
        int count = 0;
        int mid = (int) Math.floor(Math.sqrt(k));
        int num = 1;
        while (num != mid) {
            num++;
            count++;
        }
        while (num < k) {
            count++;
            num += mid;
        }
        return count;
    }
}
