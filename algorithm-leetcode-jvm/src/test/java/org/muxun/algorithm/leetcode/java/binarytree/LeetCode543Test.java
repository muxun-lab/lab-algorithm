package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/5
 */
@DisplayName("二叉树的直径")
public class LeetCode543Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int res = new LeetCode543().diameterOfBinaryTree(root);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int res = new LeetCode543().diameterOfBinaryTree(root);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }
}
