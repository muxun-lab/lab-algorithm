package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 题号: 253
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/meeting-rooms-ii">会议室 II</a>
 * <p>
 * 详情: 给你一个会议时间安排的数组 intervals ，每个会议时间都会包括开始和结束的时间 intervals[i] = [starti, endi]
 * <p>
 * 返回 所需会议室的最小数量 。
 * @author 慕勋
 * @created 2024-04-01
 */
public class LeetCode253 {

    /**
     * 思路: 排序
     * 不仅仅是排序，还需要计算区间
     * @param intervals 会议室安排
     * @return 所需要的最小会议室数量
     */
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        int n = intervals.length;
        Integer[] start = new Integer[n];
        Integer[] end = new Integer[n];
        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(end, Comparator.comparingInt(o -> o));
        Arrays.sort(start, Comparator.comparingInt(o -> o));
        int i = 0;
        int j = 0;
        int room = 0;
        while (i < n) {
            if (start[i] >= end[j]) {
                room--;
                j++;
            }
            room++;
            i++;
        }
        return room;
    }
}
