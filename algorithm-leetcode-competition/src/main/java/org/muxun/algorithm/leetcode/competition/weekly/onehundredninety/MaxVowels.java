package org.muxun.algorithm.leetcode.competition.weekly.onehundredninety;

import java.util.HashSet;
import java.util.Set;

/**
 * 题号：5417
 * 题目：定长子串中元音的最大数目
 * 题链：https://leetcode-cn.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/submissions/
 * 详情：给你字符串 s 和整数 k
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数
 * 英文中的 元音字母 为（a, e, i, o, u）
 * @author sunshine
 * @created 2020-05-24
 */
public class MaxVowels {

    /**
     * 思路：双指针暴力
     * @param s 字符串
     * @param k 截断区间
     * @return 截断区间内出现的最大元音字母个数
     */
    public int maxVowels(String s, int k) {
        if (s.length() <= 0 || k <= 0) {
            return 0;
        }
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        int index = 0;
        int max = 0;
        while (index <= s.length() - k) {
            String current = s.substring(index, index + k);
            int count = 0;
            for (int i = 0; i < current.length(); i++) {
                if (vowelSet.contains(current.charAt(i))) {
                    count++;
                }
            }
            max = Math.max(max, count);
            index++;
        }
        return max;
    }

    /**
     * 思路：双指针优化
     * @param s 字符串
     * @param k 截断区间
     * @return 截断区间内出现的最大元音字母个数
     */
    public int maxVowelsOptimize(String s, int k) {
        if (s.length() <= 0 || k <= 0) {
            return 0;
        }
        String vowel = "aeiou";
        int count = 0;
        int index = 0;
        int max = 0;
        // index为滑动窗口的左指针，i为滑动窗口的右指针
        // 超过区间之后，需要将index向左移动
        // 如果index所在位置为元音，则元音字母个数需要减少
        // count维护了当前窗口内元音字母个数
        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(String.valueOf(s.charAt(i))) != -1) {
                count++;
            }
            if (i > k - 1) {
                if (vowel.indexOf(String.valueOf(s.charAt(index))) != -1) {
                    count--;
                }
                index++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
