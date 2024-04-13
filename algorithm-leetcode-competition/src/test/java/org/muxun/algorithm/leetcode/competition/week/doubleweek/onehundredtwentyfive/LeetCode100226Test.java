package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyfive.LeetCode100226;

/**
 * @author 慕勋
 * @created 2024-03-02
 */
@DisplayName("在带权树网络中统计可连接服务器对数目测试用例")
public class LeetCode100226Test {

    @Test
    public void testOne() {
        int[][] edges = {{0, 1, 1}, {1, 2, 5}, {2, 3, 13}, {3, 4, 9}, {4, 5, 2}};
        int signalSpeed = 1;
        int[] expected = {0, 4, 6, 6, 4, 0};
        int[] res = new LeetCode100226().countPairsOfConnectableServers(edges, signalSpeed);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] edges = {{0, 6, 3}, {6, 5, 3}, {0, 3, 1}, {3, 2, 7}, {3, 1, 6}, {3, 4, 2}};
        int signalSpeed = 3;
        int[] expected = {2, 0, 0, 0, 0, 0, 2};
        int[] res = new LeetCode100226().countPairsOfConnectableServers(edges, signalSpeed);
        Assertions.assertArrayEquals(expected, res);
    }
}
