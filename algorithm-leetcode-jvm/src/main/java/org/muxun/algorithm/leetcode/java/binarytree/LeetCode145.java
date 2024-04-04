package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号: 145
 * 题目: 二叉树的后序遍历
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal">二叉树的后序遍历</a>
 * 详情: 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 * @author 慕勋
 * @created 2024/2/12
 */
public class LeetCode145 {

    private List<Integer> resList;

    /**
     * 思路: 递归
     * 后序遍历的顺序为左 => 右 => 中
     * @param root 根节点
     * @return 二叉树的后序遍历
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        this.resList = new ArrayList<>();
        dfs(root);
        return resList;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);
        resList.add(node.val);
    }

    /**
     * 思路: 迭代
     * @param root 根节点
     * @return 二叉树的后序遍历
     */
    public List<Integer> postorderTraversalByIterate(TreeNode root) {
        ArrayList<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode pre = null;
        while (!queue.isEmpty() || root != null) {
            while (root != null) {
                // 先遍历左节点
                queue.push(root);
                root = root.left;
            }
            root = queue.pop();
            // 没有节点，证明已经到达叶子节点，加入到遍历结果中
            if (root.right == null || root.right == pre) {
                resList.add(root.val);
                pre = root;
                root = null;
            } else {
                // 有右子节点，继续遍历右节点
                queue.push(root);
                root = root.right;
            }
        }
        return resList;
    }
}
