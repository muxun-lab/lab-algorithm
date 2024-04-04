package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/2
 */
@DisplayName("验证二叉搜索树单元测试")
public class LeetCode98Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean res = new LeetCode98().isValidBST(root);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        boolean res = new LeetCode98().isValidBST(root);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }
}
