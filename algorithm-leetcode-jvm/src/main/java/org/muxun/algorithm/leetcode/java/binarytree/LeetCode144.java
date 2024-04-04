package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号: 144
 * 题目: 二叉树的前序遍历
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-preorder-traversal">二叉树的前序遍历</a>
 * 详情: 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * @author 慕勋
 * @created 2024/2/11
 */
public class LeetCode144 {

    private List<Integer> resList;

    /**
     * 思路: 前序遍历是中左右，所以可以使用递归的方式进行遍历
     * @param root 根节点
     * @return 二叉树的前序遍历
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        resList = new ArrayList<>();
        dfs(root);
        return resList;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        resList.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

    /**
     * 思路: 使用迭代的方式遍历一次
     * @param root 根节点
     * @return 二叉树的前序遍历
     */
    public List<Integer> preorderTraversalByIterate(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        while (!queue.isEmpty() || node != null) {
            if (node == null) {
                queue.pop();
                continue;
            }
            while (node != null) {
                resList.add(node.val);
                if (node.right != null) {
                    queue.add(node.right);
                }
                node = node.left;
            }
        }
        return resList;
    }
}
