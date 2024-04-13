package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyfour.LeetCode3033;

/**
 * @author 慕勋
 * @created 2024/2/12
 */
@DisplayName("修改矩阵测试用例")
public class LeetCode3033Test {

    @Test
    public void testOne() {
        int[][] matrix = {{1, 2, -1}, {4, -1, 6}, {7, 8, 9}};
        int[][] answer = new LeetCode3033().modifiedMatrix(matrix);
        int[][] expected = {{1, 2, 9}, {4, 8, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Assertions.assertEquals(expected[i][j], answer[i][j]);
            }
        }
    }

    @Test
    public void testTwo() {
        int[][] matrix = {{3, -1}, {5, 2}};
        int[][] answer = new LeetCode3033().modifiedMatrix(matrix);
        int[][] expected = {{3, 2}, {5, 2}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Assertions.assertEquals(expected[i][j], answer[i][j]);
            }
        }
    }
}
