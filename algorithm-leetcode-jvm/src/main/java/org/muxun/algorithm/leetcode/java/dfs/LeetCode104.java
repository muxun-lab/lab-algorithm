package org.muxun.algorithm.leetcode.java.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：104
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree">二叉树的最大深度</a>
 * <p>
 * 详情：给定一个二叉树，找出其最大深度
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数
 * <p>
 * 说明：叶子节点是指没有子节点的节点
 * @author 慕勋
 * @created 2020-03-10
 */
public class LeetCode104 {

    /**
     * 思路：广度优先遍历
     * @param root 给定二叉树的根节点
     * @return 二叉树的深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        List<TreeNode> currentLineNodeList = new ArrayList<>();
        currentLineNodeList.add(root);
        while (currentLineNodeList.size() > 0) {
            depth++;
            currentLineNodeList = nextLineNodeNode(currentLineNodeList);
        }
        return depth;
    }

    private List<TreeNode> nextLineNodeNode(List<TreeNode> currentLineNodeList) {
        if (currentLineNodeList.size() == 0) {
            return new ArrayList<>();
        }
        List<TreeNode> nextLineNodeList = new ArrayList<>();
        for (TreeNode treeNode : currentLineNodeList) {
            if (treeNode.left != null) {
                nextLineNodeList.add(treeNode.left);
            }
            if (treeNode.right != null) {
                nextLineNodeList.add(treeNode.right);
            }
        }
        return nextLineNodeList;
    }

    /**
     * 思路：递归
     * @param root 给定二叉树的根节点
     * @return 二叉树的深度
     */
    public int maxDepthRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepthRecursion(root.left);
        int rightMaxDepth = maxDepthRecursion(root.right);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
