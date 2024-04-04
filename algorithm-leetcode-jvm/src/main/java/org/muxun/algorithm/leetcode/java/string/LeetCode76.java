package org.muxun.algorithm.leetcode.java.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 题号: 76
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-window-substring">最小覆盖子串</a>
 * <p>
 * 详情: 给你一个字符串 s 、一个字符串 t 。
 * <p>
 * 返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * <p>
 * 注意：
 * <p>
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * @author 慕勋
 * @created 2024/2/16
 */
public class LeetCode76 {

    /**
     * 思路: 双指针
     * 找到以子串中字符作为左指针，然后不断向右扩展
     * 然后不断移动左指针，直到找到对应的最小子串
     * @param s 字符串s
     * @param t 字符串t
     * @return 覆盖的最小子串
     */
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            tMap.put(key, tMap.getOrDefault(key, 0) + 1);
        }
        int left = 0;
        int right = -1;
        int n = s.length();
        int min = Integer.MAX_VALUE;
        int ansL = -1;
        int ansR = -1;
        while (right < n) {
            right++;
            // 如果碰到存在的字符，就添加计数
            if (right < n && tMap.containsKey(s.charAt(right))) {
                sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right), 0) + 1);
            }
            // 如果发现已经包含子串了，则证明是
            while (check(tMap, sMap) && left <= right) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    ansL = left;
                    // 下面使用的是substring，所以需要+1
                    ansR = right + 1;
                }
                // 向右移动的时候，判断最左指针是不是属于tMap中的，要减去对应的数值
                if (tMap.containsKey(s.charAt(left))) {
                    sMap.put(s.charAt(left), sMap.getOrDefault(s.charAt(left), 0) - 1);
                }
                left++;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    private boolean check(HashMap<Character, Integer> tMap, HashMap<Character, Integer> sMap) {
        Iterator iterator = tMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (sMap.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }
}
