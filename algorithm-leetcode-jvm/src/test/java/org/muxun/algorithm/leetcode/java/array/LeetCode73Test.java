package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/19
 */
@DisplayName("矩阵置零测试用例")
public class LeetCode73Test {

    @Test
    public void testOne() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        new LeetCode73().setZeroes(matrix);
        Assertions.assertArrayEquals(expected, matrix);
    }

    @Test
    public void testTwo() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        new LeetCode73().setZeroes(matrix);
        Assertions.assertArrayEquals(expected, matrix);
    }
}
