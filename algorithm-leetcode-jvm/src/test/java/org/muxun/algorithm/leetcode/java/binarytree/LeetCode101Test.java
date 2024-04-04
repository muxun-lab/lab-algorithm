package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-10
 */
@DisplayName("对称二叉树单元测试")
public class LeetCode101Test {

    @Test
    public void isSymmetricTreeTestOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        Assertions.assertTrue(new LeetCode101().isSymmetric(root));
    }

    @Test
    public void isSymmetricTreeTestTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        Assertions.assertFalse(new LeetCode101().isSymmetric(root));
    }

    @Test
    public void isSymmetricTreeIteratorTestOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        Assertions.assertTrue(new LeetCode101().isSymmetricIterator(root));
    }

    @Test
    public void isSymmetricTreeIteratorTestTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        Assertions.assertFalse(new LeetCode101().isSymmetricIterator(root));
    }
}
