package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/7
 */
@DisplayName("二叉树的堂兄弟节点II测试用例")
public class LeetCode2641Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(10);
        root.right.right = new TreeNode(7);
        TreeNode res = new LeetCode2641().replaceValueInTree(root);
        Assertions.assertEquals(0, res.val);
        Assertions.assertEquals(0, res.left.val);
        Assertions.assertEquals(0, res.right.val);
        Assertions.assertEquals(7, res.left.left.val);
        Assertions.assertEquals(7, res.left.right.val);
        Assertions.assertEquals(11, res.right.right.val);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        TreeNode res = new LeetCode2641().replaceValueInTree(root);
        Assertions.assertEquals(0, res.val);
        Assertions.assertEquals(0, res.left.val);
        Assertions.assertEquals(0, res.right.val);
    }
}
