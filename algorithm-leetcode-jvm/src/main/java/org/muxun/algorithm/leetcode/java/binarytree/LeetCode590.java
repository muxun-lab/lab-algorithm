package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.*;

/**
 * 题号: 590
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/n-ary-tree-postorder-traversal">N叉树的后序遍历</a>
 * <p>
 * 详情: 给定一个 n 叉树的根节点 root ，返回 其节点值的 后序遍历 。
 * <p>
 * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 * @author 慕勋
 * @created 2024/2/19
 */
public class LeetCode590 {

    /**
     * 思路: 后序遍历是左右中
     * @param root 根节点
     * @return N叉树的后序遍历
     */
    public List<Integer> postorder(Node429 root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        Map<Node429, Integer> map = new HashMap<>();
        LinkedList<Node429> stack = new LinkedList<>();
        Node429 node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                List<Node429> children = node.children;
                if (children != null && !children.isEmpty()) {
                    map.put(node, 0);
                    node = children.get(0);
                } else {
                    node = null;
                }
            }
            node = stack.peek();
            int index = map.getOrDefault(node, -1) + 1;
            List<Node429> children = node.children;
            if (children != null && children.size() > index) {
                map.put(node, index);
                node = children.get(index);
            } else {
                resList.add(node.val);
                stack.pop();
                map.remove(node);
                node = null;
            }
        }
        return resList;
    }
}
