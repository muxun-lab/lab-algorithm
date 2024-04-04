package org.muxun.algorithm.leetcode.java.binarysearch;

/**
 * 题号：69
 * 题目：x的平方根
 * 详情：实现int sqrt(int x)函数
 * 计算并返回x的平方根，其中x是非负整数
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 * @author 慕勋
 * @created 2020-03-16
 */
public class MySqrt {

    /**
     * 思路：迭代
     * 超时
     * @param x 需要求平方根整数部分的整数
     * @return 给定整数的平方根的整数部分
     */
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int i = 1;
        int sum = i * i;
        while (sum < x) {
            i++;
            sum = i * i;
        }
        if (sum > x) {
            i--;
        }
        return i;
    }

    /**
     * 思路：二分法
     * @param x 需要求平方根整数部分的整数
     * @return 给定整数的平方根的整数部分
     */
    public int mySqrtBinarySearch(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2, right = x / 2;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            long sum = (long) middle * middle;
            if (sum == x) {
                return middle;
            } else if (sum > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return right;
    }

}
