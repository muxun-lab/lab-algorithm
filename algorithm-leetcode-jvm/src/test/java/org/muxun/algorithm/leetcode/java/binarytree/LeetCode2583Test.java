package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/23
 */
@DisplayName("二叉树中的第K大层和测试用例")
public class LeetCode2583Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(6);
        int k = 2;
        long res = new LeetCode2583().kthLargestLevelSum(root, k);
        long expected = 13;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        int k = 1;
        long res = new LeetCode2583().kthLargestLevelSum(root, k);
        long expected = 3;
        Assertions.assertEquals(expected, res);
    }
}
