package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号：111
 * 题目：二叉树的最小深度深度
 * 详情：给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 */
public class LeetCode111 {

    /**
     * 思路：深度优先遍历
     * @param root 根节点
     * @return 二叉树的最小深度
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int height = Integer.MAX_VALUE;
        if (root.left != null) {
            height = Math.min(minDepth(root.left), height);
        }
        if (root.right != null) {
            height = Math.min(minDepth(root.right), height);
        }
        return height + 1;
    }

    /**
     * 思路：深度优先遍历
     * 最先到叶子节点的一定是高度最矮的子树
     * @param root 根节点
     * @return 二叉树的最小深度
     */
    public int minDepthWithBFS(TreeNode root) {
        LinkedList<QueueNode> queue = new LinkedList<>();
        queue.offer(new QueueNode(root, 1));
        while (!queue.isEmpty()) {
            QueueNode queueNode = queue.pop();
            TreeNode node = queueNode.node;
            int depth = queueNode.depth;
            if (node.left == null && node.right == null) {
                return depth;
            }
            if (node.left != null) {
                queue.offer(new QueueNode(node.left, depth + 1));
            }
            if (node.right != null) {
                queue.offer(new QueueNode(node.right, depth + 1));
            }
        }
        return 0;
    }


    class QueueNode {
        TreeNode node;
        int depth;

        public QueueNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
