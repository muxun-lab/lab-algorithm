package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 100280
 * <p>
 * 题目: <a href="https://leetcode.cn/contest/biweekly-contest-128/problems/minimum-rectangles-to-cover-points">覆盖所有点的最少矩形数目</a>
 * <p>
 * 详情: 给你一个二维整数数组 point ，其中 points[i] = [xi, yi] 表示二维平面内的一个点。同时给你一个整数 w 。你需要用矩形 覆盖所有 点。
 * <p>
 * 每个矩形的左下角在某个点 (x1, 0) 处，且右上角在某个点 (x2, y2) 处，其中 x1 <= x2 且 y2 >= 0 ，同时对于每个矩形都 必须 满足 x2 - x1 <= w 。
 * <p>
 * 如果一个点在矩形内或者在边上，我们说这个点被矩形覆盖了。
 * <p>
 * 请你在确保每个点都 至少 被一个矩形覆盖的前提下，最少 需要多少个矩形。
 * <p>
 * 注意：一个点可以被多个矩形覆盖。
 * @author 慕勋
 * @created 2024-04-13
 */
public class LeetCode100280 {

    /**
     * 思路: 比较x轴的差值即可，一次遍历
     * @param points 点坐标数组
     * @param w      矩形的最大宽度
     * @return 使用矩形的数量
     */
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        // 获取前缀区间
        List<Integer> widthList = new ArrayList<>();
        for (int[] point : points) {
            widthList.add(point[0]);
        }
        Collections.sort(widthList);
        int end = widthList.get(0) + w;
        int ans = 1;
        for (int i = 1; i < widthList.size(); i++) {
            int cur = widthList.get(i);
            if (cur <= end) {
                continue;
            }
            ans++;
            end = cur + w;
        }
        return ans;
    }
}
