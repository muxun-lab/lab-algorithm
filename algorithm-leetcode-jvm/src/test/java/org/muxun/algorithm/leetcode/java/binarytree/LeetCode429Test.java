package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/17
 */
@DisplayName("N叉树的层序遍历")
public class LeetCode429Test {

    @Test
    public void testOne() {
        Node429 root = new Node429(1);
        Node429 left = new Node429(3);
        Node429 middle = new Node429(2);
        Node429 right = new Node429(4);
        Node429 leftChildLeft = new Node429(5);
        Node429 leftChildRight = new Node429(6);
        left.children = List.of(leftChildLeft, leftChildRight);
        root.children = List.of(left, middle, right);
        List<List<Integer>> expected = List.of(List.of(1), List.of(3, 2, 4), List.of(5, 6));
        List<List<Integer>> res = new LeetCode429().levelOrder(root);
        Assertions.assertIterableEquals(expected, res);
    }
}
