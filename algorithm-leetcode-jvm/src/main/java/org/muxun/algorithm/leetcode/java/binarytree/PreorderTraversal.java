package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号：144
 * 题目：二叉树的前序遍历
 * 详情：给定一个二叉树，返回它的「前序」遍历
 * @author 慕勋
 * @created 2020-03-18
 */
public class PreorderTraversal {

    /**
     * 思路：递归
     * @param root 给定二叉树的根节点
     * @return 二叉树的前序遍历
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        return recursion(root);
    }

    public List<Integer> recursion(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> resultList = new ArrayList<>();
        resultList.add(root.val);
        resultList.addAll(recursion(root.left));
        resultList.addAll(recursion(root.right));
        return resultList;
    }

    /**
     * 思路：迭代
     * @param root 给定二叉树的根节点
     * @return 二叉树的前序遍历
     */
    public List<Integer> preorderTraversalIterator(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> resultList = new ArrayList<>();
        LinkedList<TreeNode> leftStack = new LinkedList<>();
        LinkedList<TreeNode> centerStack = new LinkedList<>();
        LinkedList<TreeNode> rightStack = new LinkedList<>();
        centerStack.push(root);
        leftStack.push(root.left);
        rightStack.push(root.right);
        do {
            TreeNode centerNode = null;
            if (!centerStack.isEmpty()) {
                centerNode = centerStack.pop();
            }
            if (centerNode != null) {
                resultList.add(centerNode.val);
            }
            TreeNode leftNode = null;
            if (!leftStack.isEmpty()) {
                leftNode = leftStack.pop();
            }
            if (hasLeaf(leftNode)) {
                centerStack.push(leftNode);
                leftStack.push(leftNode.left);
                rightStack.push(leftNode.right);
                continue;
            } else if (leftNode != null) {
                resultList.add(leftNode.val);
            }
            TreeNode rightNode = null;
            if (!rightStack.isEmpty()) {
                rightNode = rightStack.pop();
            }
            if (hasLeaf(rightNode)) {
                centerStack.push(rightNode);
                leftStack.push(rightNode.left);
                rightStack.push(rightNode.right);
            } else if (rightNode != null) {
                resultList.add(rightNode.val);
            }
        } while (!centerStack.isEmpty() || !leftStack.isEmpty() || !rightStack.isEmpty());
        return resultList;
    }

    private boolean hasLeaf(TreeNode currentNode) {
        if (currentNode == null) {
            return false;
        }
        return currentNode.left != null || currentNode.right != null;
    }
}
