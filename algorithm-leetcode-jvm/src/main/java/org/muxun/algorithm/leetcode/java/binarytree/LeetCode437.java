package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 437
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/path-sum-iii">路径总和III</a>
 * <p>
 * 详情: 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 * <p>
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * @author 慕勋
 * @created 2024/2/23
 */
public class LeetCode437 {

    /**
     * 思路: 从根节点开始，分别以每个节点作为根节点开始遍历
     * 时间复杂度O(n*n)
     * @param root      根节点
     * @param targetSum 总和
     * @return 路径总和
     */
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, targetSum);
    }

    private int dfs(TreeNode node, int targetSum) {
        if (node == null) {
            return 0;
        }
        int ans = dfs(node, targetSum);
        ans += dfs(node.left, targetSum);
        ans += dfs(node.right, targetSum);
        return ans;
    }

    private int dfs2(TreeNode node, int targetSum) {
        if (node == null) {
            return 0;
        }
        int ans = 0;
        int val = node.val;
        if (val == targetSum) {
            ans++;
        }
        ans += dfs2(node.left, targetSum - val);
        ans += dfs2(node.right, targetSum - val);
        return ans;
    }
}
