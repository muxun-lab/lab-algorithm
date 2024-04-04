package org.muxun.algorithm.leetcode.java.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 题号: 244
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/shortest-word-distance-ii">最短单词距离 II</a>
 * <p>
 * 详情: 请设计一个类，使该类的构造函数能够接收一个字符串数组。然后再实现一个方法，该方法能够分别接收两个单词，并返回列表中这两个单词之间的最短距离。
 * <p>
 * 实现 WordDistanc 类:
 * <p>
 * <li> ordDistance(String[] wordsDict) 用字符串数组 wordsDict 初始化对象。
 * <li> int shortest(String word1, String word2) 返回数组 worddict 中 word1 和 word2 之间的最短距离。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode244 {

    private final HashMap<String, List<Integer>> dictMap;

    public LeetCode244(String[] wordsDict) {
        dictMap = new HashMap<>();
        for (int i = 0; i < wordsDict.length; i++) {
            String word = wordsDict[i];
            dictMap.computeIfAbsent(word, key -> new ArrayList<>());
            dictMap.get(word).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> index1 = dictMap.get(word1);
        List<Integer> index2 = dictMap.get(word2);
        int min = Integer.MAX_VALUE;
        for (int x : index1) {
            for (int y : index2) {
                min = Math.min(min, Math.abs(x - y));
            }
        }
        return min;
    }
}
