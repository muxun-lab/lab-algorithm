package org.muxun.algorithm.leetcode.java.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("最小高度树测试用例")
public class LeetCode310Test {

    @Test
    public void testOne() {
        int n = 4;
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
        List<Integer> expected = List.of(1);
        List<Integer> resList = new LeetCode310().findMinHeightTrees(n, edges);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        int n = 6;
        int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> expected = List.of(3, 4);
        List<Integer> resList = new LeetCode310().findMinHeightTrees(n, edges);
        Assertions.assertIterableEquals(expected, resList);
    }
}
