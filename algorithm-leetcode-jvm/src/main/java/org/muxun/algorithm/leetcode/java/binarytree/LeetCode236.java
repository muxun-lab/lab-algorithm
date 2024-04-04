package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 题号：236
 * <p>
 * 题目：<a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/">二叉树的最近公共祖先</a>
 * <p>
 * 详情：给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
 * <p>
 * 公共祖先定义：
 * <p>
 * * 对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x
 * <p>
 * * 满足 x 是 p、q 的祖先且 x 的深度尽可能大
 * <p>
 * * 一个节点也可以是它自己的祖先
 * <p>
 * @author 慕勋
 * @date 2020/6/2
 */
public class LeetCode236 {

    private final HashMap<Integer, TreeNode> parentMap = new HashMap<>();

    private TreeNode result;

    /**
     * 思路：存储每个节点的父节点，然后沿着p，q分别进行遍历
     * @param root 根节点
     * @param p    节点p
     * @param q    节点q
     * @return 节点p和q的最近公共祖先
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        HashSet<Integer> visited = new HashSet<>();
        // 分别遍历每个节点，查询其路径，自底向上
        while (p != null) {
            visited.add(p.val);
            p = parentMap.get(p.val);
        }
        while (q != null) {
            if (visited.contains(q.val)) {
                return q;
            }
            q = parentMap.get(q.val);
        }
        return null;
    }

    public void dfs(TreeNode root) {
        // DFS遍历所有的节点，添加父节点
        if (root.left != null) {
            parentMap.put(root.left.val, root);
            dfs(root.left);
        }
        if (root.right != null) {
            parentMap.put(root.right.val, root);
            dfs(root.right);
        }
    }

    /**
     * 思路：递归
     * @param root 根节点
     * @param p    节点p
     * @param q    节点q
     * @return 节点p和q的最近公共祖先
     */
    public TreeNode lowestCommonAncestorRecursion(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return result;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        // 最大公共祖先判断
        if ((left && right) || ((root.val == p.val || root.val == q.val) && (left || right))) {
            result = root;
        }
        return left || right || (root.val == p.val || root.val == q.val);
    }
}
