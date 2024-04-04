package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号: 2697
 * 题目: 字典序最小回文串
 * 链接: <a href="https://leetcode.cn/problems/lexicographically-smallest-palindrome/">字典序最小回文串</a>
 * 详情: 给你一个由 小写英文字母 组成的字符串 s ，你可以对其执行一些操作。在一步操作中，你可以用其他小写英文字母 替换  s 中的一个字符。
 * <p>
 * 请你执行 尽可能少的操作 ，使 s 变成一个 回文串 。如果执行 最少 操作次数的方案不止一种，则只需选取 字典序最小 的方案。
 * <p>
 * 对于两个长度相同的字符串 a 和 b ，在 a 和 b 出现不同的第一个位置，如果该位置上 a 中对应字母比 b 中对应字母在字母表中出现顺序更早，则认为 a 的字典序比 b 的字典序要小。
 * <p>
 * 返回最终的回文字符串。
 * @author 慕勋
 * @created 2023/12/14
 */
public class LeetCode2697 {

    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int x = 0;
        int y = s.length() - 1;
        while (x < y) {
            if (arr[x] != arr[y]) {
                char temp = (char) Math.min(arr[x], arr[y]);
                arr[x] = temp;
                arr[y] = temp;
            }
            x++;
            y--;
        }
        return new String(arr);
    }
}
