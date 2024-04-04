package org.muxun.algorithm.leetcode.java.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号: 310
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-height-trees">最小高度树</a>
 * <p>
 * 详情: 树是一个无向图，其中任何两个顶点只通过一条路径连接。 换句话说，一个任何没有简单环路的连通图都是一棵树。
 * <p>
 * 给你一棵包含 n 个节点的树，标记为 0 到 n - 1 。给定数字 n 和一个有 n - 1 条无向边的 edges 列表（每一个边都是一对标签），其中 edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间存在一条无向边。
 * <p>
 * 可选择树中任何一个节点作为根。当选择节点 x 作为根节点时，设结果树的高度为 h 。在所有可能的树中，具有最小高度的树（即，min(h)）被称为 最小高度树 。
 * <p>
 * 请你找到所有的 最小高度树 并按 任意顺序 返回它们的根节点标签列表。
 * <p>
 * 树的 高度 是指根节点和叶子节点之间最长向下路径上边的数量。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode310 {

    /**
     * 思路: BFS
     * 1.
     * @param n     节点数量
     * @param edges 拓扑连接
     * @return 最小高度树
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> resList = new ArrayList<>();
        if (n == 1) {
            resList.add(0);
            return resList;
        }
        // 建立各个节点的出度表
        int[] degree = new int[n];
        // 建立关联关系图
        List<List<Integer>> relationList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            relationList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            relationList.get(edge[0]).add(edge[1]);
            relationList.get(edge[1]).add(edge[0]);
        }
        // 建立队列
        LinkedList<Integer> queue = new LinkedList<>();
        // 把所有叶子节点，也就是出度为1的节点入队
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.offer(i);
            }
        }

        // 开始广度优先遍历叶子节点，进行收敛
        while (!queue.isEmpty()) {
            resList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                resList.add(cur);
                List<Integer> parentNodeList = relationList.get(cur);
                for (int parentNode : parentNodeList) {
                    degree[parentNode]--;
                    if (degree[parentNode] == 1) {
                        queue.offer(parentNode);
                    }
                }
            }
        }
        return resList;
    }
}
