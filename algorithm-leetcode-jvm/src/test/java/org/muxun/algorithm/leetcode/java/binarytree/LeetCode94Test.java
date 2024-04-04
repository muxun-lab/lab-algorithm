package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-03-13
 */
@DisplayName("二叉树的中序遍历测试用例")
public class LeetCode94Test {

    @Test
    public void binaryTreeInorderTraversalTestOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Assertions.assertIterableEquals(List.of(1, 3, 2), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalTestTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assertions.assertIterableEquals(List.of(8, 4, 9, 2, 10, 5, 11, 1, 6, 3, 7), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalTestThree() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(2, 1, 4, 3), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalTestFour() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        Assertions.assertIterableEquals(List.of(1, 2), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalTestFive() {
        TreeNode root = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(1), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalTestSix() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(4);
        root.left.right.left.left = new TreeNode(5);
        Assertions.assertIterableEquals(List.of(1, 5, 4, 2, 3), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalTestSeven() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        Assertions.assertIterableEquals(List.of(2, 4, 1, 3), new LeetCode94().inorderTraversal(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Assertions.assertIterableEquals(List.of(1, 3, 2), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assertions.assertIterableEquals(List.of(8, 4, 9, 2, 10, 5, 11, 1, 6, 3, 7), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestThree() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(2, 1, 4, 3), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestFour() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        Assertions.assertIterableEquals(List.of(1, 2), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestFive() {
        TreeNode root = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(1), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestSix() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(4);
        root.left.right.left.left = new TreeNode(5);
        Assertions.assertIterableEquals(List.of(1, 5, 4, 2, 3), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalIteratorUpgradeTestSeven() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        Assertions.assertIterableEquals(List.of(2, 4, 1, 3), new LeetCode94().inorderTraversalIteratorUpgrade(root));
    }

    @Test
    public void binaryTreeInorderTraversalRecursionTestOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Assertions.assertIterableEquals(List.of(1, 3, 2), new LeetCode94().inorderTraversalRecursion(root));
    }

    @Test
    public void binaryTreeInorderTraversalRecursionTestTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assertions.assertIterableEquals(List.of(8, 4, 9, 2, 10, 5, 11, 1, 6, 3, 7), new LeetCode94().inorderTraversalRecursion(root));
    }

    @Test
    public void binaryTreeInorderTraversalRecursionTestThree() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(2, 1, 4, 3), new LeetCode94().inorderTraversalRecursion(root));
    }

    @Test
    public void binaryTreeInorderTraversalRecursionTestFour() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        Assertions.assertIterableEquals(List.of(1, 2), new LeetCode94().inorderTraversalRecursion(root));
    }

    @Test
    public void binaryTreeInorderTraversalRecursionTestFive() {
        TreeNode root = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(1), new LeetCode94().inorderTraversalRecursion(root));
    }

    @Test
    public void binaryTreeInorderTraversalRecursionTestSix() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(4);
        root.left.right.left.left = new TreeNode(5);
        Assertions.assertIterableEquals(List.of(1, 5, 4, 2, 3), new LeetCode94().inorderTraversalRecursion(root));
    }

    @Test
    public void binaryTreeInorderTraversalMorrisTestOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Assertions.assertIterableEquals(List.of(1, 3, 2), new LeetCode94().inorderTraversalMorris(root));
    }

    @Test
    public void binaryTreeInorderTraversalMorrisTestTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assertions.assertIterableEquals(List.of(8, 4, 9, 2, 10, 5, 11, 1, 6, 3, 7), new LeetCode94().inorderTraversalMorris(root));
    }

    @Test
    public void binaryTreeInorderTraversalMorrisTestThree() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(2, 1, 4, 3), new LeetCode94().inorderTraversalMorris(root));
    }

    @Test
    public void binaryTreeInorderTraversalMorrisTestFour() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        Assertions.assertIterableEquals(List.of(1, 2), new LeetCode94().inorderTraversalMorris(root));
    }

    @Test
    public void binaryTreeInorderTraversalMorrisTestFive() {
        TreeNode root = new TreeNode(1);
        Assertions.assertIterableEquals(List.of(1), new LeetCode94().inorderTraversalMorris(root));
    }

    @Test
    public void binaryTreeInorderTraversalMorrisTestSix() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(4);
        root.left.right.left.left = new TreeNode(5);
        Assertions.assertIterableEquals(List.of(1, 5, 4, 2, 3), new LeetCode94().inorderTraversalMorris(root));
    }
}
