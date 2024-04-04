package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 426
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/convert-binary-search-tree-to-sorted-doubly-linked-list">将二叉搜索树转化为排序的双向链表</a>
 * <p>
 * 详情: 将一个 二叉搜索树 就地转化为一个 已排序的双向循环链表 。
 * 对于双向循环列表，你可以将左右孩子指针作为双向循环链表的前驱和后继指针，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。
 * 特别地，我们希望可以 就地 完成转换操作。
 * 当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。还需要返回链表中最小元素的指针。
 * @author 慕勋
 * @created 2024/2/15
 */
public class LeetCode426 {

    private Node first = null;
    private Node last = null;

    /**
     * 思路: 中序遍历，然后连接Node
     * @param root 根节点
     * @return 已排序的双向循环链表
     */
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        inorder(root);
        last.right = first;
        first.left = last;
        return first;
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        // 递归左子树
        inorder(node.left);
        if (last != null) {
            last.right = node;
            node.left = last;
        } else {
            first = node;
        }
        last = node;
        inorder(node.right);
    }
}
