package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号：993
 * 题目：二叉树的堂兄弟节点
 * 题链：<a href="https://leetcode-cn.com/problems/trapping-rain-water/">二叉树的堂兄弟节点</a>
 * 详情：在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * 如果二叉树的两个节点深度相同，但 父节点不同 ，则它们是一对堂兄弟节点。
 * 我们给出了具有唯一值的二叉树的根节点 root ，以及树中两个不同节点的值 x 和 y 。
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true 。否则，返回 false。
 * @author 慕勋
 * @date 2024/2/8
 */
public class LeetCode993 {

    private int x;
    private TreeNode xParent;
    private int xDepth;
    private boolean xFound;
    private int y;
    private TreeNode yParent;
    private int yDepth;
    private boolean yFound;

    /**
     * 思路: 深度优先搜索
     * @param root 根节点
     * @param x    节点x
     * @param y    节点y
     * @return 是否是父子节点
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(null, root, 0);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode parent, TreeNode cur, int depth) {
        if (cur == null) {
            return;
        }
        if (cur.val == x) {
            xDepth = depth;
            xParent = parent;
            xFound = true;
        } else if (cur.val == y) {
            yParent = parent;
            yDepth = depth;
            yFound = true;
        }
        if (xFound && yFound) {
            return;
        }
        dfs(cur, cur.left, depth + 1);
        if (xFound && yFound) {
            return;
        }
        dfs(cur, cur.right, depth + 1);
    }

    /**
     * 思路: 深度优先遍历
     * @param root 根节点
     * @param x    节点x
     * @param y    节点y
     * @return 是否是父子节点
     */
    public boolean isCousinsByBFS(TreeNode root, int x, int y) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                // 左子节点 = 右子节点，肯定不是堂兄弟节点
                if (check(node.left, x, y) && check(node.right, x, y)) {
                    return false;
                }
                // 节点的左子节点为x或y，且下一层出现了x或y，则为堂兄弟节点，返回true
                if (check(node.left, x, y)) {
                    if (flag) {
                        return true;
                    }
                    flag = true;
                } else if (check(node.right, x, y)) {
                    // 节点的右子节点为x或y，且下一层出现了x或y，则为堂兄弟节点，返回true
                    if (flag) {
                        return true;
                    }
                    flag = true;
                } else {
                    // 这个节点的左右子节点都不包括x或y，先加入队列作为下一层的搜索
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            if (flag) {
                return false;
            }
        }
        return false;
    }

    /**
     * 检查当前节点的值是否为x或y
     * @param node 当前节点
     * @param x    x
     * @param y    y
     * @return 是否为x或y
     */
    private boolean check(TreeNode node, int x, int y) {
        return node != null && (node.val == x || node.val == y);
    }
}