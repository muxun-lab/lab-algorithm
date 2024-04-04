package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 103
 * 题目: 二叉树的锯齿形层序遍历
 * 链接: <a href="https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal">二叉树的锯齿形层序遍历</a>
 * 详情: 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * @author 慕勋
 * @created 2024/2/14
 */
public class LeetCode103 {

    /**
     * 思路: 广度优先遍历
     * @param root 根节点
     * @return 锯齿型层序遍历
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        int row = 1;
        while (!queue.isEmpty()) {
            ArrayList<TreeNode> temp = new ArrayList<>();
            List<Integer> curList = new ArrayList<>();
            for (TreeNode cur : queue) {
                curList.add(cur.val);
                if (cur.left != null) {
                    temp.add(cur.left);
                }
                if (cur.right != null) {
                    temp.add(cur.right);
                }
            }
            if (row % 2 == 0) {
                Collections.reverse(curList);
            }
            queue = temp;
            row++;
            resList.add(curList);
        }
        return resList;
    }
}
