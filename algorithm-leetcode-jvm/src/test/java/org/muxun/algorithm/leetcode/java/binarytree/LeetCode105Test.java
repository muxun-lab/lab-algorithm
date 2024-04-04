package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/5
 */
@DisplayName("从前序遍历和中序遍历序列构造二叉树")
public class LeetCode105Test {

    @Test
    public void testOne() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode res = new LeetCode105().buildTree(preorder, inorder);
        Assertions.assertEquals(3, res.val);
        Assertions.assertEquals(9, res.left.val);
        Assertions.assertEquals(20, res.right.val);
        Assertions.assertEquals(15, res.right.left.val);
        Assertions.assertEquals(7, res.right.right.val);
    }

    @Test
    public void testTwo() {
        int[] preorder = {-1};
        int[] inorder = {-1};
        TreeNode res = new LeetCode105().buildTree(preorder, inorder);
        Assertions.assertEquals(-1, res.val);
    }
}
