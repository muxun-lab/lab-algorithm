package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 题号: 56
 * <p>
 * 链接: 合并区间
 * <p>
 * 详情: 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 * @author 慕勋
 * @created 2024/2/18
 */
public class LeetCode56 {

    /**
     * 思路:
     * @param intervals 区间集合
     * @return 不重叠的区间数组
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a1, a2) -> a2[0] - a1[0]);
        LinkedList<int[]> resList = new LinkedList<>();
        resList.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            int[] last = resList.getLast();
            if (cur[0] <= last[1]) {
                last[1] = Math.max(cur[1], last[1]);
            } else {
                resList.add(cur);
            }
        }
        return resList.toArray(new int[0][0]);
    }
}
