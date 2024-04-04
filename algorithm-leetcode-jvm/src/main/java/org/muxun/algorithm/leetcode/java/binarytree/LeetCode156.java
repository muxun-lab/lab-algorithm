package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号: 156
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-upside-down">上下翻转二叉树</a>
 * <p>
 * 详情: 给你一个二叉树的根节点 root ，请你将此二叉树上下翻转，并返回新的根节点。
 * <p>
 * 你可以按下面的步骤翻转一棵二叉树：
 * 1. 原来的左子节点变成新的根节点
 * 2. 原来的根节点变成新的右子节点
 * 3. 原来的右子节点变成新的左子节点
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode156 {

    /**
     * 思路:
     * @param root 根节点
     * @return 反转后的二叉树
     */
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        TreeNode newRoot = stack.pop();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode prevLeft = node.left;
            TreeNode prevRight = node.right;
            prevLeft.left = prevRight;
            prevLeft.right = node;
            if (prevRight != null) {
                prevRight.left = null;
                prevRight.right = null;
            }
            node.left = null;
            node.right = null;
        }
        return newRoot;
    }
}
