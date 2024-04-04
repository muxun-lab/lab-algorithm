package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.List;

/**
 * 题号: 429
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/n-ary-tree-level-order-traversalN">叉树的层序遍历</a>
 * <p>
 * 详情: 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
 * @author 慕勋
 * @created 2024/2/17
 */
public class Node429 {

    public int val;
    public List<Node429> children;

    public Node429() {
    }

    public Node429(int val) {
        this.val = val;
    }

    public Node429(int val, List<Node429> children) {
        this.val = val;
        this.children = children;
    }
}
