package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/19
 */
@DisplayName("搜索二维矩阵II")
public class LeetCode240Test {

    @Test
    public void testOne() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean expected = true;
        boolean res = new LeetCode240().searchMatrix(matrix, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        boolean expected = false;
        boolean res = new LeetCode240().searchMatrix(matrix, target);
        Assertions.assertEquals(expected, res);
    }
}
