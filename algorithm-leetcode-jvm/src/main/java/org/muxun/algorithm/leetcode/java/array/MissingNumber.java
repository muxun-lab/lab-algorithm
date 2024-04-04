package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：268
 * 题目：缺失数字
 * 详情：给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * @author 慕勋
 * @created 2020-01-29
 */
public class MissingNumber {

    /**
     * 简单思路：求和，差值即是缺的数字
     * @param nums 给定的序列乱序数组
     * @return 不在序列中的元素
     */
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    /**
     * 简单思路：求和，差值即是缺的数字
     * 升级：高斯求和公式
     * @param nums 给定的序列乱序数组
     * @return 不在序列中的元素
     */
    public int missingNumberUpgrade(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    /**
     * 思路：位运算
     * 先得到[0...n]的异或值，再将结果对数组中的每一个数进行一次异或运算
     * 未缺失的数字异或了一次，结果为0，缺失的数字没有配对的异或，所以异或的结果就是这个确实的数字
     * @param nums 给定的序列乱序数组
     * @return 不在序列中的元素
     */
    public int missingNumberUpgradeTwo(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            n ^= i ^ nums[i];
        }
        return n;
    }
}
