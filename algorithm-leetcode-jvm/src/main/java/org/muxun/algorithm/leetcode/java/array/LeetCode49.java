package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题号: 49
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/group-anagrams">字母异位词分组</a>
 * <p>
 * 详情: 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * <p>
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * @author 慕勋
 * @created 2024/2/19
 */
public class LeetCode49 {

    /**
     * 思路:
     * @param strs 字符串数组
     * @return 异位词分组
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            // 每个字母+出现的次数作为key
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append(i).append("-").append(count[i]).append("-");
            }
            List<String> list = map.getOrDefault(key.toString(), new ArrayList<>());
            list.add(str);
            map.put(key.toString(), list);
        }
        return new ArrayList<>(map.values());
    }
}
