package org.muxun.algorithm.leetcode.java.backtrack;

import java.util.*;

/**
 * 题号: 131
 * 题目: 分割回文串
 * 链接: <a href="https://leetcode.cn/problems/palindrome-partitioning">分割回文串</a>
 * 详情: 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串
 * 返回 s 所有可能的分割方案
 * 回文串 是正着读和反着读都一样的字符串
 * @author 慕勋
 * @created 2024/2/1
 */
public class LeetCode131 {

    private List<List<String>> backtracks;

    private int m;

    private char[] arr;

    private boolean[][] dp;

    /**
     * 思路: 回溯算法
     * @param s 指定字符串
     * @return 回文字符串子集
     */
    public List<List<String>> partition(String s) {
        if (Objects.isNull(s) || s.isEmpty()) {
            return new ArrayList<>();
        }
        m = s.length();
        backtracks = new ArrayList<>();
        Deque<String> stack = new LinkedList<>();
        arr = s.toCharArray();
        backtrack(0, stack);
        return backtracks;
    }

    private void backtrack(int x, Deque<String> stack) {
        if (x == m) {
            // 如果一直是回文字符串，且遍历到给定串的末尾，则一定是一个回文串
            backtracks.add(new ArrayList<>(stack));
            return;
        }
        for (int i = x; i < m; i++) {
            // 不是回文串的话没有继续的必要了
            if (!check(x, i)) {
                continue;
            }
            // 添加当前串，然后继续看下一个串
            stack.addLast(new String(arr, x, i + 1 - x));
            backtrack(i + 1, stack);
            stack.removeLast();
        }
    }

    private boolean check(int left, int right) {
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 思路: 回溯算法+DP
     * 通过DP记录已经遍历的情况，避免重复进行遍历
     * 状态转移方程：状态dp[i][j]表示s[i][j]是否是回文字符串
     * 在s[i] = s[j]时，dp[i][j]参考dp[i+1][j-1]
     * @param s 指定字符串
     * @return 回文字符串子集
     */
    public List<List<String>> partitionByDP(String s) {
        if (Objects.isNull(s) || s.isEmpty()) {
            return new ArrayList<>();
        }
        m = s.length();
        backtracks = new ArrayList<>();
        Deque<String> stack = new LinkedList<>();
        arr = s.toCharArray();
        dp = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i] && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[i][j] = true;
                }
            }
        }
        backtrackByDP(0, stack);
        return backtracks;
    }

    private void backtrackByDP(int x, Deque<String> stack) {
        if (x == m) {
            backtracks.add(new ArrayList<>(stack));
            return;
        }
        for (int i = x; i < m; i++) {
            if (dp[x][i]) {
                stack.addLast(new String(arr, x, i + 1 - x));
                backtrack(i + 1, stack);
                stack.removeLast();
            }
        }
    }
}
