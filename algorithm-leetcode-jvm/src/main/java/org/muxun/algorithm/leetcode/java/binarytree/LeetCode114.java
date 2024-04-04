package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 114
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/flatten-binary-tree-to-linked-list">二叉树展开为链表</a>
 * <p>
 * 详情: 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * <p>
 * * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * <p>
 * * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 * @author 慕勋
 * @created 2024/2/23
 */
public class LeetCode114 {

    /**
     * 思路: 将左子树接到右子树，将原来的右子树接到左子树右节点的下面
     * 然后不断将左子树加入到右子树中即可
     * @param root 根节点
     */
    public void flatten(TreeNode root) {
        while (root != null) {
            // 寻找下一个树根节点
            if (root.left == null) {
                root = root.right;
            } else {
                // 找到左子树的右节点
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                // 接在右子树上
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                // 继续下一个节点
                root = root.right;
            }
        }
    }
}
