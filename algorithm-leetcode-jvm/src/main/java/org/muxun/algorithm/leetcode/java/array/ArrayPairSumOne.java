package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;

/**
 * 题号：561
 * 题目：数组拆分 I
 * 详情：给定长度为 2n 的数组, 你的任务是将这些数分成 n 对。
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * <p>
 * 提示：
 * * n 是正整数,范围在 [1, 10000]
 * * 数组中的元素范围在 [-10000, 10000]
 * @author 慕勋
 * @created 2020-02-29
 */
public class ArrayPairSumOne {

    /**
     * 思路：让两个相近的数做一对
     * @param nums 给定的长度为2n的数组
     * @return min(ai, bi) 总和的最大值
     */
    public int arrayPairSum(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
