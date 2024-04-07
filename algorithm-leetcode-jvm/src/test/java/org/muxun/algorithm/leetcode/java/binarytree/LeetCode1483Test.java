package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-06
 */
@DisplayName("树节点的第 K 个祖先测试用例")
public class LeetCode1483Test {

    @Test
    public void testOne() {
        int n = 7;
        int[] parent = {-1, 0, 0, 1, 1, 2, 2};
        LeetCode1483 tree = new LeetCode1483(n, parent);
        int expected1 = 1;
        int expected2 = 0;
        int expected3 = -1;
        int res1 = tree.getKthAncestor(3, 1);
        int res2 = tree.getKthAncestor(5, 2);
        int res3 = tree.getKthAncestor(6, 3);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
    }
}
