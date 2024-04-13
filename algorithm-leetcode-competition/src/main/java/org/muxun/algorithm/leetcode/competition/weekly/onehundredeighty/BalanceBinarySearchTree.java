package org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：5179
 * 题目：将二叉搜索树变平衡
 * 详情：给你一棵二叉搜索树，请你返回一棵平衡后的二叉搜索树
 * 新生成的树应该与原来的树有着相同的节点值
 * 如果一棵二叉搜索树中，每个节点的两棵子树高度差不超过 1 ，我们就称这棵二叉搜索树是平衡的
 * 如果有多种构造方法，请你返回任意一种
 * @author sunshine
 * @created 2020-03-15
 */
public class BalanceBinarySearchTree {

    /**
     * 思路：递归
     * 中序遍历后使用而发重建树，每个中间件即为树的节点
     * @param root 二叉搜索树的根节点
     * @return 平衡二叉搜索树
     */
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodeValueList = new ArrayList<>();
        balance(root, nodeValueList);
        return rebuild(nodeValueList, 0, nodeValueList.size() - 1);
    }

    private void balance(TreeNode currentNode, List<Integer> nodeValueList) {
        if (currentNode == null) {
            return;
        }
        balance(currentNode.left, nodeValueList);
        nodeValueList.add(currentNode.val);
        balance(currentNode.right, nodeValueList);
    }

    private TreeNode rebuild(List<Integer> nodeValueList, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nodeValueList.get(start));
        }
        int middleIndex = start + (end - start) / 2;
        TreeNode rootNode = new TreeNode(nodeValueList.get(middleIndex));
        rootNode.left = rebuild(nodeValueList, start, middleIndex - 1);
        rootNode.right = rebuild(nodeValueList, middleIndex + 1, end);
        return rootNode;
    }
}
