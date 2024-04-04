package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/24
 */
@DisplayName("二叉搜索树最近节点查询测试用例")
public class LeetCode2476Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(15);
        root.right.right.left = new TreeNode(14);
        List<Integer> queries = List.of(2, 5, 16);
        List<List<Integer>> expected = List.of(List.of(2, 2), List.of(4, 6), List.of(15, -1));
        List<List<Integer>> resList = new LeetCode2476().closestNodes(root, queries);
        Assertions.assertIterableEquals(expected, resList);
    }
}
