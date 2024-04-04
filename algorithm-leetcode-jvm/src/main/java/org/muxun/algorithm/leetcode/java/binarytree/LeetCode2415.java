package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.LinkedList;

/**
 * 题号: 2415
 * 题目: 反转二叉树的奇数层
 * 链接: https://leetcode.cn/problems/reverse-odd-levels-of-binary-tree
 * 详情: 给你一棵 完美 二叉树的根节点 root ，请你反转这棵树中每个 奇数 层的节点值。
 * <p>
 * 例如，假设第 3 层的节点值是 [2,1,3,4,7,11,29,18] ，那么反转后它应该变成 [18,29,11,7,4,3,1,2] 。
 * 反转后，返回树的根节点。
 * <p>
 * 完美 二叉树需满足：二叉树的所有父节点都有两个子节点，且所有叶子节点都在同一层。
 * <p>
 * 节点的 层数 等于该节点到根节点之间的边数。
 * @author 慕勋
 * @created 2023-12-15
 */
public class LeetCode2415 {

    /**
     * 思路:
     * @param root 二叉树根节点
     * @return 输出结果
     */
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null || root.left == null || root.right == null) {
            return root;
        }
        int index = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> nodeList = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                nodeList.add(currentNode);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            if (index % 2 == 1) {
                reverse(nodeList);
            }
            index++;
        }
        return root;
    }

    private void reverse(LinkedList<TreeNode> nodeList) {
        int x = 0;
        int y = nodeList.size() - 1;
        while (x < y) {
            TreeNode leftNode = nodeList.get(x);
            TreeNode rightNode = nodeList.get(y);
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
            x++;
            y--;
        }
    }
}
