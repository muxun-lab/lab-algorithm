package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 107
 * 题目: 二叉树的层序遍历 II
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-level-order-traversal-ii">二叉树的层序遍历 II</a>
 * 详情: 给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。
 * （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * @author 慕勋
 * @created 2024/2/15
 */
public class LeetCode107 {

    /**
     * 思路: 广度优先遍历，然后调整顺序
     * @param root 根节点
     * @return 层序遍历结果集
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<TreeNode> temp = new ArrayList<>();
            List<Integer> levelList = new ArrayList<>();
            for (TreeNode cur : queue) {
                if (cur.left != null) {
                    temp.add(cur.left);
                }
                if (cur.right != null) {
                    temp.add(cur.right);
                }
                levelList.add(cur.val);
            }
            queue = temp;
            resList.add(levelList);
        }
        Collections.reverse(resList);
        return resList;
    }
}
