package org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix;

import org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty.TreeNode;

import java.util.LinkedList;

/**
 * 题号：1448
 * 题目：统计二叉树中好节点的数目
 * 题链：https://leetcode-cn.com/problems/count-good-nodes-in-binary-tree/
 * 详情：给你一棵根为 root 的二叉树，请你返回二叉树中好节点的数目
 * 「好节点」X 定义为：从根到该节点 X 所经过的节点中，没有任何节点的值大于 X 的值
 * @author sunshine
 * @created 2020-05-16
 */
public class CountGoodNodesInBinaryTree {

    private int num;

    private final LinkedList<Integer> backtrack = new LinkedList<>();

    /**
     * 思路：DFS+回溯
     * @param root 给定的二叉树
     * @return 好节点数量
     */
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return num;
        }
        dfs(root);
        return num;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        backtrack.add(root.val);
        if (isMax(root.val)) {
            this.num++;
        }
        dfs(root.left);
        dfs(root.right);
        backtrack.removeLast();
    }

    public boolean isMax(int value) {
        for (int i = 0; i < backtrack.size(); i++) {
            if (value < backtrack.get(i)) {
                return false;
            }
        }
        return true;
    }
}
