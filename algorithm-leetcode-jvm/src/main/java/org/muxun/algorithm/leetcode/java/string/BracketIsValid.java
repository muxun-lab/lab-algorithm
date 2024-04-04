package org.muxun.algorithm.leetcode.java.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * 题号：20
 * 题目：有效的括号
 * 详情：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * * 左括号必须用相同类型的右括号闭合。
 * * 左括号必须以正确的顺序闭合。
 * @author 慕勋
 * @created 2020-02-19
 */
public class BracketIsValid {

    /**
     * 思路：栈
     * @param s 给定的括号字符串
     * @return 括号字符串是否满足条件
     */
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }
        Map<Character, Integer> leftBracketMap = new HashMap<>();
        leftBracketMap.put('(', 1);
        leftBracketMap.put('{', 2);
        leftBracketMap.put('[', 3);
        Map<Character, Integer> rightBracketMap = new HashMap<>();
        rightBracketMap.put(')', 1);
        rightBracketMap.put('}', 2);
        rightBracketMap.put(']', 3);
        LinkedList<Integer> leftBracketStack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (leftBracketMap.containsKey(current)) {
                leftBracketStack.push(leftBracketMap.get(current));
            } else {
                int currentValue = rightBracketMap.get(current);
                if (leftBracketStack.size() == 0) {
                    return false;
                }
                int previousLeftBracketValue = leftBracketStack.pop();
                if (currentValue != previousLeftBracketValue) {
                    return false;
                }
            }
        }
        return leftBracketStack.size() == 0;
    }

    /**
     * 思路：栈思路的优化升级
     * @param s 给定的括号字符串
     * @return 括号字符串是否满足条件
     */
    public boolean isValidUpgrade(String s) {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (bracketMap.containsKey(current)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (bracketMap.get(current) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
}
