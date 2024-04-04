package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;

/**
 * 题号: 252
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/meeting-rooms/description">会议室</a>
 * <p>
 * 详情: 给定一个会议时间安排的数组 intervals ，每个会议时间都会包括开始和结束的时间 intervals[i] = [starti, endi]
 * <p>
 * 请你判断一个人是否能够参加这里面的全部会议。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode252 {

    /**
     * 思路: 排序
     * @param intervals 会议时间安排
     * @return 可否参加全部会议
     */
    public boolean canAttendMeetings(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) {
            return true;
        }
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            int[] cur = intervals[i];
            int[] next = intervals[i + 1];
            if (cur[1] > next[0]) {
                return false;
            }
        }
        return true;
    }
}
