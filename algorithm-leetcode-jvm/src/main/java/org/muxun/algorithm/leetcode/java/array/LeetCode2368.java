package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 题号: 2368
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-the-k-sum-of-an-array">找出数组的第 K 大和</a>
 * <p>
 * 详情: 给你一个整数数组 nums 和一个 正 整数 k 。你可以选择数组的任一 子序列 并且对其全部元素求和。
 * <p>
 * 数组的 第 k 大和 定义为：可以获得的第 k 个 最大 子序列和（子序列和允许出现重复）
 * <p>
 * 返回数组的 第 k 大和 。
 * <p>
 * 子序列是一个可以由其他数组删除某些或不删除元素排生而来的数组，且派生过程不改变剩余元素的顺序。
 * <p>
 * 注意：空子序列的和视作 0 。
 * @author 慕勋
 * @created 2024-03-09
 */
public class LeetCode2368 {

    /**
     * 思路: 最小堆
     * @param nums 数组
     * @param k    第K大
     * @return 第K大和
     */
    public long kSum(int[] nums, int k) {
        int n = nums.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                total += nums[i];
            } else {
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);

        long ret = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>((a, b) -> Long.compare(a[0], b[0]));
        pq.offer(new long[]{nums[0], 0});
        for (int j = 2; j <= k; j++) {
            long[] arr = pq.poll();
            long t = arr[0];
            int i = (int) arr[1];
            ret = t;
            if (i == n - 1) {
                continue;
            }
            pq.offer(new long[]{t + nums[i + 1], i + 1});
            pq.offer(new long[]{t - nums[i] + nums[i + 1], i + 1});
        }
        return total - ret;
    }
}
