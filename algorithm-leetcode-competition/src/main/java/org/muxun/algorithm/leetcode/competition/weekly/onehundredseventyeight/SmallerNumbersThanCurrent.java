package org.muxun.algorithm.leetcode.competition.weekly.onehundredseventyeight;

import java.util.Arrays;

/**
 * 题号：5344
 * 题目：有多少小于当前数字的数字
 * 详情：给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 以数组形式返回答案。
 * @author sunshine
 * @created 2020-03-01
 */
public class SmallerNumbersThanCurrent {

    /**
     * 思路：优化暴力
     * @param nums 给定的数组
     * @return 小于索引数字的个数数组
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums.length <= 1) {
            return new int[]{};
        }
        int[] tempArray = new int[nums.length];
        System.arraycopy(nums, 0, tempArray, 0, nums.length);
        int[] resultArray = new int[nums.length];
        Arrays.sort(tempArray);
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            while (tempArray[start] < nums[i]) {
                start++;
            }
            resultArray[i] = start;
        }
        return resultArray;
    }
}
