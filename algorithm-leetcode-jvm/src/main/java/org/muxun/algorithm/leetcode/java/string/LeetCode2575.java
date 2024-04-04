package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号: 2575
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-the-divisibility-array-of-a-string">找出字符串的可整除数组</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的字符串 word ，长度为 n ，由从 0 到 9 的数字组成。另给你一个正整数 m
 * word 的 可整除数组 div  是一个长度为 n 的整数数组，并满足：
 * 如果 word[0,...,i] 所表示的 数值 能被 m 整除，div[i] = 1
 * 否则，div[i] = 0
 * 返回 word 的可整除数组。
 * @author 慕勋
 * @created 2024/3/7
 */
public class LeetCode2575 {

    /**
     * 思路: 模运算
     * @param word 字符串
     * @param m    整除数
     * @return 可整除的数组
     */
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] res = new int[n];
        long num = 0;
        for (int i = 0; i < n; i++) {
            // 需要提前取余，防止数字过大
            num = (num * 10 + (word.charAt(i) - '0')) % m;
            if (num == 0) {
                res[i] = 1;
            }
        }
        return res;
    }
}
