package org.muxun.algorithm.leetcode.java.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号：100
 * 题目：相同的树
 * 详情：给定两个二叉树，编写一个函数来检验它们是否相同
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
 * @author 慕勋
 * @created 2020-03-09
 */
public class SameTree {

    /**
     * 思路：栈，存储遍历过的节点
     * @param p 第一个二叉树
     * @param q 第二个二叉树
     * @return 两颗二叉树是否完全相同
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (q == null) {
            return false;
        }
        LinkedList<TreeNode> pStack = new LinkedList<>();
        LinkedList<TreeNode> qStack = new LinkedList<>();
        ArrayList<Integer> pChildrenList = new ArrayList<>();
        ArrayList<Integer> qChildrenList = new ArrayList<>();
        ArrayList<Integer> pList = new ArrayList<>();
        ArrayList<Integer> qList = new ArrayList<>();
        pStack.add(p);
        pList.add(p.val);
        while (!pStack.isEmpty()) {
            TreeNode stackTopNode = pStack.removeLast();
            List<TreeNode> childrenNodeList = getChildren(stackTopNode, pList, pChildrenList);
            pStack.addAll(childrenNodeList);
        }
        qStack.add(q);
        qList.add(q.val);
        while (!qStack.isEmpty()) {
            TreeNode stackTopNode = qStack.removeLast();
            List<TreeNode> childrenNodeList = getChildren(stackTopNode, qList, qChildrenList);
            qStack.addAll(childrenNodeList);
        }
        if (pChildrenList.size() != qChildrenList.size()) {
            return false;
        }

        for (int i = 0; i < pChildrenList.size(); i++) {
            if (!pChildrenList.get(i).equals(qChildrenList.get(i))) {
                return false;
            }
        }

        if (pList.size() != qList.size()) {
            return false;
        }

        for (int i = 0; i < pList.size(); i++) {
            if (!pList.get(i).equals(qList.get(i))) {
                return false;
            }
        }
        return true;
    }

    private List<TreeNode> getChildren(TreeNode currentNode, List<Integer> valueList, List<Integer> childrenList) {
        List<TreeNode> childrenNodeList = new ArrayList<>();
        if (currentNode.left != null) {
            childrenNodeList.add(currentNode.left);
            valueList.add(currentNode.left.val);
            childrenList.add(0);
        } else {
            childrenList.add(-1);
            valueList.add(Integer.MIN_VALUE);
        }
        if (currentNode.right != null) {
            childrenNodeList.add(currentNode.right);
            valueList.add(currentNode.right.val);
            childrenList.add(1);
        } else {
            childrenList.add(-1);
            valueList.add(Integer.MIN_VALUE);
        }
        return childrenNodeList;
    }

    /**
     * 思路：递归
     * @param p 第一个二叉树
     * @param q 第二个二叉树
     * @return 两颗二叉树是否完全相同
     */
    public boolean isSameTreeRecursion(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTreeRecursion(p.left, q.left) && isSameTreeRecursion(p.right, q.right);
    }
}
