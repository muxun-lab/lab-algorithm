package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 240
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/search-a-2d-matrix-ii">搜索二维矩阵II</a>
 * <p>
 * 详情: 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 * * 每行的元素从左到右升序排列。
 * * 每列的元素从上到下升序排列。
 * @author 慕勋
 * @created 2024/2/19
 */
public class LeetCode240 {

    /**
     * 思路: 由于是向左和向下都是有序的，所以可以从右上角出发，直到到右下角
     * @param matrix 二维矩阵
     * @param target 搜索目标
     * @return 是否可以找到指定目标
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = n - 1;
        while (x < m && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] < target) {
                x++;
            } else {
                y--;
            }
        }
        return false;
    }
}
