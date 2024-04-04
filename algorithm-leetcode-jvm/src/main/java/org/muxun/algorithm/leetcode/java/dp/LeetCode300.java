package org.muxun.algorithm.leetcode.java.dp;

import java.util.Arrays;

/**
 * 题号：300
 * <p>
 * 题目：最长上升子序列
 * <p>
 * 详情：给定一个无序的整数数组，找到其中最长上升子序列的长度
 * <p>
 * 说明:
 * <p>
 * * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可
 * * 你算法的时间复杂度应该为 O(n2)
 * 进阶:
 * <p>
 * * 你能将算法的时间复杂度降低到 O(n log n) 吗?
 * @author 慕勋
 * @created 2020-03-14
 */
public class LeetCode300 {

    /**
     * 思路：动态规划
     * 状态定义：dp[i]是给定数组前i个数字的最长子序列
     * 转移方程：考虑每个dp[i]时，都有0 <= j < i，做以下判断：
     * 1. 当nums[i] > nums[j]时，nums[i]可以在nums[j]之后，此情况下的最长上升子序列为dp[j] + 1
     * 2. 当nums[i] < nums[j]时，nums[i]无法在nums[j]之后，此情况上升子序列不成立，跳过
     * * 上述1情况下，计算出的dp[j] + 1的最大值，为直到i的最长上升子序列长度，即dp[i]，实现方式是为遍历j时，每轮执行dp[i]=max(dp[i], dp[j]+1)
     * * 转移方程：dp[i] = max(dp[i], dp[j] + 1) for j in [0, i)
     * 初始状态：dp[i]的所有元素置为1，含义是每个元素都可以成为上升子序列，此时长度为1
     * 返回值：返回dp列表的最大值，既可以得到给定数组的最长上升子序列长度
     * 举个例子：10, 9, 2, 5, 3, 7, 101, 18
     * <p>
     * 当i = 5, nums[i] = 7时，0 <= j < 5
     * 前面则有2, 5, 3比7小，j=2,3,4
     * 分别获取dp[2]，dp[3]，dp[4]的最大上升子序列长度，取最大值
     * @param nums 给定无序数组
     * @return 最长上升子序列的长度
     */
    public int lengthOfLIS(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            int currentMax = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] <= nums[j]) {
                    continue;
                }
                currentMax = Math.max(currentMax, dp[j] + 1);
            }
            dp[i] = currentMax;
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    /**
     * 思路：贪心+二分查找
     * 状态定义：* 维护一个列表tails，其中每个元素tails[k]的值代表k+1的子序列尾部元素的值
     * * 如[1, 4, 6]序列，长度为1, 2, 3的子序列尾部元素值分别为tails=[1, 4, 6]
     * 状态转移：* 设常量数字N，和随机数字x，可以推出：当N越小时，N < x的几率越大。例如：N=0肯定比N=1000更可能满足N < x。
     * * 在遍历计算每个tails[k]时，不断更新长度为[1, k]的子序列尾部元素值，始终保持每个尾部元素值最小（例如[1, 5, 3]）
     * 遍历到元素5时，长度为2的子序列尾部元素值为5；当遍历到元素3时，尾部元素值应更新至3，因为3遇到比它打的数字几率更大
     * tails列表一定是严格递增的，当尽可能使每个子序列尾部元素值最小的前提下，子序列越长，其序列尾部元素值一定更大
     * <p>
     * 状态定义：tails[k]的值长度为k+1子序列的尾部元素值
     * 转移方程：max为tails当前长度，0 <= j < max，每轮遍历nums[k]时，通过二分法遍历[0, max)区间，找到nums[k]的大小分界点，出现两种情况：
     * * 区间中存在tails[i]>nums[k]，第一个满足tails[i] > nums[k]执行tails[i]=tails[k]，因为更小的nums[k]后更可能接一个比它大的数字
     * * 区间中不存在tails[i]>nums[k]，意味着nums[k]可以接在当前最长子序列的后面，因此肯定是接到最长的后面，新序列为max+1
     * 初始状态：tails列表所有值为0
     * 返回值，返回max，即最大上升子序列长度
     * @param nums 给定无序数组
     * @return 最长上升子序列的长度
     */
    public int lengthOfLISByGreedy(int[] nums) {
        int[] tails = new int[nums.length];
        int max = 0;
        for (int num : nums) {
            int i = 0;
            int j = max;
            while (i < j) {
                int m = (i + j) / 2;
                if (tails[m] > num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = num;
            if (max == j) {
                max++;
            }
        }
        return max;
    }
}
