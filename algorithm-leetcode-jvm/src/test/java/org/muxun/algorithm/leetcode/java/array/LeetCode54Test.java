package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/13
 */
@DisplayName("螺旋矩阵测试用例")
public class LeetCode54Test {

    @Test
    public void testOne() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> resList = new LeetCode54().spiralOrder(matrix);
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> resList = new LeetCode54().spiralOrder(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        Assertions.assertIterableEquals(expected, resList);
    }
}
