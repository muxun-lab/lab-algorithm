package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号: 2641
 * 题目: 二叉树的堂兄弟节点II
 * 链接: <a href="https://leetcode.cn/problems/cousins-in-binary-tree-ii">二叉树的堂兄弟节点II</a>
 * 详情: 给你一棵二叉树的根 root ，请你将每个节点的值替换成该节点的所有 堂兄弟节点值的和 。
 * 如果两个节点在树中有相同的深度且它们的父节点不同，那么它们互为 堂兄弟 。
 * 请你返回修改值之后，树的根 root 。
 * 注意，一个节点的深度指的是从树根节点到这个节点经过的边数。
 * @author 慕勋
 * @created 2024/2/7
 */
public class LeetCode2641 {

    /**
     * 思路: 广度优先遍历
     * @param root 根节点
     * @return 堂兄弟树
     */
    public TreeNode replaceValueInTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> temp = new LinkedList<>();
            int s = 0;
            // 添加子节点到队列中
            for (TreeNode cur : queue) {
                if (cur.left != null) {
                    temp.add(cur.left);
                    s += cur.left.val;
                }
                if (cur.right != null) {
                    temp.add(cur.right);
                    s += cur.right.val;
                }
            }
            // 计算和
            for (TreeNode cur : queue) {
                int left = cur.left == null ? 0 : cur.left.val;
                int right = cur.right == null ? 0 : cur.right.val;
                int sub = left + right;
                if (cur.left != null) {
                    cur.left.val = s - sub;
                }
                if (cur.right != null) {
                    cur.right.val = s - sub;
                }
            }
            queue = temp;
        }
        return root;
    }
}
