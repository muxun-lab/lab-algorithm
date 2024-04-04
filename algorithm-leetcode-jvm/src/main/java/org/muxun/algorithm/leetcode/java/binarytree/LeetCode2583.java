package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 2583
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree">二叉树中的第K大层和</a>
 * <p>
 * 详情: 给你一棵二叉树的根节点 root 和一个正整数 k 。
 * <p>
 * 树中的 层和 是指 同一层 上节点值的总和。
 * <p>
 * 返回树中第 k 大的层和（不一定不同）。如果树少于 k 层，则返回 -1 。
 * <p>
 * 注意，如果两个节点与根节点的距离相同，则认为它们在同一层。
 * @author 慕勋
 * @created 2024/2/23
 */
public class LeetCode2583 {

    /**
     * 思路:
     * @param root 根节点
     * @param k    第K
     * @return K大层和
     */
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        List<Long> resList = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0;
            ArrayList<TreeNode> tempList = new ArrayList<>();
            for (TreeNode node : queue) {
                sum += node.val;
                if (node.left != null) {
                    tempList.add(node.left);
                }
                if (node.right != null) {
                    tempList.add(node.right);
                }
            }
            resList.add(sum);
            queue = tempList;
        }
        if (resList.size() < k) {
            return -1;
        }
        Collections.sort(resList);
        return resList.get(resList.size() - k);
    }
}
