package org.muxun.algorithm.leetcode.java.graph;

import org.muxun.algorithm.leetcode.java.Lack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 题号: 2192
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph">有向无环图中一个节点的所有祖先</a>
 * <p>
 * 详情: 给你一个正整数 n ，它表示一个 有向无环图 中节点的数目，节点编号为 0 到 n - 1 （包括两者）。
 * <p>
 * 给你一个二维整数数组 edges ，其中 edges[i] = [fromi, toi] 表示图中一条从 fromi 到 toi 的单向边。
 * <p>
 * 请你返回一个数组 answer，其中 answer[i]是第 i 个节点的所有 祖先 ，这些祖先节点 升序 排序。
 * <p>
 * 如果 u 通过一系列边，能够到达 v ，那么我们称节点 u 是节点 v 的 祖先 节点。
 * @author 慕勋
 * @created 2024-04-04
 */
@Lack
public class LeetCode2192 {

    /**
     * 思路: 广度优先搜索 + 拓扑排序
     * 现阶段完全不了解思路
     * @param n     节点数量
     * @param edges 拓扑关系
     * @return 结果集
     */
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        // 记录每个节点的父节点
        Set<Integer>[] parentSets = new Set[n];
        for (int i = 0; i < n; i++) {
            parentSets[i] = new HashSet<>();
        }
        // 相邻节点
        List<Integer>[] neighbors = new List[n];
        for (int i = 0; i < n; i++) {
            neighbors[i] = new ArrayList<>();
        }
        // 入度记录
        int[] inDegree = new int[n];
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            neighbors[x].add(y);
            ++inDegree[y];
        }
        // 广度优先搜索
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int i = queue.poll();
            for (int j : neighbors[i]) {
                // 更新子节点的祖先
                parentSets[j].add(i);
                for (int k : parentSets[i]) {
                    parentSets[j].add(k);
                }
                --inDegree[j];
                if (inDegree[j] == 0) {
                    queue.offer(j);
                }
            }
        }
        // 转化
        List<List<Integer>> resList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resList.add(new ArrayList<>());
            for (int num : parentSets[i]) {
                resList.get(i).add(num);
            }
            Collections.sort(resList.get(i));
        }
        return resList;
    }
}
