package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 987
 * 题目: 二叉树的垂序遍历
 * 链接: <a href="https://leetcode.cn/problems/vertical-order-traversal-of-a-binary-tree">二叉树的垂序遍历</a>
 * 详情: 给你二叉树的根结点 root ，请你设计算法计算二叉树的 垂序遍历 序列。
 * 对位于 (row, col) 的每个结点而言，其左右子结点分别位于 (row + 1, col - 1) 和 (row + 1, col + 1) 。树的根结点位于 (0, 0) 。
 * 二叉树的 垂序遍历 从最左边的列开始直到最右边的列结束，按列索引每一列上的所有结点，形成一个按出现位置从上到下排序的有序列表。
 * 如果同行同列上有多个结点，则按结点的值从小到大进行排序。
 * 返回二叉树的 垂序遍历 序列。
 * @author 慕勋
 * @created 2024/2/13
 */
public class LeetCode987 {

    /**
     * 思路: 深度优先遍历，记录节点的坐标值，然后根据坐标值进行一次排序
     * @param root 根节点
     * @return 二叉树的垂序遍历
     */
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<>();
        List<List<Integer>> resList = new ArrayList<>();
        dfs(root, 0, 0, nodes);
        nodes.sort((o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            } else if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[2] - o2[2];
            }
        });
        int size = 0;
        int lastCol = Integer.MIN_VALUE;
        for (int[] node : nodes) {
            int col = node[1];
            int value = node[2];
            if (col != lastCol) {
                lastCol = col;
                resList.add(new ArrayList<>());
                size++;
            }
            resList.get(size - 1).add(value);
        }
        return resList;
    }

    private void dfs(TreeNode node, int row, int col, List<int[]> nodes) {
        if (node == null) {
            return;
        }
        nodes.add(new int[]{row, col, node.val});
        dfs(node.left, row + 1, col - 1, nodes);
        dfs(node.right, row + 1, col + 1, nodes);
    }
}
