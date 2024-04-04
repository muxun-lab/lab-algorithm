package org.muxun.algorithm.leetcode.java.string;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 题号：394
 * 题目：字符串解码
 * 题链：https://leetcode-cn.com/problems/decode-string/
 * 详情：给定一个经过编码的字符串，返回它解码后的字符串
 * 编码规则为: k[encoded_string] ，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * @author 慕勋
 * @date 2020/5/28
 */
public class DecodeString {

    /**
     * 思路：栈
     * @param s 解码的字符串
     * @return 解码后的字符串
     */
    public String decodeString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        LinkedList<String> stack = new LinkedList<>();
        int index = 0;
        while (index < s.length()) {
            char current = s.charAt(index);
            if (Character.isDigit(current)) {
                StringBuilder number = new StringBuilder();
                while (Character.isDigit(s.charAt(index))) {
                    number.append(s.charAt(index++));
                }
                stack.add(number.toString());
            } else if (Character.isLetter(current) || current == '[') {
                stack.add(String.valueOf(s.charAt(index++)));
            } else {
                index++;
                LinkedList<String> stringStack = new LinkedList<>();
                while (!stack.isEmpty() && !stack.peekLast().equals("[")) {
                    stringStack.add(stack.removeLast());
                }
                Collections.reverse(stringStack);
                stack.removeLast();
                int number = Integer.parseInt(stack.removeLast());
                StringBuilder stringBuilder = new StringBuilder();
                for (String str : stringStack) {
                    stringBuilder.append(str);
                }
                StringBuilder currentBuilder = new StringBuilder();
                while (number > 0) {
                    currentBuilder.append(stringBuilder);
                    number--;
                }
                stack.add(currentBuilder.toString());
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (String str : stack) {
            resultBuilder.append(str);
        }
        return resultBuilder.toString();
    }
}
