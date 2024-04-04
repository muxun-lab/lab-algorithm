package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/2
 */
@DisplayName("二叉搜索树中第K小的元素测试用例")
public class LeetCode230Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int res = new LeetCode230().kthSmallest(root, 1);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        int res = new LeetCode230().kthSmallest(root, 3);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }
}
