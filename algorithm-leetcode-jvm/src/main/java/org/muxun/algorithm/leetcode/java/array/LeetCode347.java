package org.muxun.algorithm.leetcode.java.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 题号: 347
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/top-k-frequent-elements">前 K 个高频元素</a>
 * <p>
 * 详情: 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 * @author 慕勋
 * @created 2024-03-10
 */
public class LeetCode347 {

    /**
     * 思路: 最小堆
     * @param nums 数组
     * @param k    高频元素个数
     * @return 结果集
     */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            int[] arr = new int[]{num, count};
            if (queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(arr);
                }
            } else {
                queue.offer(arr);
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll()[0];
        }
        return ans;
    }
}
