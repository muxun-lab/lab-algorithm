package org.muxun.algorithm.leetcode.java.backtrack;

/**
 * 题号: 79
 * 题目: 单词搜索
 * 链接: <a href="https://leetcode.cn/problems/word-search">单词搜索</a>
 * 详情: 给定一个 m x n 二维字符网格 board 和一个字符串单词 word
 * 如果 word 存在于网格中，返回 true ；否则，返回 false
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格
 * 同一个单元格内的字母不允许被重复使用
 * @author 慕勋
 * @created 2024/2/1
 */
public class LeetCode79 {

    private String word;
    private char[][] board;

    private int m;

    private int n;

    /**
     * 思路: 回溯算法
     * @param board 矩阵
     * @param word  指定单词
     * @return 单词是否存在于矩阵中
     */
    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        this.board = board;
        this.word = word;
        // 设置可追寻的前进的路线，避免走回来
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = check(visited, i, j, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(boolean[][] visited, int i, int j, int x) {
        if (board[i][j] != word.charAt(x)) {
            return false;
        } else if (x == word.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] direction : directions) {
            int newi = i + direction[0];
            int newj = j + direction[1];
            if (newi >= 0 && newi < m && newj >= 0 && newj < n) {
                // 不要走回头路
                if (!visited[newi][newj]) {
                    boolean flag = check(visited, newi, newj, x + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}
