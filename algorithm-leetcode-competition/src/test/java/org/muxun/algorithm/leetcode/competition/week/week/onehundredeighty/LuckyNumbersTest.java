package org.muxun.algorithm.leetcode.competition.week.week.onehundredeighty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty.LuckyNumbers;

import java.util.List;

/**
 * @author sunshine
 * @created 2020-03-15
 */
@DisplayName("矩阵中的幸运数单元测试")
public class LuckyNumbersTest {

    @Test
    public void luckyNumbersTestOne() {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        Assertions.assertIterableEquals(List.of(15), new LuckyNumbers().luckyNumbers(matrix));
    }

    @Test
    public void luckyNumbersTestTwo() {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        Assertions.assertIterableEquals(List.of(12), new LuckyNumbers().luckyNumbers(matrix));
    }

    @Test
    public void luckyNumbersTestThree() {
        int[][] matrix = {{7, 8}, {1, 2}};
        Assertions.assertIterableEquals(List.of(7), new LuckyNumbers().luckyNumbers(matrix));
    }

    @Test
    public void luckyNumbersTestFour() {
        int[][] matrix = {{7}};
        Assertions.assertIterableEquals(List.of(7), new LuckyNumbers().luckyNumbers(matrix));
    }
}
