package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyeight.LeetCode100279;

/**
 * @author 慕勋
 * @created 2024-04-13
 */
@DisplayName("访问消失节点的最少时间测试用例")
public class LeetCode100279Test {

    @Test
    public void testOne() {
        int n = 3;
        int[][] edges = {{0, 1, 2}, {1, 2, 1}, {0, 2, 4}};
        int[] disappear = {1, 1, 5};
        int[] expected = {0, -1, 4};
        int[] res = new LeetCode100279().minimumTime(n, edges, disappear);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 3;
        int[][] edges = {{0, 1, 2}, {1, 2, 1}, {0, 2, 4}};
        int[] disappear = {1, 3, 5};
        int[] expected = {0, 2, 3};
        int[] res = new LeetCode100279().minimumTime(n, edges, disappear);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testThree() {
        int n = 2;
        int[][] edges = {{0, 1, 1}};
        int[] disappear = {1, 1};
        int[] expected = {0, -1};
        int[] res = new LeetCode100279().minimumTime(n, edges, disappear);
        Assertions.assertArrayEquals(expected, res);
    }
}
