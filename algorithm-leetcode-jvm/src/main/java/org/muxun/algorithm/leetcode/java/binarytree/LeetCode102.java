package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号: 102
 * 题目: 二叉树的层序遍历
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-level-order-traversal">二叉树的层序遍历</a>
 * 详情: 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 * @author 慕勋
 * @created 2024/2/14
 */
public class LeetCode102 {

    /**
     * 思路: 广度优先遍历
     * @param root 根节点
     * @return 层序遍历
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> temp = new LinkedList<>();
            List<Integer> curList = new ArrayList<>();
            for (TreeNode cur : queue) {
                curList.add(cur.val);
                if (cur.left != null) {
                    temp.add(cur.left);
                }
                if (cur.right != null) {
                    temp.add(cur.right);
                }
            }
            resList.add(curList);
            queue = temp;
        }
        return resList;
    }
}
