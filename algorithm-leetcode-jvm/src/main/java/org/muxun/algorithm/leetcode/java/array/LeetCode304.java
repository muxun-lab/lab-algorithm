package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 304
 * 题目: 二维区域和检索 - 矩阵不可变
 * 链接: <a href="https://leetcode.cn/problems/range-sum-query-2d-immutable/">二维区域和检索 - 矩阵不可变</a>
 * 详情: 给定一个二维矩阵 matrix，以下类型的多个请求：
 * <p>
 * 计算其子矩形范围内元素的总和，该子矩阵的 左上角 为 (row1, col1) ，右下角 为 (row2, col2) 。
 * 实现 NumMatrix 类：
 * <p>
 * NumMatrix(int[][] matrix) 给定整数矩阵 matrix 进行初始化
 * int sumRegion(int row1, int col1, int row2, int col2) 返回 左上角 (row1, col1) 、右下角 (row2, col2) 所描述的子矩阵的元素 总和 。
 * @author 慕勋
 * @created 2023/12/15
 */
public class LeetCode304 {

    private int[][] sums;

    public LeetCode304(int[][] matrix) {
        int m = matrix.length;
        if (m > 0) {
            int n = matrix[0].length;
            sums = new int[m][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sums[i][j + 1] = sums[i][j] + matrix[i][j];
                }
            }
        }
    }

    /**
     * 思路: 一维前缀
     * @param row1 子矩阵左上角所在行
     * @param col1 子矩阵左上角所在列
     * @param row2 子矩阵右下角所在行
     * @param col2 子矩阵右下角所在列
     * @return 输出结果
     */
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        // 当前总点数-之前总点数
        for (int i = row1; i <= row2; i++) {
            sum += sums[i][col2 + 1] - sums[i][col1];
        }
        return sum;
    }
}
