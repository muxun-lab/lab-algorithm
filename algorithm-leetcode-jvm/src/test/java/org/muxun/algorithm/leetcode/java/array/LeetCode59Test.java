package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/13
 */
@DisplayName("螺旋矩阵 II测试用例")
public class LeetCode59Test {

    @Test
    public void testOne() {
        int n = 3;
        int[][] res = new LeetCode59().generateMatrix(n);
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 1;
        int[][] res = new LeetCode59().generateMatrix(n);
        int[][] expected = {{1}};
        Assertions.assertArrayEquals(expected, res);
    }
}
