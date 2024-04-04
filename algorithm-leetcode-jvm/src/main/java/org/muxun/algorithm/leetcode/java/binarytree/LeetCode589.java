package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.*;

/**
 * 题号: 589
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/n-ary-tree-preorder-traversal">N叉树的前序遍历</a>
 * <p>
 * 详情: 给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。
 * <p>
 * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 * @author 慕勋
 * @created 2024/2/18
 */
public class LeetCode589 {

    /**
     * 思路: 前序遍历是中左右
     * @param root 根节点
     * @return 前序遍历
     */
    public List<Integer> preorder(Node429 root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        Map<Node429, Integer> map = new HashMap<>();
        LinkedList<Node429> stack = new LinkedList<>();
        Node429 node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                resList.add(node.val);
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
                stack.pop();
                map.remove(node);
                node = null;
            }
        }
        return resList;
    }
}
