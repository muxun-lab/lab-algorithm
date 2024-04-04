package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号：2413
 * 题目：最小倍偶数
 * 详情：给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）
 * @author valverde
 * @created 2023-04-21
 */
public class LeetCode2413 {

    /**
     * 思路：先计算最大公约数，然后根据公式：最大公约数*最小公倍数=a*b来计算最小公倍数
     * @param n 给定值
     * @return 最小公倍数
     */
    public int smallestEvenMultiple(int n) {
        if (n <= 2) {
            return 2;
        }
        return 2 * n / gcd(n, 2);
    }

    public int gcd(int x, int y) {
        int result = 0;
        while (y != 0) {
            result = x % y;
            x = y;
            y = result;
        }
        return x;
    }
}

