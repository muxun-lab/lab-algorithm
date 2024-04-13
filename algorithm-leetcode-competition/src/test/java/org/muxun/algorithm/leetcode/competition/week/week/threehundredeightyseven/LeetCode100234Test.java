package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyseven.LeetCode100234;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("")
public class LeetCode100234Test {

    @Test
    public void testOne() {
        int[][] grid = {{1, 2, 2}, {1, 1, 0}, {0, 1, 0}};
        int expected = 3;
        int res = new LeetCode100234().minimumOperationsToWriteY(grid);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] grid = {{0, 1, 0, 1, 0}, {2, 1, 0, 1, 2}, {2, 2, 2, 0, 1}, {2, 2, 2, 2, 2}, {2, 1, 2, 2, 2}};
        int expected = 12;
        int res = new LeetCode100234().minimumOperationsToWriteY(grid);
        Assertions.assertEquals(expected, res);
    }
}
