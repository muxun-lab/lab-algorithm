package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 59
 * 题目: 螺旋矩阵 II
 * 链接: <a href="https://leetcode.cn/problems/spiral-matrix-ii">螺旋矩阵 II</a>
 * 详情: 给你一个正整数 n ，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * @author 慕勋
 * @created 2024/2/13
 */
public class LeetCode59 {

    /**
     * 思路: 生成矩阵
     * @param n 生成矩阵的大小
     * @return 二维矩阵
     */
    public int[][] generateMatrix(int n) {
        int size = n * n;
        int num = 1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] matrix = new int[n][n];
        int direction = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < size; i++) {
            matrix[row][col] = num;
            num++;
            int nextRow = row + directions[direction][0];
            int nextCol = col + directions[direction][1];
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || matrix[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4;
            }
            row = row + directions[direction][0];
            col = col + directions[direction][1];
        }
        return matrix;
    }
}
