package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：485
 * 题目：最大连续1的个数
 * 题链：https://leetcode-cn.com/problems/max-consecutive-ones/
 * 详情：给定一个二进制数组，计算其中最大连续1的个数。
 * @author 慕勋
 * @created 2020-02-10
 */
public class FindMaxConsecutiveOnes {

    /**
     * 思路：遍历取值
     * @param nums 给定的二进制数组
     * @return 最大连续1的个数
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                continue;
            }
            if (num == 0) {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
