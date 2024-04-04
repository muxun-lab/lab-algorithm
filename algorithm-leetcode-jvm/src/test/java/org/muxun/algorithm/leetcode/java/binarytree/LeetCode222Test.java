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
 * @created 2024-03-09
 */
@DisplayName("完全二叉树的节点个数测试用例")
public class LeetCode222Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        int expected = 6;
        int res = new LeetCode222().countNodes(root);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = null;
        int expected = 0;
        int res = new LeetCode222().countNodes(root);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        TreeNode root = new TreeNode(1);
        int expected = 1;
        int res = new LeetCode222().countNodes(root);
        Assertions.assertEquals(expected, res);
    }
}
