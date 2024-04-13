package org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix;

/**
 * 题号：1446
 * 题目：连续字符
 * 题链：https://leetcode-cn.com/problems/consecutive-characters/
 * 详情：给你一个字符串 s
 * 字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度
 * 请你返回字符串的能量
 * @author sunshine
 * @created 2020-05-16
 */
public class ConsecutiveCharacters {

    /**
     * 思路：迭代
     * @param s 计算能量的字符串
     * @return 字符的能量
     */
    public int maxPower(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 0;
        char start = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (start == current) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
                start = current;
            }
        }
        return Math.max(max, count);
    }
}
