package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/12
 */
@DisplayName("二叉树的后序遍历测试用例")
public class LeetCode145Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> resList = new LeetCode145().postorderTraversal(root);
        List<Integer> expected = List.of(3, 2, 1);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        TreeNode root = null;
        List<Integer> resList = new LeetCode145().postorderTraversal(root);
        List<Integer> expected = List.of();
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        TreeNode root = new TreeNode(1);
        List<Integer> resList = new LeetCode145().postorderTraversal(root);
        List<Integer> expected = List.of(1);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testFour() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> resList = new LeetCode145().postorderTraversalByIterate(root);
        List<Integer> expected = List.of(3, 2, 1);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testFive() {
        TreeNode root = null;
        List<Integer> resList = new LeetCode145().postorderTraversalByIterate(root);
        List<Integer> expected = List.of();
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testSix() {
        TreeNode root = new TreeNode(1);
        List<Integer> resList = new LeetCode145().postorderTraversalByIterate(root);
        List<Integer> expected = List.of(1);
        Assertions.assertIterableEquals(expected, resList);
    }
}
