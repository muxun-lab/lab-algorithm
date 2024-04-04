package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 99
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/recover-binary-search-tree">恢复二叉搜索树</a>
 * <p>
 * 详情: 给你二叉搜索树的根节点 root ，该树中的 恰好 两个节点的值被错误地交换。请在不改变其结构的情况下，恢复这棵树 。
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode99 {

    private List<Integer> inorder;

    /**
     * 思路: 深度优先遍历
     * 核心思想是左子树的值一定比根节点的值小
     * 思路有点问题，应该使用二叉搜索树的
     * @param root 根节点
     */
    public void recoverTree(TreeNode root) {
        this.inorder = new ArrayList<>();
        dfs(root);
        int[] swap = swap();
        recover(root, 2, swap[0], swap[1]);
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        inorder.add(root.val);
        dfs(root.right);
    }

    public int[] swap() {
        int n = inorder.size();
        int left = -1;
        int right = -1;
        for (int i = 0; i < n - 1; i++) {
            if (inorder.get(i + 1) < inorder.get(i)) {
                right = i + 1;
                if (left == -1) {
                    left = i;
                } else {
                    break;
                }
            }
        }
        int x = inorder.get(left);
        int y = inorder.get(right);
        return new int[]{x, y};
    }

    public void recover(TreeNode root, int count, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.val == x || root.val == y) {
            root.val = root.val == x ? y : x;
            if (--count == 0) {
                return;
            }
        }
        recover(root.right, count, x, y);
        recover(root.left, count, x, y);
    }
}
