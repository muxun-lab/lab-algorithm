package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("")
public class LeetCode156Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(5);
        expected.right = new TreeNode(2);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);
        TreeNode res = new LeetCode156().upsideDownBinaryTree(root);
        Assertions.assertEquals(expected.val, res.val);
        Assertions.assertEquals(expected.left.val, res.left.val);
        Assertions.assertEquals(expected.right.val, res.right.val);
        Assertions.assertEquals(expected.right.left.val, res.right.left.val);
        Assertions.assertEquals(expected.right.right.val, res.right.right.val);
    }
}
