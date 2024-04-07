package org.muxun.algorithm.leetcode.java.binarytree;

import org.muxun.algorithm.leetcode.java.Lack;

/**
 * 题号: 1483
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/kth-ancestor-of-a-tree-node">树节点的第 K 个祖先</a>
 * <p>
 * 详情: 给你一棵树，树上有 n 个节点，按从 0 到 n-1 编号。树以父节点数组的形式给出，其中 parent[i] 是节点 i 的父节点。树的根节点是编号为 0 的节点。
 * <p>
 * 树节点的第 k 个祖先节点是从该节点到根节点路径上的第 k 个节点。
 * <p>
 * 实现 TreeAncestor 类：
 * <p>
 * <li> TreeAncestor（int n， int[] parent） 对树和父数组中的节点数初始化对象。
 * <li> getKthAncestor(int node, int k) 返回节点 node 的第 k 个祖先节点。如果不存在这样的祖先节点，返回 -1 。
 * @author 慕勋
 * @created 2024-04-06
 */
@Lack
public class LeetCode1483 {

    private final int[][] tree;

    /**
     * 思路: 倍增
     * @param n      节点数量
     * @param parent 父节点关系
     */
    public LeetCode1483(int n, int[] parent) {
        int m = 32 - Integer.numberOfLeadingZeros(n);
        tree = new int[n][m];
        for (int i = 0; i < n; i++) {
            tree[i][0] = parent[i];
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                int p = tree[j][i];
                tree[j][i + 1] = p < 0 ? -1 : tree[p][i];
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        int m = 32 - Integer.numberOfLeadingZeros(k);
        for (int i = 0; i < m; i++) {
            if (((k >> i & 1) > 0)) {
                node = tree[node][i];
                if (node < 0) {
                    break;
                }
            }
        }
        return node;
    }
}
