package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-15
 */
@DisplayName("统计树中的合法路径数目测试用例")
public class LeetCode2867Test {

    @Test
    public void testOne() {
        int n = 5;
        int[][] edges = {{1, 2}, {1, 3}, {2, 4}, {2, 5}};
        long expected = 4;
        long res = new LeetCode2867().countPaths(n, edges);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 6;
        int[][] edges = {{1, 2}, {1, 3}, {2, 4}, {3, 5}, {3, 6}};
        long expected = 6;
        long res = new LeetCode2867().countPaths(n, edges);
        Assertions.assertEquals(expected, res);
    }
}
