package org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone;

import java.util.Arrays;

/**
 * 题号：5425
 * 题目：切割后面积最大的蛋糕
 * 题链：https://leetcode-cn.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
 * 详情：矩形蛋糕的高度为 h 且宽度为 w
 * 给你两个整数数组 horizontalCuts 和 verticalCuts
 * 其中 horizontalCuts[i] 是从矩形蛋糕顶部到第  i 个水平切口的距离
 * 类似地，verticalCuts[j] 是从矩形蛋糕的左侧到第 j 个竖直切口的距离
 * 请你按数组 horizontalCuts 和 verticalCuts 中提供的水平和竖直位置切割后
 * 请你找出 面积最大 的那份蛋糕，并返回其 面积 。由于答案可能是一个很大的数字，因此需要将结果对 10^9 + 7 取余后返回
 * @author sunshine
 * @created 2020-05-31
 */
public class MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

    /**
     * 思路：分别计算每个方向切歌的最大长度，计算乘积
     * @param h              高度
     * @param w              宽度
     * @param horizontalCuts 水平切分距离
     * @param verticalCuts   垂直切分距离
     * @return 切分出的最大面积
     */
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        // 先求竖直维度上的最大区间
        long maxHorizontal = horizontalCuts[0];
        for (int i = 1; i <= horizontalCuts.length - 1; i++) {
            maxHorizontal = Math.max(maxHorizontal, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        maxHorizontal = Math.max(maxHorizontal, h - horizontalCuts[horizontalCuts.length - 1]);

        // 计算水平维度上的最大区间
        long maxVertical = verticalCuts[0];
        for (int i = 1; i <= verticalCuts.length - 1; i++) {
            maxVertical = Math.max(maxVertical, verticalCuts[i] - verticalCuts[i - 1]);
        }
        maxVertical = Math.max(maxVertical, w - verticalCuts[verticalCuts.length - 1]);
        return (int) ((maxHorizontal * maxVertical) % 1000000007);
    }
}
