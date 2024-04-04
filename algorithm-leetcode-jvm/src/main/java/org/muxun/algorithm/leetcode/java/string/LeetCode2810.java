package org.muxun.algorithm.leetcode.java.string;

import java.util.LinkedList;

/**
 * 题号: 2810
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/faulty-keyboard">故障键盘</a>
 * <p>
 * 详情: 你的笔记本键盘存在故障，每当你在上面输入字符 'i' 时，它会反转你所写的字符串。而输入其他字符则可以正常工作。
 * <p>
 * 给你一个下标从 0 开始的字符串 s ，请你用故障键盘依次输入每个字符。
 * <p>
 * 返回最终笔记本屏幕上输出的字符串。
 * @author 慕勋
 * @created 2024-04-01
 */
public class LeetCode2810 {

    /**
     * 思路: 常规思路
     * @param s 字符串
     * @return 输出字符串
     */
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'i') {
                ans.reverse();
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }

    /**
     * 思路: 常规思路
     * @param s 字符串
     * @return 输出字符串
     */
    public String finalStringByDeque(String s) {
        LinkedList<Character> deque = new LinkedList<>();
        char[] arr = s.toCharArray();
        int n = s.length();
        boolean fromHead = false;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (c != 'i') {
                if (fromHead) {
                    deque.offerFirst(c);
                } else {
                    deque.offerLast(c);
                }
            } else {
                fromHead = !fromHead;
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!deque.isEmpty()) {
            if (fromHead) {
                ans.append(deque.pollLast());
            } else {
                ans.append(deque.pollFirst());
            }
        }
        return ans.toString();
    }
}
