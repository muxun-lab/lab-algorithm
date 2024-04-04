package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-06
 */
@DisplayName("重塑矩阵测试类")
public class MatrixReshapeTest {

    @Test
    public void matrixReshapeTestOne() {
        int[][] resultArray = {{1, 2, 3, 4}};
        int[][] nums = {{1, 2}, {3, 4}};
        Assertions.assertArrayEquals(resultArray, new MatrixReshape().matrixReshape(nums, 1, 4));
    }

    @Test
    public void matrixReshapeTestTwo() {
        int[][] resultArray = {{1, 2}, {3, 4}};
        int[][] nums = {{1, 2}, {3, 4}};
        Assertions.assertArrayEquals(resultArray, new MatrixReshape().matrixReshape(nums, 2, 4));
    }

    @Test
    public void matrixReshapeTestThree() {
        int[][] resultArray = {{1, 2}, {3, 4}};
        int[][] nums = {{1, 2, 3, 4}};
        Assertions.assertArrayEquals(resultArray, new MatrixReshape().matrixReshape(nums, 2, 2));
    }

    @Test
    public void matrixReshapeUpgradeTestOne() {
        int[][] resultArray = {{1, 2, 3, 4}};
        int[][] nums = {{1, 2}, {3, 4}};
        Assertions.assertArrayEquals(resultArray, new MatrixReshape().matrixReshapeUpgrade(nums, 1, 4));
    }

    @Test
    public void matrixReshapeUpgradeTestTwo() {
        int[][] resultArray = {{1, 2}, {3, 4}};
        int[][] nums = {{1, 2}, {3, 4}};
        Assertions.assertArrayEquals(resultArray, new MatrixReshape().matrixReshapeUpgrade(nums, 2, 4));
    }

    @Test
    public void matrixReshapeUpgradeTestThree() {
        int[][] resultArray = {{1, 2}, {3, 4}};
        int[][] nums = {{1, 2, 3, 4}};
        Assertions.assertArrayEquals(resultArray, new MatrixReshape().matrixReshapeUpgrade(nums, 2, 2));
    }
}
