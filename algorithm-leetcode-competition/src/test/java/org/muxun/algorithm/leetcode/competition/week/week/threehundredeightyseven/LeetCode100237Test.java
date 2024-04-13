package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyseven.LeetCode100237;

/**
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("元素和小于等于 k 的子矩阵的数目测试用例")
public class LeetCode100237Test {

    @Test
    public void testOne() {
        int[][] grid = {{7, 6, 3}, {6, 6, 1}};
        int k = 18;
        int expected = 4;
        int res = new LeetCode100237().countSubmatrices(grid, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{7, 2, 9}, {1, 5, 0}, {2, 6, 6}};
        int k = 20;
        int expected = 6;
        int res = new LeetCode100237().countSubmatrices(grid, k);
        Assertions.assertEquals(expected, res);
    }
}
