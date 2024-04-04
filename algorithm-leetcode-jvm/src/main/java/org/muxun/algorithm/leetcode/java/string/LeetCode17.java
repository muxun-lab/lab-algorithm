package org.muxun.algorithm.leetcode.java.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题号：17
 * <p>
 * 题目：电话号码的字母组合
 * <p>
 * 详情：给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。
 * <p>
 * 注意 1 不对应任何字母。
 * <p>
 * 说明：尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * @author 慕勋
 * @created 2020-03-06
 */
public class LeetCode17 {

    private Map<Character, String> integerStringMap;

    private List<String> resultList;

    /**
     * 思路：回溯算法
     * @param digits 给定的数字字符串
     * @return 九宫格的字母组合情况
     */
    public List<String> letterCombinations(String digits) {
        resultList = new ArrayList<>();
        if (digits.isEmpty()) {
            return resultList;
        }
        integerStringMap = new HashMap<>();
        integerStringMap.put('2', "abc");
        integerStringMap.put('3', "def");
        integerStringMap.put('4', "ghi");
        integerStringMap.put('5', "jkl");
        integerStringMap.put('6', "mno");
        integerStringMap.put('7', "pqrs");
        integerStringMap.put('8', "tuv");
        integerStringMap.put('9', "wxyz");
        backtrack(digits, 0, new StringBuilder());
        return resultList;
    }

    private void backtrack(String digits, int index, StringBuilder backtrack) {
        if (backtrack.length() == digits.length()) {
            resultList.add(backtrack.toString());
            return;
        }
        if (index >= digits.length()) {
            return;
        }
        char c = digits.charAt(index);
        String letters = integerStringMap.get(c);
        int n = letters.length();
        for (int i = 0; i < n; i++) {
            backtrack.append(letters.charAt(i));
            backtrack(digits, index + 1, backtrack);
            backtrack.deleteCharAt(index);
        }
    }
}
