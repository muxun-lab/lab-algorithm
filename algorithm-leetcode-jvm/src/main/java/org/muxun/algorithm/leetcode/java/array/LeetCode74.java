package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 74
 * 题目: 搜索二维矩阵
 * 链接: <a href="https://leetcode.cn/problems/search-a-2d-matrix">搜索二维矩阵</a>
 * 详情: 给你一个满足下述两条属性的 m x n 整数矩阵：
 * * 每行中的整数从左到右按非严格递增顺序排列。
 * * 每行的第一个整数大于前一行的最后一个整数。
 * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false
 * @author 慕勋
 * @created 2024/2/6
 */
public class LeetCode74 {

    /**
     * 思路: 广度优先遍历，缩小查询范围
     * @param matrix 二维矩阵
     * @param target 搜索目标
     * @return 是否存在搜索目标
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int h1 = m;
        int h2 = 0;
        for (int i = m - 1; i >= 0; i--) {
            if (matrix[i][0] > target) {
                h1--;
            } else {
                break;
            }
        }
        for (int i = 0; i < h1; i++) {
            if (matrix[i][n - 1] < target) {
                h2++;
            } else {
                break;
            }
        }
        for (int i = h2; i < h1; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 思路: 二分查找
     * @param matrix 二维矩阵
     * @param target 搜索目标
     * @return 是否存在搜索目标
     */
    public boolean searchMatrixByBinarySearch(int[][] matrix, int target) {
        int rowIndex = searchFirstColumn(matrix, target);
        if (rowIndex < 0) {
            return false;
        }
        return searchRow(matrix[rowIndex], target);
    }

    /**
     * 查找第一行所在的元素
     * @param martrix 二维矩阵
     * @param target  搜索目标
     * @return 指定行
     */
    private int searchFirstColumn(int[][] martrix, int target) {
        int low = -1;
        int high = martrix.length - 1;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if (martrix[mid][0] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    /**
     * 二分查找每一行
     * @param row    行数据
     * @param target 搜索目标
     * @return 是否找到目标
     */
    private boolean searchRow(int[] row, int target) {
        int low = 0;
        int high = row.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return false;
    }
}
