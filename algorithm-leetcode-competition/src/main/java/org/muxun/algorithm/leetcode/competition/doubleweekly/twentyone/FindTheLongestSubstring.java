package org.muxun.algorithm.leetcode.competition.doubleweekly.twentyone;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号：5337
 * 题目：每个元音包含偶数次的最长子字符串
 * 详情：给你一个字符串 s ，请你返回满足以下条件的最长子字符串的长度
 * 每个元音字母，即 'a'，'e'，'i'，'o'，'u' ，在子字符串中都恰好出现了偶数次。
 * <p>
 * 提示：
 * * 1 <= s.length <= 5 x 10^5
 * * s 只包含小写英文字母。
 * @author sunshine
 * @created 2020-03-07
 */
public class FindTheLongestSubstring {

    public int findTheLongestSubstring(String s) {
        Map<Character, Integer> capMap = new HashMap<>();
        capMap.put('a', 0);
        capMap.put('e', 0);
        capMap.put('i', 0);
        capMap.put('o', 0);
        capMap.put('u', 0);
        int max = 0;
        int start = 0, end = 0;
        while (start < s.length()) {
            int count = 0;
            while (end < s.length()) {
                char current = s.charAt(end);
                if (capMap.containsKey(current)) {
                    break;
                }
                max = Math.max(max, end - start);
                end++;
            }
            char current = s.charAt(end);
            capMap.put(current, capMap.get(current) + 1);

        }
        return max;
    }
}
