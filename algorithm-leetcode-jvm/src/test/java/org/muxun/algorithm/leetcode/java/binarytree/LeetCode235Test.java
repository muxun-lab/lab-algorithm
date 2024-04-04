package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/15
 */
@DisplayName("二叉搜索树的最近公共祖先")
public class LeetCode235Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = root;
        TreeNode res = new LeetCode235().lowestCommonAncestor(root, p, q);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = root.left;
        TreeNode q = root.left.right;
        TreeNode expected = root.left;
        TreeNode res = new LeetCode235().lowestCommonAncestor(root, p, q);
        Assertions.assertEquals(expected, res);
    }
}
