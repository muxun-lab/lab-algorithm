package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号: 94
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal">二叉树的中序遍历</a>
 * <p>
 * 详情: 给定一个二叉树，返回它的 中序 遍历。
 * @author 慕勋
 * @created 2020-03-13
 */
public class LeetCode94 {

    private final List<Integer> resultList = new ArrayList<>();

    /**
     * 思路：迭代
     * @param root 二叉树根节点
     * @return 二叉树的中序遍历
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return resultList;
        }
        LinkedList<TreeNode> leftStack = new LinkedList<>();
        LinkedList<TreeNode> rightStack = new LinkedList<>();
        LinkedList<TreeNode> centerStack = new LinkedList<>();
        if (root.left != null) {
            leftStack.push(root.left);
        }
        if (root.right != null) {
            rightStack.push(root.right);
        }
        centerStack.push(root);
        do {
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
            if (!centerStack.isEmpty()) {
                TreeNode centerNode = centerStack.pop();
                resultList.add(centerNode.val);
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
        } while (!leftStack.isEmpty() || !centerStack.isEmpty() || !rightStack.isEmpty());
        return resultList;
    }

    private boolean hasLeaf(TreeNode currentNode) {
        if (currentNode == null) {
            return false;
        }
        return currentNode.left != null || currentNode.right != null;
    }

    /**
     * 思路：迭代升级
     * @param root 二叉树根节点
     * @return 二叉树的中序遍历
     */
    public List<Integer> inorderTraversalIteratorUpgrade(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            resultList.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return resultList;
    }

    /**
     * 思路：递归
     * @param root 二叉树根节点
     * @return 二叉树的中序遍历
     */
    public List<Integer> inorderTraversalRecursion(TreeNode root) {
        if (root == null) {
            return resultList;
        }
        recursion(root);
        return resultList;
    }

    private void recursion(TreeNode currentNode) {
        if (currentNode == null) {
            return;
        }
        recursion(currentNode.left);
        resultList.add(currentNode.val);
        recursion(currentNode.right);
    }

    /**
     * 思路：莫里斯遍历
     * @param root 二叉树根节点
     * @return 二叉树的中序遍历
     */
    public List<Integer> inorderTraversalMorris(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        TreeNode current = root;
        TreeNode previous;
        while (current != null) {
            if (current.left == null) {
                resultList.add(current.val);
                current = current.right;
            } else {
                previous = current.left;
                while (previous.right != null && previous.right != current) {
                    previous = previous.right;
                }
                if (previous.right == null) {
                    previous.right = current;
                    current = current.left;
                } else {
                    previous.right = null;
                    resultList.add(current.val);
                    current = current.right;
                }
            }
        }
        return resultList;
    }
}
