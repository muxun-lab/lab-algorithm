package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：289
 * 题目：生命游戏
 * 链接：https://leetcode-cn.com/problems/game-of-life/
 * 详情：给定一个包含m × n个格子的面板，每一个格子都可以看成是一个细胞
 * 每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）
 * 每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：
 * 1. 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡
 * 2. 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活
 * 3. 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡
 * 4. 如果死细胞周围正好有三个活细胞，则该位置死细胞复活
 * 根据当前状态，写一个函数来计算面板上所有细胞的下一个（一次更新后的）状态
 * 下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的
 * @author 慕勋
 * @created 2020-04-02
 */
public class GameOfLife {

    private int m;

    private int n;

    /**
     * 思路：DFS
     * @param board 给定的细胞数组
     */
    public void gameOfLife(int[][] board) {
        m = board.length;
        n = board[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int[] livingAndDeathNumArray = getLivingNums(board, i, j);
                dp[i][j] = toBeAlive(livingAndDeathNumArray, board[i][j]) ? 1 : 0;
            }
        }
        System.arraycopy(dp, 0, board, 0, m);
    }

    public boolean toBeAlive(int[] livingAndDeathNumArray, int current) {
        if (livingAndDeathNumArray[0] < 2 && current == 1) {
            return false;
        }
        if ((livingAndDeathNumArray[0] == 2 || livingAndDeathNumArray[0] == 3) && current == 1) {
            return true;
        }
        if (livingAndDeathNumArray[0] > 3 && current == 1) {
            return false;
        }
        return current == 0 && livingAndDeathNumArray[0] == 3;
    }

    public int[] getLivingNums(int[][] board, int i, int j) {
        int[] livingAndDeathNumArray = new int[2];
        // 左上角
        if (i - 1 >= 0 && j - 1 >= 0) {
            count(board[i - 1][j - 1], livingAndDeathNumArray);
        }
        // 正上方
        if (i - 1 >= 0) {
            count(board[i - 1][j], livingAndDeathNumArray);
        }
        // 右上方
        if (i - 1 >= 0 && j + 1 < n) {
            count(board[i - 1][j + 1], livingAndDeathNumArray);
        }
        // 正左方
        if (j - 1 >= 0) {
            count(board[i][j - 1], livingAndDeathNumArray);
        }
        // 正右方
        if (j + 1 < n) {
            count(board[i][j + 1], livingAndDeathNumArray);
        }
        // 左下方
        if (i + 1 < m && j - 1 >= 0) {
            count(board[i + 1][j - 1], livingAndDeathNumArray);
        }
        // 正下方
        if (i + 1 < m) {
            count(board[i + 1][j], livingAndDeathNumArray);
        }
        // 右下方
        if (i + 1 < m && j + 1 < n) {
            count(board[i + 1][j + 1], livingAndDeathNumArray);
        }
        return livingAndDeathNumArray;
    }

    public void count(int current, int[] livingAndDeathNumArray) {
        if (isLiving(current)) {
            livingAndDeathNumArray[0] = livingAndDeathNumArray[0] + 1;
        } else {
            livingAndDeathNumArray[1] = livingAndDeathNumArray[1] + 1;
        }
    }

    public boolean isLiving(int current) {
        return current == 1;
    }
}
