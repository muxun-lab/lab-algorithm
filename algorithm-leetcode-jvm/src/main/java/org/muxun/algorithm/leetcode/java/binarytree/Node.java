package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * @author 慕勋
 * @created 2024/2/15
 */
public class Node {

    public int val;
    public Node left;
    public Node right;

    public Node() {

    }

    public Node(int left) {
        val = left;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
