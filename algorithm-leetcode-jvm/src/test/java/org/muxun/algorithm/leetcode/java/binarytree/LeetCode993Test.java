package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2024/2/8
 */
@DisplayName("二叉树的堂兄弟节点测试用例")
public class LeetCode993Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        int x = 4;
        int y = 3;
        boolean res = new LeetCode993().isCousins(root, x, y);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int x = 5;
        int y = 4;
        boolean res = new LeetCode993().isCousins(root, x, y);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        int x = 2;
        int y = 3;
        boolean res = new LeetCode993().isCousins(root, x, y);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        int x = 4;
        int y = 3;
        boolean res = new LeetCode993().isCousinsByBFS(root, x, y);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFive() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int x = 5;
        int y = 4;
        boolean res = new LeetCode993().isCousinsByBFS(root, x, y);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testSix() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        int x = 2;
        int y = 3;
        boolean res = new LeetCode993().isCousinsByBFS(root, x, y);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }
}
