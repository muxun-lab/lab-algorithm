package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号: 199
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-right-side-view">二叉树的右视图</a>
 * <p>
 * 详情: 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * @author 慕勋
 * @created 2024/2/23
 */
public class LeetCode199 {

    /**
     * 思路: 广度优先遍历
     * @param root 根节点
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> resList = new ArrayList<>();
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> tempList = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) {
                    tempList.add(node.left);
                }
                if (node.right != null) {
                    tempList.add(node.right);
                }
            }
            resList.add(queue.getLast().val);
            queue = tempList;
        }
        return resList;
    }
}
