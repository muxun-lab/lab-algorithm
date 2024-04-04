package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/6
 */
@DisplayName("搜索二维矩阵测试用例")
public class LeetCode74Test {

    @Test
    public void testOne() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean res = new LeetCode74().searchMatrix(matrix, target);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean res = new LeetCode74().searchMatrix(matrix, target);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean res = new LeetCode74().searchMatrix(matrix, target);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean res = new LeetCode74().searchMatrix(matrix, target);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }
}
