package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 118
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/pascals-triangle">杨辉三角</a>
 * <p>
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 * @author 慕勋
 * @created 2020-01-24
 */
public class LeetCode118 {
    /**
     * 思路：n-2 = 上个数组每个数相加而得
     * n行的数组元素个数：n
     * @param numRows 杨辉三角行数
     * @return 杨辉三角
     */
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> pascalTriangleList = new ArrayList<>();
        if (numRows >= 1) {
            List<Integer> firstRowList = new ArrayList<>();
            firstRowList.add(1);
            pascalTriangleList.add(firstRowList);
        }
        if (numRows >= 2) {
            List<Integer> secondRowList = new ArrayList<>();
            secondRowList.add(1);
            secondRowList.add(1);
            pascalTriangleList.add(secondRowList);
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> lastRowList = pascalTriangleList.get(i - 1);
            List<Integer> currentRowList = new ArrayList<>();
            currentRowList.add(1);
            for (int j = 0; j < lastRowList.size() - 1; j++) {
                currentRowList.add(lastRowList.get(j) + lastRowList.get(j + 1));
            }
            currentRowList.add(1);
            pascalTriangleList.add(currentRowList);
        }
        return pascalTriangleList;
    }

    /**
     * 思路：杨辉三角计算
     * 每一行，(行首左移一位) + (行首右移一位)
     * @param numRows 杨辉三角行数
     * @return 杨辉三角
     */
    public List<List<Integer>> generateOptimization(int numRows) {
        List<List<Integer>> pascalTriangleList = new ArrayList<>();
        if (numRows <= 0) {
            return pascalTriangleList;
        }
        List<Integer> firstRowList = new ArrayList<>();
        firstRowList.add(1);
        pascalTriangleList.add(firstRowList);
        while (pascalTriangleList.size() < numRows) {
            List<Integer> currentRowList = new ArrayList<>();
            List<Integer> tempOneLastRowList = new ArrayList<>(pascalTriangleList.get(pascalTriangleList.size() - 1));
            List<Integer> tempTwoLastRowList = new ArrayList<>(pascalTriangleList.get(pascalTriangleList.size() - 1));
            tempOneLastRowList.add(0, 0);
            tempTwoLastRowList.add(tempTwoLastRowList.size(), 0);
            for (int i = 0; i < tempOneLastRowList.size(); i++) {
                currentRowList.add(tempOneLastRowList.get(i) + tempTwoLastRowList.get(i));
            }
            pascalTriangleList.add(currentRowList);
        }
        return pascalTriangleList;
    }
}
