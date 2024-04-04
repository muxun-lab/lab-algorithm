package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：11
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/container-with-most-water">盛水最多的容器</a>
 * <p>
 * 详情：给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 * <p>
 * 说明：你不能倾斜容器。
 * @author 慕勋
 * @created 2020-01-30
 */
public class LeetCode11 {

    /**
     * 思路：暴力破解
     * @param height 给定的数组高度数组
     * @return 面积最大的矩形
     */
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                max = Math.max((j - i) * Math.min(height[i], height[j]), max);
            }
        }
        return max;
    }

    /**
     * 思路：双指针两端向中间遍历
     * 从大到小逐渐缩小范围，第一个矩形设为最大的面积
     * 下一个更大的矩形面积需要是高比现在更高的，也就是数组值更大的
     * @param height 给定的数组高度数组
     * @return 面积最大的矩形
     */
    public int maxAreaByDoublePointer(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }
}
