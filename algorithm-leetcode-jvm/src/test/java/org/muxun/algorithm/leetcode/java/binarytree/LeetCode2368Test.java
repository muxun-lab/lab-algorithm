package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/3/2
 */
@DisplayName("受限条件下可到达节点的数目测试用例")
public class LeetCode2368Test {

    @Test
    public void testOne() {
        int n = 7;
        int[][] edges = {{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
        int[] restricted = {4, 5};
        int expected = 4;
        int res = new LeetCode2368().reachableNodes(n, edges, restricted);
    }

    @Test
    public void testTwo() {
        int n = 7;
        int[][] edges = {{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}};
        int[] restricted = {4, 2, 1};
        int expected = 3;
        int res = new LeetCode2368().reachableNodes(n, edges, restricted);
    }
}
