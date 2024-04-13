package org.muxun.algorithm.leetcode.competition.weekly.threehundredninetyone;

/**
 * 题号: 100263
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-391/problems/harshad-number">哈沙德数</a>
 * <p>
 * 详情: 如果一个整数能够被其各个数位上的数字之和整除，则称之为 哈沙德数（Harshad number）。
 * <p>
 * 给你一个整数 x 。如果 x 是 哈沙德数 ，则返回 x 各个数位上的数字之和，否则，返回 -1 。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode100263 {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x == 0) {
            return -1;
        }
        char[] arr = String.valueOf(x).toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += c - '0';
        }
        return x % sum == 0 ? sum : -1;
    }
}
