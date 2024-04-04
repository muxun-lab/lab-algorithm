package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/2
 */
@DisplayName("二叉树的最近公共祖先单元测试")
public class LeetCode236Test {

    @Test
    public void lowestCommonAncestorTestOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode expected = root;
        TreeNode p = root.left;
        TreeNode q = root.right;
        Assertions.assertEquals(root, new LeetCode236().lowestCommonAncestor(root, p, q));
    }

    @Test
    public void lowestCommonAncestorTestTwo() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode expected = root.left;
        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        Assertions.assertEquals(expected, new LeetCode236().lowestCommonAncestor(root, p, q));
    }

    @Test
    public void lowestCommonAncestorRecursionTestOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode expected = root;
        TreeNode p = root.left;
        TreeNode q = root.right;
        Assertions.assertEquals(root, new LeetCode236().lowestCommonAncestorRecursion(root, p, q));
    }

    @Test
    public void lowestCommonAncestorRecursionTestTwo() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode expected = root.left;
        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        Assertions.assertEquals(expected, new LeetCode236().lowestCommonAncestorRecursion(root, p, q));
    }
}
