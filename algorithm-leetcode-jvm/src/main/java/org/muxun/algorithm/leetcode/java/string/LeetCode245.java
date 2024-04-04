package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号: 245
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/shortest-word-distance-iii">最短单词距离III</a>
 * <p>
 * 详情: 给定一个字符串数组 wordsDict 和两个字符串 word1 和 word2 ，返回这两个单词在列表中出现的最短距离。
 * <p>
 * 注意：word1 和 word2 是有可能相同的，并且它们将分别表示为列表中 两个独立的单词 。
 * @author 慕勋
 * @created 2024-03-12
 */
public class LeetCode245 {

    /**
     * 思路: 双指针
     * @param wordsDict 字符串数组
     * @param word1     单词1
     * @param word2     单词2
     * @return 最短距离
     */
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int n = wordsDict.length;
        int ans = n;
        if (word1.equals(word2)) {
            int index = -1;
            for (int i = 0; i < n; i++) {
                String word = wordsDict[i];
                if (word.equals(word1)) {
                    if (index >= 0) {
                        ans = Math.min(ans, i - index);
                    }
                    index = i;
                }
            }
        } else {
            int first = -1;
            int second = -1;
            for (int i = 0; i < n; i++) {
                String word = wordsDict[i];
                if (word.equals(word1)) {
                    first = i;
                } else if (word.equals(word2)) {
                    second = i;
                }
                if (first >= 0 && second >= 0) {
                    ans = Math.min(ans, Math.abs(first - second));
                }
            }
        }
        return ans;
    }
}
