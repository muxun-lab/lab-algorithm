package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 2368
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/reachable-nodes-with-restrictions">受限条件下可到达节点的数目</a>
 * <p>
 * 详情: 现有一棵由 n 个节点组成的无向树，节点编号从 0 到 n - 1 ，共有 n - 1 条边。
 * 给你一个二维整数数组 edges ，长度为 n - 1 ，其中 edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间存在一条边。
 * <p>
 * 另给你一个整数数组 restricted 表示 受限 节点。
 * <p>
 * 在不访问受限节点的前提下，返回你可以从节点 0 到达的 最多 节点数目。
 * <p>
 * 注意，节点 0 不 会标记为受限节点。
 * @author 慕勋
 * @created 2024/3/2
 */
public class LeetCode2368 {

    private boolean[] visited;

    private List<Integer>[] g;

    /**
     * 思路: 深度优先遍历
     * @param n          节点数量
     * @param edges      边
     * @param restricted 受限节点
     * @return 可达的最多节点
     */
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        this.g = new List[n];
        this.visited = new boolean[n];
        for (int num : restricted) {
            visited[num] = true;
        }
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        // 记录每个节点和哪些节点相连
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            g[x].add(y);
            g[y].add(x);
        }
        return dfs(0);
    }

    private int dfs(int i) {
        visited[i] = true;
        int ans = 1;
        // 遍历0节点，那么就从0节点的相邻节点开始依次dfs，并标记已经走过，相当于去重
        for (int j : g[i]) {
            if (!visited[j]) {
                ans += dfs(j);
            }
        }
        return ans;
    }
}
