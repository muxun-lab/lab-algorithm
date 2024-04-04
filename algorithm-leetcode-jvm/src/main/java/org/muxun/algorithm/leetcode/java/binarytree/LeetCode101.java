package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号：101
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/symmetric-tree">对称二叉树</a>
 * <p>
 * 详情：给定一个二叉树，检查它是否是镜像对称的
 * @author 慕勋
 * @created 2020-03-10
 */
public class LeetCode101 {

    /**
     * 思路：递归
     * @param root 二叉树根节点
     * @return 给定的二叉树是否是对称的
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSameTreeNode(root, root);
    }

    /**
     * 递归，判断给定左节点的左节点和给定右节点的右节点，给定左节点的右节点和给定右节点的左节点是否相同
     * @param left  左节点
     * @param right 右节点
     * @return 给定左节点的左节点和给定右节点的右节点，给定左节点的右节点和给定右节点的左节点是否相同
     */
    private boolean isSameTreeNode(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSameTreeNode(left.left, right.right) && isSameTreeNode(left.right, right.left);
    }

    /**
     * 思路：迭代
     * 向一个栈中添加元素
     * @param root 二叉树根节点
     * @return 给定的二叉树是否是对称的
     */
    public boolean isSymmetricIterator(TreeNode root) {
        if (root == null) {
            return true;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
}
