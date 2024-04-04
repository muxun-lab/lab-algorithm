package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 129
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/sum-root-to-leaf-numbers">求根节点到叶节点数字之和</a>
 * <p>
 * 详情: 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * <p>
 * 每条从根节点到叶节点的路径都代表一个数字：
 * <p>
 * * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * <p>
 * 计算从根节点到叶节点生成的 所有数字之和 。
 * <p>
 * 叶节点 是指没有子节点的节点。
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode129 {

    /**
     * 思路: 深度优先遍历
     * @param root 根节点
     * @return 数字之和
     */
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int prev) {
        if (root == null) {
            return 0;
        }
        int sum = prev * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
