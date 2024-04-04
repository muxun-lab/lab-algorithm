package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/23
 */
@DisplayName("二叉树中的最大路径和测试用例")
public class LeetCode124Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int res = new LeetCode124().maxPathSum(root);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int res = new LeetCode124().maxPathSum(root);
        int expected = 42;
        Assertions.assertEquals(expected, res);
    }
}
