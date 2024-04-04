package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号：110
 * 题目：平衡二叉树
 * 详情：给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class LeetCode110 {

    /**
     * 思路：
     * @param root 根节点
     * @return 是否是平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        if (left == -1) {
            return -1;
        }
        int right = dfs(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
