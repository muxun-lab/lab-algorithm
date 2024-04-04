package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：566
 * 题目：重塑矩阵
 * 题链：https://leetcode-cn.com/problems/reshape-the-matrix/
 * 详情：在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * @author 慕勋
 * @created 2020-03-06
 */
public class MatrixReshape {

    /**
     * 思路：队列
     * @param nums 给定的原始矩阵
     * @param r    想要的重构的矩阵的行数
     * @param c    想要的重构的矩阵的列数
     * @return 重塑的矩阵
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int originR = nums.length;
        int originC = nums[0].length;
        if (originR * originC != r * c) {
            return nums;
        }
        // 先将所有元素放入一个list里面
        List<Integer> allElementList = new ArrayList<>();
        for (int[] num : nums) {
            for (int j = 0; j < originC; j++) {
                allElementList.add(num[j]);
            }
        }
        List<int[]> resultList = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < r; i++) {
            int[] tempArray = new int[c];
            for (int j = 0; j < c; j++) {
                tempArray[j] = allElementList.get(start++);
            }
            resultList.add(tempArray);
        }
        return resultList.toArray(new int[r][]);
    }

    /**
     * 思路：直接在位置放值
     * @param nums 给定的原始矩阵
     * @param r    想要的重构的矩阵的行数
     * @param c    想要的重构的矩阵的列数
     * @return 重塑的矩阵
     */
    public int[][] matrixReshapeUpgrade(int[][] nums, int r, int c) {
        int originR = nums.length;
        int originC = nums[0].length;
        if (originR * originC != r * c) {
            return nums;
        }
        int[][] resultArray = new int[r][c];
        int newR = 0;
        int newC = 0;
        for (int[] num : nums) {
            for (int j = 0; j < originC; j++) {
                resultArray[newR][newC] = num[j];
                newC++;
                if (newC == c) {
                    newC = 0;
                    newR++;
                }
            }
        }
        return resultArray;
    }
}
