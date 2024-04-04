package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-09
 */
@DisplayName("二叉搜索树迭代器测试用例")
public class LeetCode173Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        LeetCode173 res = new LeetCode173(root);
        Assertions.assertEquals(3, res.next());
        Assertions.assertEquals(7, res.next());
        Assertions.assertTrue(res.hasNext());
        Assertions.assertEquals(9, res.next());
        Assertions.assertTrue(res.hasNext());
        Assertions.assertEquals(15, res.next());
        Assertions.assertTrue(res.hasNext());
        Assertions.assertEquals(20, res.next());
        Assertions.assertFalse(res.hasNext());
    }
}
