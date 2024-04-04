package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 543
 * 题目: 二叉树的直径
 * 链接: <a href="https://leetcode.cn/problems/diameter-of-binary-tree">二叉树的直径</a>
 * 详情: 给你一棵二叉树的根节点，返回该树的 直径 。
 * 二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
 * 两节点之间路径的 长度 由它们之间边数表示。
 * @author 慕勋
 * @created 2024/2/5
 */
public class LeetCode543 {

    private int max = 0;

    /**
     * 思路: 深度优先遍历
     * 路径可以看做是从每个根节点的左子树深度路径和右子树深度路径拼接而来的
     * 如果左子树深度路径是L，右子树深度路径是R，那么总长度是L+R+1，深度从0开始，即树的高度是3，深度为2
     * @param root 二叉树根节点
     * @return 最大直径
     */
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        // 分别遍历左子树和右子树，分别找到最长路径
        int right = dfs(root.right);
        // 将每个节点的左子树深度和右子树深度之和进行比较
        max = Math.max(left + right, max);
        // 返回该节点为根的情况下，路径的长度
        return Math.max(left, right) + 1;
    }
}
