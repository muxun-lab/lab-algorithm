package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 108
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree">将有序数组转换为二叉搜索树</a>
 * <p>
 * 详情: 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * <p>
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * @author 慕勋
 * @created 2024/2/23
 */
public class LeetCode108 {

    /**
     * 思路: 二叉搜索的中序遍历就是升序数组
     * 所以以数组中间元素作为二叉搜索树的根节点
     * 数组左面部分构建左子树
     * 数组右面部分构建右子树
     * @param nums 给定数组
     * @return 二叉搜索树
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }
}
