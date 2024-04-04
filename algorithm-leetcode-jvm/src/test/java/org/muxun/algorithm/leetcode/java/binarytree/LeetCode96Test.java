package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("不同的二叉搜索树测试用例")
public class LeetCode96Test {

    @Test
    public void testOne() {
        int n = 3;
        int expected = 5;
        int res = new LeetCode96().numTrees(n);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 1;
        int expected = 1;
        int res = new LeetCode96().numTrees(n);
        Assertions.assertEquals(expected, res);
    }
}
