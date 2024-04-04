package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：42
 * <p>
 * 题目：<a href="https://leetcode-cn.com/problems/trapping-rain-water/">接雨水</a>
 * <p>
 * 详情：给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
 * @author 慕勋
 * @date 2020/6/1
 */
public class LeetCode42 {

    /**
     * 思路：暴力，每个位置分别获取左边界和右边界
     * 边界确定，左边界在(0, leftMax)中，右边界在(rightMax, end)中
     * 每次重复计算边界
     * @param height 柱子高度
     * @return 可以接的雨水
     */
    public int trap(int[] height) {
        int result = 0;
        if (height.length <= 1) {
            return result;
        }
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            // 找右面高的柱子
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            // 找到左面高的柱子
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            result += Math.min(leftMax, rightMax) - height[i];
        }
        return result;
    }

    /**
     * 思路: 动态规划
     * @param height 高度
     * @return 可以接的雨水
     */
    public int trapByDP(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];
        // 当前柱子的高度和之前出现的最大高度进行对比
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // 当前柱子的高度和之前出现的最大高度进行对比
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(leftMax[i], rightMax[i]);
            ans += min - height[i];
        }
        return ans;
    }

    /**
     * 思路：双指针
     * 能否盛水，只和最矮的高柱子有关
     * 所以即使右面的高柱子并不是最高的，也不妨碍计算当前区间的储水量
     * @param height 柱子高度
     * @return 可以接的雨水
     */
    public int trapByDoublePointer(int[] height) {
        int result = 0;
        if (height.length <= 1) {
            return result;
        }
        int left = 0, right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            // 能否盛水，只和最矮的高柱子有关
            if (leftMax < rightMax) {
                result += leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }
}
