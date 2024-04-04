package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：1004
 * 题目：最大连续1的个数 III
 * 详情：给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。
 * 返回仅包含 1 的最长（连续）子数组的长度
 * 提示：
 * * 1 <= A.length <= 20000
 * * 0 <= K <= A.length
 * * A[i]为0或1
 * @author 慕勋
 * @created 2020-02-10
 */
public class LongestOnes {

    /**
     * 思路：
     * @param A 给定的二进制数组
     * @param K 可以把0变成1的最大值
     * @return 包含1的最长连续子数组的长度
     */
    public int longestOnes(int[] A, int K) {
        int max = 0;
        int index = 0;
        int nextIndex = 0;
        int count = 0;
        int left = K;
        while (index < A.length) {
            if (A[index] == 1) {
                count++;
                index++;
                continue;
            }
            if (A[index] == 0) {
                if (left > 0) {
                    left--;
                    count++;
                }
                if (left == K - 2) {
                    nextIndex = index;
                }
                if (left == 0) {
                    if (index <= A.length - 2) {
                        if (A[index + 1] == 1) {
                            while (index < A.length - 1) {
                                if (A[++index] == 1) {
                                    count++;
                                } else {
                                    break;
                                }
                            }
                            if (index == A.length - 1) {
                                break;
                            }
                        } else {
                            left = K;
                            max = Math.max(max, count);
                            count = 0;
                            if (nextIndex == 0) {
                                index++;
                            } else if (nextIndex == index) {
                                index++;
                            } else {
                                index = nextIndex;
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    index++;
                }
            }
        }
        return Math.max(max, count);
    }

    /**
     * 思路：滑动窗口
     * A[end]==1时，start不变，end继续向右
     * A[end]==0时
     * 0的数量在K的范围内，end继续向右移动
     * 0的数量超出K的范围，start向右找到第一个0，并向右继续移动一格，可以使0的个数-1
     * @param A 给定的二进制数组
     * @param K 可以把0变成1的最大值
     * @return 包含1的最长连续子数组的长度
     */
    public int longestOnesUpgrade(int[] A, int K) {
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < A.length) {
            if (A[end] == 0) {
                if (K == 0) {
                    while (A[start] == 1) {
                        start++;
                    }
                    start++;
                } else {
                    K--;
                }
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }
}
