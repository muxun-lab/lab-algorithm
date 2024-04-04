package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 题号：56
 * 题目：合并区间
 * 题链：https://leetcode-cn.com/problems/merge-intervals/
 * 详情：给出一个区间的集合，请合并所有重叠的区间
 * @author 慕勋
 * @date 2020/5/13
 */
public class MergeArea {

    /**
     * 思路：排序+遍历
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        List<int[]> resultList = new ArrayList<>();
        int m = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int i = 1; i < m; i++) {
            int[] area = intervals[i];
            int[] lastArea;
            if (!resultList.isEmpty()) {
                lastArea = resultList.get(resultList.size() - 1);
            } else {
                lastArea = intervals[i - 1];
            }
            boolean needMerge = area[0] <= lastArea[1] || area[1] <= lastArea[1];
            // 右区间属于左区间范围内，需要合并
            // 合并分为需要合并，不需要合并，不需要合并需要考虑第一个数组的情况
            if (needMerge) {
                lastArea[0] = Math.min(area[0], lastArea[0]);
                lastArea[1] = Math.max(area[1], lastArea[1]);
                if (resultList.isEmpty()) {
                    resultList.add(lastArea);
                } else {
                    resultList.set(resultList.size() - 1, lastArea);
                }
            } else {
                if (resultList.isEmpty()) {
                    resultList.add(lastArea);
                }
                resultList.add(area);
            }
        }
        return resultList.toArray(new int[resultList.size()][2]);
    }
}
