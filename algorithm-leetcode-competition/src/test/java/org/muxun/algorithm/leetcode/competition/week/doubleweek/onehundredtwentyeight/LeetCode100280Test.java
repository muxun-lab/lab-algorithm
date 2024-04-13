package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyeight.LeetCode100280;

/**
 * @author 慕勋
 * @created 2024-04-13
 */
@DisplayName("覆盖所有点的最少矩形数目测试用例")
public class LeetCode100280Test {

    @Test
    public void testOne() {
        int[][] points = {{2, 1}, {1, 0}, {1, 4}, {1, 8}, {3, 5}, {4, 6}};
        int w = 1;
        int expected = 2;
        int res = new LeetCode100280().minRectanglesToCoverPoints(points, w);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] points = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}};
        int w = 2;
        int expected = 3;
        int res = new LeetCode100280().minRectanglesToCoverPoints(points, w);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[][] points = {{2, 3}, {1, 2}};
        int w = 0;
        int expected = 2;
        int res = new LeetCode100280().minRectanglesToCoverPoints(points, w);
        Assertions.assertEquals(expected, res);
    }
}
