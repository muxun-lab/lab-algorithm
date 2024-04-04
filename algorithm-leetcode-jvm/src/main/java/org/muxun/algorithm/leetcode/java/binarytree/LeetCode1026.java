package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号：1026
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/maximum-difference-between-node-and-ancestor">节点与其祖先之间的最大差值</a>
 * <p>
 * 详情：给定二叉树的根节点 root，找出存在于 不同 节点 A 和 B 之间的最大值 V，其中 V = |A.val - B.val|，且 A 是 B 的祖先。
 * <p>
 * （如果 A 的任何子节点之一为 B，或者 A 的任何子节点是 B 的祖先，那么我们认为 A 是 B 的祖先）
 * @author 慕勋
 * @created 2024-04-05
 */
public class LeetCode1026 {

    /**
     * 思路: 深度优先遍历
     * @param root 根节点
     * @return 节点最大差值
     */
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    /**
     * 思路：只需要考虑到最小的祖先节点以及最大的祖先节点即可。
     * 对二叉树进行深度优先遍历，并且记录遍历过程中的最小值和最大值。
     * 假设当前搜索的值是val，那么该子孙节点与它所有的祖先节点的绝对差值最大值为max(|val-min|, |val-max|)
     * 搜索该节点的的左子树和右子树时，对应的min=min(min, val)，max=max(max, val)
     * @param root 根节点
     * @param min  最小绝对差值
     * @param max  最大绝对差值
     * @return 最大绝对差值
     */
    public int dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return 0;
        }
        int diff = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        diff = Math.max(diff, dfs(root.left, min, max));
        diff = Math.max(diff, dfs(root.right, min, max));
        return diff;
    }
}
