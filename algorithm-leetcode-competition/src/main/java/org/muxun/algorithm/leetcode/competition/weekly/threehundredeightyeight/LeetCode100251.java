package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyeight;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 100251
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/shortest-uncommon-substring-in-an-array">数组中的最短非公共子字符串</a>
 * <p>
 * 详情: 给你一个数组 arr ，数组中有 n 个 非空 字符串。
 * 请你求出一个长度为 n 的字符串 answer ，满足：
 * * answer[i] 是 arr[i] 最短 的子字符串，且它不是 arr 中其他任何字符串的子字符串。如果有多个这样的子字符串存在，answer[i] 应该是它们中字典序最小的一个。如果不存在这样的子字符串，answer[i] 为空字符串。
 * 请你返回数组 answer 。
 * @author 慕勋
 * @created 2024-03-10
 */
public class LeetCode100251 {

    /**
     * 思路: 常规思路
     * 先计算每个字符串的字典序，然后判断是不是在其他字符串中
     * 如果不存在，则检查是不是最短的，字典序最小的
     * @param arr 字符串数组
     * @return 非公共子字符串数组
     */
    public String[] shortestSubstrings(String[] arr) {
        int n = arr.length;
        String[] resArr = new String[n];
        for (int i = 0; i < n; i++) {
            String ans = "";
            String cur = arr[i];
            List<String> subStringList = getSubStringList(cur);
            subStringList.sort((o1, o2) -> o2.length() - o1.length());
            for (String str : subStringList) {
                if (exist(arr, str, i)) {
                    if (ans.isEmpty()) {
                        ans = str;
                    } else {
                        if (str.length() < ans.length()) {
                            ans = str;
                        } else if (ans.compareTo(str) > 0) {
                            ans = str;
                        }
                    }
                }
            }
            resArr[i] = ans;
        }
        return resArr;
    }

    private boolean exist(String[] arr, String str, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            if (arr[i].contains(str)) {
                return false;
            }
        }
        return true;
    }

    private List<String> getSubStringList(String str) {
        List<String> subStringList = new ArrayList<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                subStringList.add(str.substring(i, j));
            }
        }
        return subStringList;
    }
}
