package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 题号: 105
 * 题目: 从前序与中序遍历序列构造二叉树
 * 链接: <a href="https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal">从前序与中序遍历序列构造二叉树</a>
 * 详情: 给定两个整数数组 preorder 和 inorder，
 * 其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，
 * 请构造二叉树并返回其根节点。
 * @author 慕勋
 * @created 2024/2/3
 */
public class LeetCode105 {

    private HashMap<Integer, Integer> indexMap;

    /**
     * 思路: 递归
     * 前序遍历的第一个节点一定是根节点
     * 可以根据根节点在中序遍历中获取左子树的节点
     * 可以根据根节点在中序遍历中获取右子树的节点
     * 然后根据左右子树的数目，定位前序遍历中数值的边界
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return 还原后的二叉树
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<>();
        // 定位中序遍历中根节点的位置，方便计算前序遍历的索引位置
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) {
            return null;
        }
        // 前序遍历中的第一个节点就是根节点
        int preorderRoot = preorderLeft;
        // 在中序遍历中找到根节点
        int inorderRoot = indexMap.get(preorder[preorderRoot]);
        // 先建立根节点
        TreeNode root = new TreeNode(preorder[preorderRoot]);
        // 计算获取左子树中节点的数目
        int leftTreeSize = inorderRoot - inorderLeft;
        // 递归构造左子树，并连接到根节点上
        // 先序遍历中{左边界+1开始的左子树节点个数}对应着{中序遍历中左边界开始到根节点-1}的元素
        root.left = buildTree(preorder, inorder, preorderLeft + 1, preorderLeft + leftTreeSize, inorderLeft, inorderRoot - 1);
        // 递归构造右子树，并连接到根节点上
        // 先序遍历中{左边界+左子树节点个数+1开始的元素}对应着{根节点+1到右边界的元素}
        root.right = buildTree(preorder, inorder, preorderLeft + leftTreeSize + 1, preorderRight, inorderRoot + 1, inorderRight);
        return root;
    }

    /**
     * 思路: 迭代
     * 在前序遍历中，两个连续节点存在下面的关系：
     * * y是x的左儿子，因为先遍历x，后遍历y。
     * * x没有左儿子，y是x的右儿子，或者祖先节点的右儿子。
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return 还原后的二叉树
     */
    public TreeNode buildTreeByIterate(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderValue = preorder[i];
            TreeNode node = deque.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderValue);
                deque.push(node.left);
            } else {
                while (!deque.isEmpty() && deque.peek().val == inorder[inorderIndex]) {
                    node = deque.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderValue);
                deque.push(node.right);
            }
        }
        return root;
    }
}
