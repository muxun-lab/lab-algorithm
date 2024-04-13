package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyfour;

import java.util.HashMap;

/**
 * 题号: 3033
 * 题目: 修改矩阵
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-384/problems/modify-the-matrix/">修改矩阵</a>
 * 详情: 给你一个下标从 0 开始、大小为 m x n 的整数矩阵 matrix 。
 * 新建一个下标从 0 开始、名为 answer 的矩阵。使 answer 与 matrix 相等。
 * 接着将其中每个值为 -1 的元素替换为所在列的 最大 元素。
 * 返回矩阵 answer
 * @author 慕勋
 * @created 2024/2/12
 */
public class LeetCode3033 {

    /**
     * 思路: 先计算最大值存起来，然后再寻找每一列的指定值
     * @param matrix 指定矩阵
     * @return
     */
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] answer = new int[m][n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int max = matrix[0][i];
            for (int j = 1; j < m; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            map.put(i, max);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != -1) {
                    answer[i][j] = matrix[i][j];
                } else {
                    answer[i][j] = map.get(j);
                }
            }
        }
        return answer;
    }
}
