package org.muxun.algorithm.leetcode.java.array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题号：215
 * 题目：<a href="https://leetcode.cn/problems/kth-largest-element-in-an-array">数组中第K个最大元素</a>
 * 详情：在未排序的数组中找到第 k 个最大的元素。
 * <p>
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * @author 慕勋
 * @created 2020-02-09
 */
public class LeetCode215 {

    /**
     * 思路：小顶堆
     * @param nums 给定的未排序数组
     * @param k    第K个最大的元素
     * @return 第K个最大的元素
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> resultQueue = new PriorityQueue<>(Comparator.comparingInt(n -> n));
        for (int num : nums) {
            resultQueue.add(num);
            if (resultQueue.size() > k) {
                resultQueue.poll();
            }
        }
        return resultQueue.poll();
    }

    /**
     * 思路：小顶堆的具体实现
     * @param nums 给定的未排序数组
     * @param k    第K个最大的元素
     * @return 第K个最大的元素
     */
    public int findKthLargestUpgrade(int[] nums, int k) {
        buildHeap(nums, k);
        for (int i = k; i < nums.length; i++) {
            if (nums[i] < nums[0]) {
                continue;
            }
            swap(nums, i, 0);
            heapify(nums, k, 0);
        }
        return nums[0];
    }

    /**
     * 构建堆
     * @param nums 给定的数组
     * @param k    堆的大小
     */
    private void buildHeap(int[] nums, int k) {
        for (int i = k / 2 - 1; i >= 0; i--) {
            heapify(nums, k, i);
        }
    }

    /**
     * @param nums 给定的数组
     * @param k
     * @param i
     */
    private void heapify(int[] nums, int k, int i) {
        int minPosition = 1;
        while (true) {
            // 和左子节点比较
            if (i * 2 + 1 < k && nums[i * 2 + 1] < nums[i]) {
                minPosition = i * 2 + 1;
            }
            // 和右子节点比较
            if (i * 2 + 2 < k && nums[i * 2 + 2] < nums[minPosition]) {
                minPosition = i * 2 + 2;
            }
            // 如果minPosition没有发生变化，证明堆顶元素是最小了，跳出调整
            if (minPosition == i) {
                break;
            }
            // 否则进行交换
            swap(nums, i, minPosition);
            // 父节点下标更新，继续小顶堆
            i = minPosition;
        }
    }

    private void swap(int[] nums, int n, int m) {
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }
}
