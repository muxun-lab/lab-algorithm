package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 235
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree">二叉搜索树的最近公共祖先</a>
 * <p>
 * 详情: 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * @author 慕勋
 * @created 2024/2/15
 */
public class LeetCode235 {

    /**
     * 思路:
     * @param root 根节点
     * @param p    节点p
     * @param q    节点q
     * @return 最近公共祖先
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pPath = dfs(root, p);
        List<TreeNode> qPath = dfs(root, q);
        TreeNode ancestor = null;
        for (int i = 0; i < pPath.size() && i < qPath.size(); i++) {
            if (pPath.get(i) != qPath.get(i)) {
                break;
            }
            ancestor = pPath.get(i);
        }
        return ancestor;
    }

    /**
     * 深度优先遍历，查找指定节点的路径
     * @param root 根节点
     * @param p    查询节点
     */
    private List<TreeNode> dfs(TreeNode root, TreeNode p) {
        List<TreeNode> path = new ArrayList<>();
        TreeNode node = root;
        while (node != p) {
            path.add(node);
            if (p.val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        path.add(node);
        return path;
    }
}
