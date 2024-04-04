package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 124
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-maximum-path-sum">二叉树中的最大路径和</a>
 * <p>
 * 详情: 二叉树中的 路径 被定义为一条节点序列，序列中每对相邻节点之间都存在一条边。
 * <p>
 * 同一个节点在一条路径序列中 至多出现一次 。
 * <p>
 * 该路径 至少包含一个 节点，且不一定经过根节点。
 * <p>
 * 路径和 是路径中各节点值的总和。
 * <p>
 * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
 * @author 慕勋
 * @created 2024/2/23
 */
public class LeetCode124 {

    private int max;

    /**
     * 思路: 深度优先遍历
     * 计算当前路径是不是最大的，然后返回一条最大的路径边，以便于和根节点连上形成一条链路
     * @param root 根节点
     * @return 最大路径和
     */
    public int maxPathSum(TreeNode root) {
        this.max = Integer.MIN_VALUE;
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(dfs(node.left), 0);
        int right = Math.max(dfs(node.right), 0);
        int current = left + node.val + right;
        max = Math.max(max, current);
        return node.val + Math.max(left, right);
    }
}
