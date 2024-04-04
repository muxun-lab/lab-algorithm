package org.muxun.algorithm.leetcode.java.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 题号: 128
 * 题目: 最长连续序列
 * 链接: <a href="https://leetcode.cn/problems/longest-consecutive-sequence">最长连续序列</a>
 * 详情: 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * @author 慕勋
 * @created 2024/2/11
 */
public class LeetCode128 {

    /**
     * 思路: 集合思想
     * 找到起始元素，判断起点
     * @param nums 整数数组
     * @return 最长连续子序列的长度
     */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int num : set) {
            // 判断num是否是连续子序列的第一个，不是第一个的话则继续向前寻找
            if (set.contains(num - 1)) {
                continue;
            }
            int length = 1;
            int current = num + 1;
            while (set.contains(current)) {
                length++;
                current++;
            }
            result = Math.max(result, length);
        }
        return result;
    }

    /**
     * 思路: 动态规划
     * @param nums 整数数组
     * @return 最长连续子序列的长度
     */
    public int longestConsecutiveByDP(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }
            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);
            int length = 1 + left + right;
            result = Math.max(result, length);
            map.put(num, length);
            // 由于新加入个一个数，两个端点的数字可能会增加，所以修改一下端点对应最大的长度
            map.put(num - left, length);
            map.put(num + right, length);
        }
        return result;
    }
}
