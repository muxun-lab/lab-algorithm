package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 73
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/set-matrix-zeroes">矩阵置零</a>
 * <p>
 * 详情: 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 * @author 慕勋
 * @created 2024/2/19
 */
public class LeetCode73 {

    /**
     * 思路: 标记变量
     * 首先，使用额外数组进行标记是最简单的
     * 对额外数组进行优化的话，可以使用数组的第一行和第一列
     * 但是需要提前记录一下第一行和第一列有没有对应的值
     * @param matrix 矩阵数组
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row = false;
        boolean col = false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                col = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                row = true;
                break;
            }
        }
        // 如果当前节点为0，则第一行第一列记录一下
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 通过第一行第一列的0值，反刷新一下该行和该列
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 第一行的原始记录，更新一下零值列
        if (row) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        // 第一列的原始记录，更新一下零值行
        if (col) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
