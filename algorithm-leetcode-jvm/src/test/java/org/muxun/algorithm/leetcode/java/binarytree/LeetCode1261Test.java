package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-15
 */
@DisplayName("受污染的二叉树中查找元素测试用例")
public class LeetCode1261Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(-1);
        boolean expected1 = false;
        boolean expected2 = true;
        LeetCode1261 res = new LeetCode1261(root);
        boolean res1 = res.find(1);
        boolean res2 = res.find(2);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);
        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = false;
        LeetCode1261 res = new LeetCode1261(root);
        boolean res1 = res.find(1);
        boolean res2 = res.find(3);
        boolean res3 = res.find(5);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
    }
}
