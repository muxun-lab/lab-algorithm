package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/2/23
 */
@DisplayName("二叉树的右视图测试用例")
public class LeetCode199Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        List<Integer> resList = new LeetCode199().rightSideView(root);
        List<Integer> expected = List.of(1, 3, 4);
        Assertions.assertIterableEquals(expected, resList);
    }
}
