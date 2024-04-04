package org.muxun.algorithm.leetcode.java.array;

import java.util.HashMap;

/**
 * 题号：1160
 * 题目：拼写单词
 * 题链：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 * 详情：给你一份『词汇表』（字符串数组）words和一张『字母表』（字符串）chars
 * 假如你可以用chars中的『字母』（字符）拼写出words中的某个『单词』（字符串），那么我们就认为你掌握了这个单词
 * 注意：每次拼写时，chars中的每个字母都只能用一次
 * 返回词汇表words中你掌握的所有单词的长度之和
 * @author 慕勋
 * @created 2020-03-17
 */
public class CountCharacters {

    /**
     * 思路：
     * @param words 单词表
     * @param chars 字母表
     * @return 掌握的所有单词长度之和
     */
    public int countCharacters(String[] words, String chars) {
        if (chars.length() <= 0) {
            return 0;
        }
        HashMap<Character, Integer> charHashMap = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            // 记录字母的数量
            charHashMap.put(chars.charAt(i), charHashMap.getOrDefault(chars.charAt(i), 0) + 1);
        }
        int max = 0;
        for (String word : words) {
            HashMap<Character, Integer> currentCharHashMap = new HashMap<>(charHashMap);
            boolean matched = true;
            for (int i = 0; i < word.length(); i++) {
                if (!currentCharHashMap.containsKey(word.charAt(i))) {
                    matched = false;
                    break;
                } else {
                    if (currentCharHashMap.get(word.charAt(i)) == 0) {
                        matched = false;
                        break;
                    } else {
                        currentCharHashMap.put(word.charAt(i), currentCharHashMap.get(word.charAt(i)) - 1);
                    }
                }
            }
            if (matched) {
                max += word.length();
            }
        }
        return max;
    }
}
