package org.muxun.algorithm.leetcode.java.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-26
 */
@DisplayName("设计可以求最短路径的图类测试用例")
public class LeetCode2642Test {

    @Test
    public void testOne() {
        int[][] edges = {{0, 2, 5}, {0, 1, 2}, {1, 2, 1}, {3, 0, 3}};
        int[] add = {1, 3, 4};
        LeetCode2642 graph = new LeetCode2642(4, edges);
        int expected1 = 6;
        int expected2 = -1;
        int expected3 = 6;
        int res1 = graph.shortestPath(3, 2);
        int res2 = graph.shortestPath(0, 3);
        graph.addEdge(add);
        int res3 = graph.shortestPath(0, 3);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
    }
}
