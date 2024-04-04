package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/2/15
 */
@DisplayName("将二叉搜索树转化为排序的双向链表测试用例")
public class LeetCode426Test {

    @Test
    public void testOne() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(5);
    }
}
