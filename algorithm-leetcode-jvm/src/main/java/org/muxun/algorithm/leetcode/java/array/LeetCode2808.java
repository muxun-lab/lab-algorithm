package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 题号: 2808
 * 题目: 使循环数组所有元素相等的最少秒数
 * 链接: <a href="https://leetcode.cn/problems/minimum-seconds-to-equalize-a-circular-array">使循环数组所有元素相等的最少秒数</a>
 * 详情: 给你一个下标从 0 开始长度为 n 的数组 nums
 * 每一秒，你可以对数组执行以下操作：
 * 对于范围在 [0, n - 1] 内的每一个下标 i ，将 nums[i] 替换成 nums[i] ，nums[(i - 1 + n) % n] 或者 nums[(i + 1) % n] 三者之一。
 * 注意，所有元素会被同时替换。
 * 请你返回将数组 nums 中所有元素变成相等元素所需要的 最少 秒数。
 * @author 慕勋
 * @created 2024/1/30
 */
public class LeetCode2808 {

    /**
     * 思路: 哈希表，计算每个数扩散到所有位置的次数，找到最小值
     * 计算相邻x的索引值，找到最大距离，最大距离除以2并向下取整，就是数组全部变成x所需要的时间
     * @param nums 指定数组
     * @return 最小秒数
     */
    public int minimumSeconds(List<Integer> nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.size();
        // 标记元素所在的位置，方便计算元素扩散的时间
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums.get(i), k -> new ArrayList<>()).add(i);
        }
        int res = n;
        for (List<Integer> indexes : map.values()) {
            int seconds = 0;
            // 形成环形
            // 因为可以从当前位置向左扩散或向右扩散，需要分别计算最小值
            indexes.add(indexes.get(0) + n);
            for (int i = 1; i < indexes.size(); i++) {
                // 统计位置之间最大的需要覆盖的时间
                seconds = Math.max(seconds, (indexes.get(i) - indexes.get(i - 1)) / 2);
            }
            res = Math.min(seconds, res);
        }
        return res;
    }
}
