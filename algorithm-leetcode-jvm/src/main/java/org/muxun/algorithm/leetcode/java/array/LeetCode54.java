package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 54
 * 题目: <a href="https://leetcode.cn/problems/spiral-matrix">螺旋矩阵</a>
 * 详情: 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * @author 慕勋
 * @created 2024/2/13
 */
public class LeetCode54 {

    /**
     * 思路: 生成矩阵
     * @param matrix 矩阵
     * @return 矩阵中的元素
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resList = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return resList;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m * n;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < size; i++) {
            resList.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[direction][0];
            int nextCol = col + directions[direction][1];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                direction = (direction + 1) % 4;
            }
            row += directions[direction][0];
            col += directions[direction][1];
        }
        return resList;
    }
}
