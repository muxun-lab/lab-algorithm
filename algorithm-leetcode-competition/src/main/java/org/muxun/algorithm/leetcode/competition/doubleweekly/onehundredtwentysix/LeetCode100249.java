package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentysix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 100249
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/biweekly-contest-126/problems/replace-question-marks-in-string-to-minimize-its-value">替换字符串中的问号使分数最小</a>
 * <p>
 * 详情: 给你一个字符串 s 。s[i] 要么是小写英文字母，要么是问号 '?' 。
 * <p>
 * 对于长度为 m 且 只 含有小写英文字母的字符串 t ，我们定义函数 cost(i) 为下标 i 之前（也就是范围 [0, i - 1] 中）出现过与 t[i] 相同 字符出现的次数。
 * <p>
 * 字符串 t 的 分数 为所有下标 i 的 cost(i) 之 和 。
 * <p>
 * 比方说，字符串 t = "aab" ：
 * <li>cost(0) = 0
 * <li>cost(1) = 1
 * <li>cost(2) = 0
 * 所以，字符串 "aab" 的分数为 0 + 1 + 0 = 1 。
 * 你的任务是用小写英文字母 替换 s 中 所有 问号，使 s 的 分数最小 。
 * <p>
 * 请你返回替换所有问号 '?' 之后且分数最小的字符串。如果有多个字符串的 分数最小 ，那么返回字典序最小的一个。
 * @author 慕勋
 * @created 2024-03-16
 */
public class LeetCode100249 {

    /**
     * 思路:
     * 1. 记录所有出现过的次数
     * 2. 记录出现的?数量
     * 3. 按照字典序查找最小的计算
     * @param s 字符串
     * @return 分数最小，字典序最小的字符串
     */
    public String minimizeStringValue(String s) {
        int[] arr = new int[26];
        char[] sArr = s.toCharArray();
        int count = 0;
        for (char c : sArr) {
            if (c == '?') {
                count++;
            } else {
                int x = c - 'a';
                arr[x]++;
            }
        }
        List<Character> appendList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int x = findLeast(arr);
            arr[x]++;
            appendList.add((char) (x + 97));
        }
        Collections.sort(appendList);
        int index = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == '?') {
                sArr[i] = appendList.get(index++);
            }
        }
        return new String(sArr);
    }

    private int findLeast(int[] arr) {
        // 先选未出现过的
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
}
