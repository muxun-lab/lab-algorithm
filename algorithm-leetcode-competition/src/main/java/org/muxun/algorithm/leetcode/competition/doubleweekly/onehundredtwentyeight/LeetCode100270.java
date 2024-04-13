package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyeight;

/**
 * 题号: 100270
 * <p>
 * 题目: <a href="https://leetcode.cn/contest/biweekly-contest-128/problems/score-of-a-string/">字符串的分数</a>
 * <p>
 * 详情:
 * 给你一个字符串 s 。一个字符串的 分数 定义为相邻字符 ASCII 码差值绝对值的和。
 * <p>
 * 请你返回 s 的 分数 。
 * @author 慕勋
 * @created 2024-04-13
 */
public class LeetCode100270 {

    /**
     * 思路: 一次遍历
     * @param s 字符串
     * @return 字符串分数
     */
    public int scoreOfString(String s) {
        int n = s.length();
        if (n == 1) {
            return s.charAt(0);
        }
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 1;
        int sum = 0;
        while (right < n) {
            sum += Math.abs(arr[left] - arr[right]);
            left++;
            right++;
        }
        return sum;
    }
}
