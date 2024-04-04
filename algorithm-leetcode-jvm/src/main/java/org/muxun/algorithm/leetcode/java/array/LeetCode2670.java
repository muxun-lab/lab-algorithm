package org.muxun.algorithm.leetcode.java.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 题号: 2670
 * 题目: 找出不同元素数目差数组
 * 链接: <a href="https://leetcode.cn/problems/find-the-distinct-difference-array">找出不同元素数目差数组</a>
 * 详情: 给你一个下标从 0 开始的数组 nums ，数组长度为 n
 * nums 的 不同元素数目差 数组可以用一个长度为 n 的数组 diff 表示，其中 diff[i] 等于前缀 nums[0, ..., i] 中不同元素的数目 减去 后缀 nums[i + 1, ..., n - 1] 中不同元素的数目
 * 返回 nums 的 不同元素数目差 数组
 * 注意 nums[i, ..., j] 表示 nums 的一个从下标 i 开始到下标 j 结束的子数组（包含下标 i 和 j 对应元素）。特别需要说明的是，如果 i > j ，则 nums[i, ..., j] 表示一个空子数组
 * @author 慕勋
 * @created 2024/1/31
 */
public class LeetCode2670 {

    /**
     * 思路: 哈希表
     * 利用HashSet的特性先计算不重复元素的序列
     * 然后再循环一次取值
     * @param nums 指定数组
     * @return 不同元素数目差数组
     */
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, HashSet<Integer>> prefix = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> suffix = new HashMap<>();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> temp = new HashSet<>(prefix.getOrDefault(i - 1, new HashSet<>()));
            temp.add(nums[i]);
            prefix.put(i, temp);
        }
        for (int j = n - 1; j >= 0; j--) {
            HashSet<Integer> temp = new HashSet<>(suffix.getOrDefault(j + 1, new HashSet<>()));
            temp.add(nums[j]);
            suffix.put(j, temp);
        }
        suffix.put(n, new HashSet<>());
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int diff = prefix.get(i).size() - suffix.get(i + 1).size();
            res[i] = diff;
        }
        return res;
    }

    /**
     * 思路: 上面的思路是正确的，不过可以进一步进行优化
     * 可以优化一下，只用一个HashSet，用数组进行记录，并减少一次循环
     * @param nums 指定数组
     * @return 不同元素数目差数组
     */
    public int[] distinctDifferenceArrayOptimization(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        // 最后一个数组索引需要再往右一格，这样可以不用判断索引是否溢出
        int[] sufCnt = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            sufCnt[i] = set.size();
        }
        int[] res = new int[n];
        set.clear();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            res[i] = set.size() - sufCnt[i + 1];
        }
        return res;
    }
}
