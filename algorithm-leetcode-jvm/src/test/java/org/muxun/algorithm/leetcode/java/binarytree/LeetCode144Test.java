package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024-02-11
 */
@DisplayName("二叉树前序遍历测试用例")
public class LeetCode144Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1, 2, 3);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(1);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        TreeNode root = null;
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of();
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testFour() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1, 2);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testFive() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1, 2);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testSix() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1, 2, 3);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testSeven() {
        TreeNode root = new TreeNode(1);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testEight() {
        TreeNode root = null;
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of();
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testNine() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1, 2);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTen() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        List<Integer> resList = new LeetCode144().preorderTraversal(root);
        List<Integer> expected = List.of(1, 2);
        Assertions.assertIterableEquals(expected, resList);
    }
}
