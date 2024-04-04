package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号：5
 * 题目：最长回文字符串
 * 详情：给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * @author 慕勋
 * @created 2020-02-11
 */
public class LongestPalindrome {

    /**
     * 思路：选择中心点，并向外进行扩展
     * 考虑奇数长度字符串和偶数长度字符串的问题
     * @param s 给定的字符串
     * @return 最长的回文字符串
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            // 奇数，以一个字母作为中心进行扩散
            int lengthOne = this.expandAroundCenter(s, i, i);
            // 偶数，以两个字母之间的间隙作为中心进行扩散
            int lengthTwo = this.expandAroundCenter(s, i, i + 1);
            // 获取两个中心最长的遍历子串索引长度
            int length = Math.max(lengthOne, lengthTwo);
            if (length > end - start) {
                // 获得起始位置
                start = i - (length - 1) / 2;
                // 获得结束位置
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * 围绕中心向两边进行扩展，让左面的元素等于右面的元素
     * @param s     给定的字符串
     * @param start 向左遍历的起始游标
     * @param end   向右遍历的起始游标
     * @return 遍历的中心点
     */
    private int expandAroundCenter(String s, int start, int end) {
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            } else {
                break;
            }
        }
        return end - start - 1;
    }

    /**
     * 思路：选择中心点，并向外进行扩展
     * 思路正确，实现有很大问题
     * 贴在此处方便以后思考
     * @param s 给定的字符串
     * @return 最长的回文字符串
     */
    public String longestPalindromeOld(String s) {
        if (s.length() == 0) {
            return s;
        }
        String longestPalindrome = s.substring(0, 1);
        int max = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(s.substring(0, 1))) {
                longestPalindrome = s.substring(0, i + 1);
                max = longestPalindrome.length();
            } else {
                break;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            int start = i - 1;
            int end = i + 1;
            while (start >= 0 && end < s.length()) {
                if (s.charAt(start) == s.charAt(end)) {
                    if (s.substring(start, end + 1).length() > max) {
                        longestPalindrome = s.substring(start, end + 1);
                        max = longestPalindrome.length();
                    }
                    start--;
                    end++;
                } else if (s.charAt(start) == s.charAt(i)) {
                    if (s.substring(start, i + 1).length() > max) {
                        longestPalindrome = s.substring(start, i + 1);
                        max = longestPalindrome.length();
                    }
                    break;
                } else if (s.charAt(end) == s.charAt(i)) {
                    if (s.substring(i, end + 1).length() > max) {
                        longestPalindrome = s.substring(i, end + 1);
                        max = longestPalindrome.length();
                    }
                    break;
                } else {
                    break;
                }
            }
        }
        return longestPalindrome;
    }

    /**
     * 思路：动态规划
     * 定义：dp[i][j]表示字符串从i到j个字母组成的是回文字符串
     * 转移方程：dp[i][j]=dp[i+1][j-1]，且s[i]=s[j]
     * @param s 回文字符串
     * @return 最大回文字符串
     */
    public String longestPalindromeWithDP(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int maxLength = 1;
        int begin = 0;
        boolean[][] dp = new boolean[n][n];
        // 所有长度为1的字符串都是回文字符串
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        // 先枚举子串长度
        for (int left = 2; left <= n; left++) {
            // 左边界
            for (int i = 0; i < n; i++) {
                // 获得右边界
                int j = left + i - 1;
                if (j >= n) {
                    break;
                }
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 只要dp[i][left]==true成立，那么从i到left的回文字符串就成立，此时记录回文字符串的长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLength);
    }
}
