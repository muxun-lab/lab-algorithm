package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyfive;

import java.util.PriorityQueue;

/**
 * 题号: 100232
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-operations-to-exceed-threshold-value-ii">超过阈值的最少操作数 II</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。
 * <p>
 * 一次操作中，你将执行：
 * <p>
 * <li>选择 nums 中最小的两个整数 x 和 y 。
 * <li>将 x 和 y 从 nums 中删除。
 * <li>将 min(x, y) * 2 + max(x, y) 添加到数组中的任意位置。
 * <li>注意，只有当 nums 至少包含两个元素时，你才可以执行以上操作。
 * <p>
 * 你需要使数组中的所有元素都大于或等于 k ，请你返回需要的 最少 操作次数。
 * @author 慕勋
 * @created 2024-03-02
 */
public class LeetCode100232 {

    /**
     * 思路: 堆排序
     * @param nums 数组
     * @param k    整数k
     * @return 最少操作次数
     */
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        PriorityQueue<Long> sort = new PriorityQueue<>();
        for (int num : nums) {
            sort.add((long) num);
        }
        while (sort.peek() < k) {
            long x = sort.poll();
            long y = sort.poll();
            long temp = Math.min(x, y) * 2 + Math.max(x, y);
            sort.add(temp);
            ans++;
        }
        return ans;
    }
}
