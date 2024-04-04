package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 题号: 243
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/shortest-word-distance">最短单词距离</a>
 * <p>
 * 详情: 给定一个字符串数组 wordDict 和两个已经存在于该数组中的不同的字符串 word1 和 word2 。
 * <p>
 * 返回列表中这两个单词之间的最短距离。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode243 {

    /**
     * 思路: 哈希表
     * @param wordsDict 单词数组
     * @param word1     单词1
     * @param word2     单词2
     * @return 最短单词距离
     */
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        HashMap<String, List<Integer>> dictMap = new HashMap<>();
        for (int i = 0; i < wordsDict.length; i++) {
            String word = wordsDict[i];
            dictMap.computeIfAbsent(word, key -> new ArrayList<>());
            dictMap.get(word).add(i);
        }
        List<Integer> index1 = dictMap.get(word1);
        List<Integer> index2 = dictMap.get(word2);
        int min = wordsDict.length;
        for (int x : index1) {
            for (int y : index2) {
                min = Math.min(min, Math.abs(y - x));
            }
        }
        return min;
    }
}
