package org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：1447
 * 题目：最简分数
 * 题链：https://leetcode-cn.com/problems/simplified-fractions/
 * 详情：给你一个整数 n ，请你返回所有 0 到 1 之间（不包括 0 和 1）满足分母小于等于  n 的 最简 分数
 * 分数可以以 任意 顺序返回
 * @author sunshine
 * @created 2020-05-16
 */
public class SimplifiedFractions {

    /**
     * 思路：迭代+最大公约数
     * @param n
     * @return
     */
    public List<String> simplifiedFractions(int n) {
        List<String> resultList = new ArrayList<>();
        if (n <= 1) {
            return resultList;
        }
        String format = "%s/%s";
        for (int i = 2; i <= n; i++) {
            // 奇数，不用考虑最简的问题
            if (i % 2 == 1) {
                for (int j = 1; j < i; j++) {
                    if (gcd(i, j) > 1) {
                        continue;
                    }
                    resultList.add(String.format(format, j, i));
                }
            } else {
                for (int j = 1; j < i; j = j + 2) {
                    if (gcd(i, j) > 1) {
                        continue;
                    }
                    resultList.add(String.format(format, j, i));
                }
            }
        }
        return resultList;
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
