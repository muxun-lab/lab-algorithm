package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-12
 */
@DisplayName("冠军队伍 I测试用例")
public class LeetCode2923Test {

    @Test
    public void testOne() {
        int[][] grid = {{0, 1}, {0, 0}};
        int expected = 0;
        int res = new LeetCode2923().findChampion(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{0, 0, 1}, {1, 0, 1}, {0, 0, 0}};
        int expected = 1;
        int res = new LeetCode2923().findChampion(grid);
        Assertions.assertEquals(expected, res);
    }
}
