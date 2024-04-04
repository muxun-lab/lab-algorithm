package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.java.binarytree.LeetCode938;
import org.muxun.algorithm.leetcode.java.binarytree.TreeNode;

/**
 * @author 慕勋
 * @created 2024/2/26
 */
@DisplayName("二叉搜索树的范围和测试用例")
public class LeetCode938Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        int low = 7;
        int high = 15;
        int expected = 32;
        int res = new LeetCode938().rangeSumBST(root, low, high);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(6);
        int low = 6;
        int high = 10;
        int expected = 23;
        int res = new LeetCode938().rangeSumBST(root, low, high);
        Assertions.assertEquals(expected, res);
    }
}
