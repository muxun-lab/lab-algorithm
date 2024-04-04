package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号: 889
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal">根据前序和后序遍历构造二叉树</a>
 * <p>
 * 详情: 给定两个整数数组，preorder 和 postorder ，其中 preorder 是一个具有 无重复 值的二叉树的前序遍历，postorder 是同一棵树的后序遍历，重构并返回二叉树。
 * <p>
 * 如果存在多个答案，您可以返回其中 任何 一个。
 * @author 慕勋
 * @created 2024/2/22
 */
public class LeetCode889 {

    Map<Integer, Integer> indexMap = new HashMap<>();

    /**
     * 思路: 前序遍历是中左右
     * 后续遍历是左右中
     * 还是以前序遍历的第一个节点为根节点，然后第二个节点为左节点
     * 在后序遍历中寻找左节点，然后接下来是右节点，然后是根节点
     * @param preorder  前序遍历
     * @param postorder 后续遍历
     * @return 二叉树
     */
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            indexMap.put(postorder[i], i);
        }
        return buildTree(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] postorder, int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }
        int rootVal = preorder[preStart];
        int leftVal = preorder[preStart + 1];
        int index = indexMap.get(leftVal);
        // 左子树元素个数
        int leftSize = index - postStart + 1;
        // 递归构造左子树
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preorder, postorder, preStart + 1, preStart + leftSize, postStart, index);
        root.right = buildTree(preorder, postorder, preStart + leftSize + 1, preEnd, index + 1, postEnd - 1);
        return root;
    }
}
