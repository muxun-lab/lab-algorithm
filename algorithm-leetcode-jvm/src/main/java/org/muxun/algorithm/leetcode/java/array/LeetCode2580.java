package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 题号: 2580
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/count-ways-to-group-overlapping-ranges">统计将重叠区间合并成组的方案数</a>
 * <p>
 * 详情: 给你一个二维整数数组 ranges ，其中 ranges[i] = [starti, endi] 表示 starti 到 endi 之间（包括二者）的所有整数都包含在第 i 个区间中。
 * <p>
 * 你需要将 ranges 分成 两个 组（可以为空），满足：
 * <p>
 * 每个区间只属于一个组。
 * 两个有 交集 的区间必须在 同一个 组内。
 * 如果两个区间有至少 一个 公共整数，那么这两个区间是 有交集 的。
 * <p>
 * 比方说，区间 [1, 3] 和 [2, 5] 有交集，因为 2 和 3 在两个区间中都被包含。
 * 请你返回将 ranges 划分成两个组的 总方案数 。由于答案可能很大，将它对 109 + 7 取余 后返回。
 * @author 慕勋
 * @created 2024-03-27
 */
public class LeetCode2580 {

    private static final int MOD = 1000000007;

    /**
     * 思路: 合并区间的思想
     * 1. 先对数组进行排序
     * 2. 然后对区间进行合并
     * 3. 最后存在多个不同的集合，那么结果就是2 ^ n
     * @param ranges 二维数组，存储区间
     * @return 总方案数
     */
    public int countWays(int[][] ranges) {
        int ans = 1;
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        int n = ranges.length;
        int i = 0;
        while (i < n) {
            int r = ranges[i][1];
            int j = i + 1;
            while (j < n && ranges[j][0] <= r) {
                r = Math.max(r, ranges[j][1]);
                j++;
            }
            ans = ans * 2 % MOD;
            i = j;
        }
        return ans;
    }
}
