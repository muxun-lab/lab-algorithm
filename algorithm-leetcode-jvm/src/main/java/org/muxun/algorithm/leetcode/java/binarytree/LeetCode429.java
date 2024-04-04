package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
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
public class LeetCode429 {

    /**
     * 思路: 广度优先遍历
     * @param root 根节点
     * @return 层序遍历
     */
    public List<List<Integer>> levelOrder(Node429 root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> resList = new ArrayList<>();
        ArrayList<Node429> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            ArrayList<Node429> temp = new ArrayList<>();
            List<Integer> res = new ArrayList<>();
            for (Node429 node : nodes) {
                if (node.children != null && !node.children.isEmpty()) {
                    temp.addAll(node.children);
                }
                res.add(node.val);
            }
            nodes = temp;
            resList.add(res);
        }
        return resList;
    }
}
