package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 222
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/count-complete-tree-nodes">完全二叉树的节点个数</a>
 * <p>
 * 详情: 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 * 完全二叉树 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。
 * 若最底层为第 h 层，则该层包含 1~ 2h 个节点。
 * @author 慕勋
 * @created 2024-03-09
 */
public class LeetCode222 {

    /**
     * 思路: 递归计算
     * 根据完全二叉树的特性计算
     * @param root 根节点
     * @return 结点个数
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if (left == right) {
            // 证明左子树一定是满二叉树，那么一定是2^left + 右子树的个数
            return countNodes(root.right) + (1 << left);
        } else {
            // 证明最后一层不满，但是右子树的倒数第二层是满的
            // 所以可以直接得到右子树+根节点的个数
            // 然后递归计算左子树节点的个数即可
            return countNodes(root.left) + (1 << right);
        }
    }

    private int countLevel(TreeNode root) {
        int level = 0;
        while (root != null) {
            level++;
            root = root.left;
        }
        return level;
    }
}
