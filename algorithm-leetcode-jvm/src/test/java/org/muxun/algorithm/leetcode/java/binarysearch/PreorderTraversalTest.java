package org.muxun.algorithm.leetcode.java.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.java.binarytree.PreorderTraversal;
import org.muxun.algorithm.leetcode.java.binarytree.TreeNode;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-03-18
 */
@DisplayName("二叉树前序遍历单元测试")
public class PreorderTraversalTest {

    @Test
    public void preorderTraversalRecursionTestOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Assertions.assertEquals(List.of(1, 2, 3), new PreorderTraversal().preorderTraversal(root));
    }

    @Test
    public void preorderTraversalIteratorTestOne() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Assertions.assertEquals(List.of(1, 2, 3), new PreorderTraversal().preorderTraversalIterator(root));
    }

    @Test
    public void preorderTraversalIteratorTestTwo() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Assertions.assertEquals(List.of(2, 1, 4, 5, 3), new PreorderTraversal().preorderTraversalIterator(root));
    }
}
