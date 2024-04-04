package org.muxun.algorithm.leetcode.java.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-10
 */
@DisplayName("相同的树单元测试")
public class SameTreeTest {

    @Test
    public void isSameTreeTestOne() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        Assertions.assertTrue(new SameTree().isSameTree(p, q));
    }

    @Test
    public void isSameTreeTestTwo() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);
        Assertions.assertFalse(new SameTree().isSameTree(p, q));
    }

    @Test
    public void isSameTreeTestThree() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        Assertions.assertFalse(new SameTree().isSameTree(p, q));
    }

    @Test
    public void isSameTreeRecursionTestOne() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        Assertions.assertTrue(new SameTree().isSameTreeRecursion(p, q));
    }

    @Test
    public void isSameTreeRecursionTestTwo() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);
        Assertions.assertFalse(new SameTree().isSameTreeRecursion(p, q));
    }

    @Test
    public void isSameTreeRecursionTestThree() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        Assertions.assertFalse(new SameTree().isSameTreeRecursion(p, q));
    }
}
