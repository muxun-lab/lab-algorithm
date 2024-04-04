package org.muxun.algorithm.leetcode.java.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024-04-04
 */
@DisplayName("有向无环图中一个节点的所有祖先测试用例")
public class LeetCode2192Test {

    @Test
    public void testOne() {
        int n = 8;
        int[][] edges = {{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
        List<List<Integer>> expected = List.of(List.of(), List.of(), List.of(), List.of(0, 1), List.of(0, 2), List.of(0, 1, 3), List.of(0, 1, 2, 3, 4), List.of(0, 1, 2, 3));
        List<List<Integer>> resList = new LeetCode2192().getAncestors(n, edges);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        int n = 5;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        List<List<Integer>> expected = List.of(List.of(), List.of(0), List.of(0, 1), List.of(0, 1, 2), List.of(0, 1, 2, 3));
        List<List<Integer>> resList = new LeetCode2192().getAncestors(n, edges);
        Assertions.assertIterableEquals(expected, resList);
    }
}
