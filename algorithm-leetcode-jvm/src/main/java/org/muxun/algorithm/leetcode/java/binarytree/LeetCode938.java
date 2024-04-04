package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 938
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/range-sum-of-bst">二叉搜索树的范围和</a>
 * <p>
 * 详情: 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 * @author 慕勋
 * @created 2024/2/26
 */
public class LeetCode938 {

    /**
     * 思路: 深度优先遍历，注意树是二叉搜索树
     * @param root 二叉搜索树
     * @param low  区间
     * @param high 区间
     * @return 区间节点之和
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
