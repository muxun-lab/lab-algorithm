package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号: 230
 * 题目: 二叉搜索树中第K小的元素
 * 链接: <a href="https://leetcode.cn/problems/kth-smallest-element-in-a-bst">二叉搜索树中第K小的元素</a>
 * 详情: 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 * @author 慕勋
 * @created 2024/2/2
 */
public class LeetCode230 {

    /**
     * 思路:
     * @param root 根节点
     * @param k    第K个最小元素
     * @return 元素
     */
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }
}
