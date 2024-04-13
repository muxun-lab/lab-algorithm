package org.muxun.algorithm.leetcode.competition.weekly.threehundredninety;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * 题号: 100258
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-390/problems/most-frequent-ids">最高频率的 ID</a>
 * <p>
 * 详情: 你需要在一个集合里动态记录 ID 的出现频率。给你两个长度都为 n 的整数数组 nums 和 freq ，nums 中每一个元素表示一个 ID ，对应的 freq 中的元素表示这个 ID 在集合中此次操作后需要增加或者减少的数目。
 * <p>
 * <li> 增加 ID 的数目：如果 freq[i] 是正数，那么 freq[i] 个 ID 为 nums[i] 的元素在第 i 步操作后会添加到集合中。
 * <li> 减少 ID 的数目：如果 freq[i] 是负数，那么 -freq[i] 个 ID 为 nums[i] 的元素在第 i 步操作后会从集合中删除。
 * 请你返回一个长度为 n 的数组 ans ，其中 ans[i] 表示第 i 步操作后出现频率最高的 ID 数目 ，如果在某次操作后集合为空，那么 ans[i] 为 0 。
 * @author 慕勋
 * @created 2024-03-24
 */
public class LeetCode100258 {

    /**
     * 思路:
     * 1. 记录每个数字出现的次数
     * 2. 记录每个频次出现的数字
     * @param nums 数组
     * @param freq 操作频次
     * @return 操作次数记录
     */
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        HashMap<Integer, Long> cnt = new HashMap<>();
        TreeMap<Long, HashSet<Integer>> sort = new TreeMap<>();
        int n = nums.length;
        long[] resArr = new long[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            long prevFreq = cnt.getOrDefault(num, 0L);
            long newFreq = prevFreq + freq[i];
            cnt.put(num, newFreq);
            if (prevFreq > 0L) {
                sort.get(prevFreq).remove(num);
                if (sort.get(prevFreq).isEmpty()) {
                    sort.remove(prevFreq);
                }
            }
            sort.putIfAbsent(newFreq, new HashSet<>());
            sort.get(newFreq).add(num);
            resArr[i] = !sort.isEmpty() ? sort.lastKey() : 0;
        }
        return resArr;
    }
}
