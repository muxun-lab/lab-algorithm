package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-04-02
 */
@DisplayName("生命游戏单元测试")
public class GameOfLifeTest {

    @Test
    public void gameOfLifeTestOne() {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0},};
        int[][] result = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0},};
        new GameOfLife().gameOfLife(board);
        for (int[] line : board) {
            for (int num : line) {
                System.out.print(num);
            }
            System.out.println();
        }
        Assertions.assertArrayEquals(result, board);
    }

    @Test
    public void gameOfLifeTestTwo() {
        int[][] board = {{1},};
        int[][] result = {{0},};
        new GameOfLife().gameOfLife(board);
        for (int[] line : board) {
            for (int num : line) {
                System.out.print(num);
            }
            System.out.println();
        }
        Assertions.assertArrayEquals(result, board);
    }
}
