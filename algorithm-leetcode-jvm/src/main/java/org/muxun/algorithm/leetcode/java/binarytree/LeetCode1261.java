package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 1261
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-elements-in-a-contaminated-binary-tree">在受污染的二叉树中查找元素</a>
 * <p>
 * 详情: 给出一个满足下述规则的二叉树：
 * <p>
 * root.val == 0
 * <p>
 * 如果 treeNode.val == x 且 treeNode.left != null，那么 treeNode.left.val == 2 * x + 1
 * <p>
 * 如果 treeNode.val == x 且 treeNode.right != null，那么 treeNode.right.val == 2 * x + 2
 * <p>
 * 现在这个二叉树受到「污染」，所有的 treeNode.val 都变成了 -1。
 * <p>
 * 请你先还原二叉树，然后实现 FindElements 类：
 * <p>
 * FindElements(TreeNode* root) 用受污染的二叉树初始化对象，你需要先把它还原。
 * <p>
 * bool find(int target) 判断目标值 target 是否存在于还原后的二叉树中并返回结果。
 * @author 慕勋
 * @created 2024-03-12
 */
public class LeetCode1261 {

    private final List<Integer> list;

    public LeetCode1261(TreeNode root) {
        this.list = new ArrayList<>();
        list.add(0);
        root.val = 0;
        dfs(root);
    }

    public boolean find(int target) {
        return list.contains(target);
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            int leftValue = 2 * root.val + 1;
            root.left.val = leftValue;
            list.add(leftValue);
            dfs(root.left);
        }
        if (root.right != null) {
            int rightValue = 2 * root.val + 2;
            root.right.val = rightValue;
            list.add(rightValue);
            dfs(root.right);
        }
    }
}
