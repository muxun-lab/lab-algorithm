package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/13
 */
@DisplayName("二叉树的垂序遍历")
public class LeetCode987Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = new LeetCode987().verticalTraversal(root);
        List<List<Integer>> expected = List.of(List.of(9), List.of(3, 15), List.of(20), List.of(7));
        Assertions.assertIterableEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = new LeetCode987().verticalTraversal(root);
        List<List<Integer>> expected = List.of(List.of(4), List.of(2), List.of(1, 5, 6), List.of(3), List.of(7));
        Assertions.assertIterableEquals(expected, res);
    }
}
