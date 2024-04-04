package org.muxun.algorithm.leetcode.java.string;

import java.util.*;

/**
 * 题号：49
 * 题目：字母异位词分组
 * 详情：给定一个字符串数组，将字母异位词组合在一起。
 * 字母异位词指字母相同，但排列不同的字符串。
 * @author 慕勋
 * @created 2020-02-23
 */
public class GroupAnagrams {

    /**
     * 思路：HashMap
     * @param strs 给定的字符串数组
     * @return 字母异位词解
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tempMap = new LinkedHashMap<>();
        for (String str : strs) {
            char[] currentArray = str.toCharArray();
            Arrays.sort(currentArray);
            String key = String.valueOf(currentArray);
            if (!tempMap.containsKey(key)) {
                tempMap.put(key, new ArrayList<>());
            }
            tempMap.get(key).add(str);
        }
        return new ArrayList<>(tempMap.values());
    }

    /**
     * 思路：按计数分类
     * @param strs 给定的字符串数组
     * @return 字母异位词解
     */
    public List<List<String>> groupAnagramsUpgrade(String[] strs) {
        Map<String, List<String>> tempMap = new HashMap<>();
        int[] count = new int[26];
        for (String str : strs) {
            // 每个字母单独计数
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            // 加上间隔符，组成一个字符串key
            StringBuilder keyBuilder = new StringBuilder();
            for (int value : count) {
                keyBuilder.append("#").append(value);
            }
            String key = keyBuilder.toString();
            if (!tempMap.containsKey(key)) {
                tempMap.put(key, new ArrayList<>());
            }
            tempMap.get(key).add(str);
            Arrays.fill(count, 0);
        }
        return new ArrayList<>(tempMap.values());
    }
}
