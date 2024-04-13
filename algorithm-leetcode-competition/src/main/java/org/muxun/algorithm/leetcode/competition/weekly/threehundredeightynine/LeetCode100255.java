package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightynine;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 题号: 100255
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-389/problems/minimum-deletions-to-make-string-k-special/">成为 K 特殊字符串需要删除的最少字符数</a>
 * <p>
 * 详情: 给你一个字符串 word 和一个整数 k。
 * <p>
 * 如果 |freq(word[i]) - freq(word[j])| <= k 对于字符串中所有下标 i 和 j  都成立，则认为 word 是 k 特殊字符串。
 * <p>
 * 此处，freq(x) 表示字符 x 在 word 中的出现频率，而 |y| 表示 y 的绝对值。
 * <p>
 * 返回使 word 成为 k 特殊字符串 需要删除的字符的最小数量。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode100255 {

    /**
     * 思路:
     * @param word 单词
     * @param k    特殊字符阈值
     * @return 删除字母的最小数量
     */
    public int minimumDeletions(String word, int k) {
        int[] arr = new int[26];
        char[] wordArr = word.toCharArray();
        for (char c : wordArr) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            set.add(arr[i]);
        }
        int ans = word.length();
        for (int remain : set) {
            int delete = getDelete(arr, remain, k);
            ans = Math.min(ans, delete);
        }
        return ans;
    }

    private int getDelete(int[] arr, int remain, int k) {
        int ans = 0;
        for (int count : arr) {
            if (count < remain) {
                ans += count;
            } else {
                ans += Math.max(count - remain - k, 0);
            }
        }
        return ans;
    }
}
