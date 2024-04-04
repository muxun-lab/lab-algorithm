package org.muxun.algorithm.leetcode.java.dfs;

/**
 * 题号：108
 * 题目：将有序数组转换为二叉搜索树
 * 详情：将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1
 * 给定有序数组[-10,-3,0,5,9]
 * 一个可能的答案是[0,-3,9,-10,null,5]
 * 可以表示下面这个高度的平衡二叉搜索树
 * *      0
 * *     / \
 * *   -3   9
 * *   /   /
 * * -10  5
 * @author 慕勋
 * @created 2020-03-10
 */
public class SortedArrayToBST {

    /**
     * 思路：中序遍历，生成树
     * @param nums 给定的需要形成而二叉搜索树的数组
     * @return 生成的二叉搜索树
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length <= 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return inorder(nums, 0, nums.length - 1);
    }

    /**
     * 中序遍历中间节点
     * @param nums  给定的需要形成二叉搜索树的数组
     * @param left  左边叶子节点
     * @param right 右边叶子节点
     * @return 当前子树的根节点
     */
    public TreeNode inorder(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootIndex = (left + right) / 2;
        TreeNode rootNode = new TreeNode(nums[rootIndex]);
        rootNode.left = inorder(nums, left, rootIndex - 1);
        rootNode.right = inorder(nums, rootIndex + 1, right);
        return rootNode;
    }

    /**
     * 中序遍历，选择中间索引右边一点为根节点
     * @param nums  给定的需要形成二叉搜索树的数组
     * @param left  左边叶子节点
     * @param right 右边叶子节点
     * @return 当前子树的根节点
     */
    public TreeNode inOrderRight(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootIndex = (nums.length & 1) == 0 ? nums.length / 2 : (nums.length + 1) / 2;
        TreeNode rootNode = new TreeNode(nums[rootIndex]);
        rootNode.left = inOrderRight(nums, left, rootIndex - 1);
        rootNode.right = inOrderRight(nums, rootIndex + 1, right);
        return rootNode;
    }

    /**
     * 中序遍历，选择中间索引左边一点为根节点
     * @param nums  给定的需要形成二叉搜索树的数组
     * @param left  左边叶子节点
     * @param right 右边叶子节点
     * @return 当前子树的根节点
     */
    public TreeNode inOrderLeft(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootIndex = (nums.length & 1) == 0 ? nums.length / 2 : (nums.length - 1) / 2;
        TreeNode rootNode = new TreeNode(nums[rootIndex]);
        rootNode.left = inOrderLeft(nums, left, rootIndex - 1);
        rootNode.right = inOrderRight(nums, rootIndex + 1, right);
        return rootNode;
    }
}
