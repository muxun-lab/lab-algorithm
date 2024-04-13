package org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题号：5356
 * 题目：矩阵中的幸运数
 * 详情：给你一个 m * n 的矩阵，矩阵中的数字各不相同
 * 请你按任意顺序返回矩阵中的所有幸运数
 * 幸运数是指矩阵中满足同时下列两个条件的元素:
 * * 在同一行的所有元素中最小
 * * 在同一列的所有元素中最大
 * @author sunshine
 * @created 2020-03-15
 */
public class LuckyNumbers {

    /**
     * 思路：暴力
     * @param matrix
     * @return
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> maxOfLineMap = new HashMap<>();
        for (int[] lineArray : matrix) {
            int min = lineArray[0];
            int index = 0;
            for (int j = 1; j < lineArray.length; j++) {
                if (min > lineArray[j]) {
                    index = j;
                    min = lineArray[j];
                }
            }
            if (maxOfLineMap.containsKey(index)) {
                int currentMin = maxOfLineMap.get(index);
                if (currentMin < min) {
                    maxOfLineMap.put(index, min);
                }
            } else {
                maxOfLineMap.put(index, min);
            }
        }
        for (int key : maxOfLineMap.keySet()) {
            int max = maxOfLineMap.get(key);
            boolean flag = true;
            for (int[] ints : matrix) {
                if (ints[key] > max) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                resultList.add(max);
            }
        }
        return resultList;
    }
}
