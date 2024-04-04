package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：48
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/rotate-image">旋转图像</a>
 * 详情：给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * @author 慕勋
 * @created 2020-02-24
 */
public class LeetCode48 {

    /**
     * 思路：旋转90度相当于转置矩阵，再翻转每一行
     * 先沿右上-左下的对角线进行翻转，再沿水平中轴线上翻转
     * @param matrix 二维数组矩阵
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] ints : matrix) {
            for (int i = 0; i < n / 2; i++) {
                int index = n - i - 1;
                int temp = ints[i];
                ints[i] = ints[index];
                ints[index] = temp;
            }
        }
    }

    /**
     * 思路：指针移动法，从外到内进行旋转
     * @param matrix 二维数组矩阵
     */
    public void rotateUpgrade(int[][] matrix) {
        int n = matrix.length;
        int time = n - 1;
        int i = 0, j = n - 1;
        while (i < time && j >= 0) {
            int x = i, y = j;
            while (x < j) {
                int tempOne = matrix[i][x];
                int tempTwo = matrix[x][j];
                int tempThree = matrix[j][y];
                int tempFour = matrix[y][i];
                matrix[i][x] = tempFour;
                matrix[x][j] = tempOne;
                matrix[j][y] = tempTwo;
                matrix[y][i] = tempThree;
                x++;
                y--;
            }
            i++;
            j--;
        }
    }
}
