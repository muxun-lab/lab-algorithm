package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 119
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/pascals-triangle-ii">杨辉三角 II</a>
 * <p>
 * 详情: 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * @author 慕勋
 * @created 2020-01-24
 */
public class LeetCode119 {

    /**
     * 思路: 组合公式
     * @param rowIndex 杨辉三角所在的行
     * @return 指定行的杨辉三角集合
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentRowList = new ArrayList<>();
        if (rowIndex < 0) {
            return currentRowList;
        }
        currentRowList.add(1);
        long previous = 1;
        for (int i = 1; i <= rowIndex; i++) {
            long current = previous * (rowIndex - i + 1) / i;
            currentRowList.add((int) current);
            previous = current;
        }
        return currentRowList;
    }
}
