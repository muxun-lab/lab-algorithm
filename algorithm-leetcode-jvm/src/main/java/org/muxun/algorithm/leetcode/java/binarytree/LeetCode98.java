package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 98
 * 题目: 验证二叉搜索树
 * 链接: <a href="https://leetcode.cn/problems/validate-binary-search-tree">验证二叉搜索树</a>
 * 详情: 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * 有效 二叉搜索树定义如下：
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * @author 慕勋
 * @created 2024/2/2
 */
public class LeetCode98 {

    private long pre = Long.MIN_VALUE;

    /**
     * 思路: 中序遍历
     * 使用中序遍历判断值是否是单调递增的
     * @param root 二叉树根节点
     * @return 是否是二叉搜索树
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 访问左子树
        if (!isValidBST(root.left)) {
            return false;
        }
        // 访问当前节点
        // 如果当前节点小于等于中序遍历的前一个节点，说明不是二叉搜索树
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // 访问右子树
        return isValidBST(root.right);
    }
}
