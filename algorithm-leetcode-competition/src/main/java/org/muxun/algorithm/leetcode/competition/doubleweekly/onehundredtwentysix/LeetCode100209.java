package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentysix;

import java.util.PriorityQueue;

/**
 * 题号: 100209
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/biweekly-contest-126/problems/mark-elements-on-array-by-performing-queries/">执行操作标记数组中的元素</a>
 * <p>
 * 详情: 给你一个长度为 n 下标从 0 开始的正整数数组 nums 。
 * <p>
 * 同时给你一个长度为 m 的二维操作数组 queries ，其中 queries[i] = [indexi, ki] 。
 * <p>
 * 一开始，数组中的所有元素都 未标记 。
 * <p>
 * 你需要依次对数组执行 m 次操作，第 i 次操作中，你需要执行：
 * <p>
 * <li>如果下标 indexi 对应的元素还没标记，那么标记这个元素。
 * <li>然后标记 ki 个数组中还没有标记的 最小 元素。如果有元素的值相等，那么优先标记它们中下标较小的。如果少于 ki 个未标记元素存在，那么将它们全部标记。
 * 请你返回一个长度为 m 的数组 answer ，其中 answer[i]是第 i 次操作后数组中还没标记元素的 和 。
 * @author 慕勋
 * @created 2024-03-16
 */
public class LeetCode100209 {

    /**
     * 思路:
     * 1. 使用优先级队列
     * 2. 记录总和，然后不断减少总和，避免重复计算
     * @param nums    数组
     * @param queries 操作
     * @return 未标记元素之和
     */
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int m = nums.length;
        int n = queries.length;
        long[] arr = new long[n];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        // 初始化优先队列
        for (int i = 0; i < m; i++) {
            queue.offer(new int[]{nums[i], i});
        }
        // 计算总和
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        // 处理每个查询
        for (int i = 0; i < n; i++) {
            int index = queries[i][0];
            int size = queries[i][1];
            // 标记
            if (nums[index] != 0) {
                totalSum -= nums[index];
                nums[index] = 0;
            }
            // 从优先队列中移除已标记的元素
            while (!queue.isEmpty() && size > 0) {
                int[] temp = queue.poll();
                int y = temp[1];
                if (nums[y] != 0) {
                    totalSum -= nums[y];
                    nums[y] = 0;
                    size--;
                }
            }
            // 计算当前总和
            arr[i] = totalSum;
        }
        return arr;
    }
}
