package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("恢复二叉搜索树测试用例")
public class LeetCode99Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(1);
        expected.left.right = new TreeNode(2);
        new LeetCode99().recoverTree(root);
        Assertions.assertEquals(expected.val, root.val);
        Assertions.assertEquals(expected.left.val, root.left.val);
        Assertions.assertEquals(expected.left.right.val, root.left.right.val);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        TreeNode expected = new TreeNode(2);
        expected.left = new TreeNode(1);
        expected.right = new TreeNode(4);
        expected.right.left = new TreeNode(3);
        new LeetCode99().recoverTree(root);
        Assertions.assertEquals(expected.val, root.val);
        Assertions.assertEquals(expected.left.val, root.left.val);
        Assertions.assertEquals(expected.right.val, root.right.val);
        Assertions.assertEquals(expected.right.left.val, root.right.left.val);
    }
}
