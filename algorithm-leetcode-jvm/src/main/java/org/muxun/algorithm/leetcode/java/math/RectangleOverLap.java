package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号：836
 * 题目：矩形重叠
 * 详情：矩形以列表[x1, y1, x2, y2]的形式表示
 * 其中(x1, y1)为左下角的坐标，(x2, y2)是右上角的坐标
 * 如果相交的面积为正，则称两矩形重叠
 * 需要明确的是，只在角或边接触的两个矩形不构成重叠
 * 给出两个矩形，判断它们是否重叠并返回结果
 * @author 慕勋
 * @created 2020-03-18
 */
public class RectangleOverLap {

    /**
     * 思路：
     * @param rec1 矩形坐标一
     * @param rec2 矩形坐标二
     * @return 两个矩形是否相交
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1.length <= 0 || rec2.length <= 0) {
            return false;
        }
        // 重叠情况
        if (rec1[0] == rec2[0] && rec1[1] == rec2[1] && rec1[2] == rec2[2] && rec1[3] == rec2[3]) {
            return true;
        }
        int x1 = rec1[0], x2 = rec1[1], x3 = rec1[2], x4 = rec1[3];
        int y1 = rec2[0], y2 = rec2[1], y3 = rec2[2], y4 = rec2[3];
        return x1 < y3 && y1 < x3 && x4 > y2 && y4 > x2;
    }
}
