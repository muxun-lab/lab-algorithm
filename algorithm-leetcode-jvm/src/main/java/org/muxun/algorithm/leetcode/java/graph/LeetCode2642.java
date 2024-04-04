package org.muxun.algorithm.leetcode.java.graph;

import java.util.*;

/**
 * 题号: 2642
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/design-graph-with-shortest-path-calculator">设计可以求最短路径的图类</a>
 * <p>
 * 详情: 给你一个有 n 个节点的 有向带权 图，节点编号为 0 到 n - 1 。图中的初始边用数组 edges 表示，其中 edges[i] = [fromi, toi, edgeCosti] 表示从 fromi 到 toi 有一条代价为 edgeCosti 的边。
 * <p>
 * 请你实现一个 Graph 类：
 * <p>
 * <li> Graph(int n, int[][] edges) 初始化图有 n 个节点，并输入初始边。
 * <li> addEdge(int[] edge) 向边集中添加一条边，其中 edge = [from, to, edgeCost] 。数据保证添加这条边之前对应的两个节点之间没有有向边。
 * <li> int shortestPath(int node1, int node2) 返回从节点 node1 到 node2 的路径 最小 代价。如果路径不存在，返回 -1 。一条路径的代价是路径中所有边代价之和。
 * @author 慕勋
 * @created 2024-03-26
 */
public class LeetCode2642 {

    private final List<int[]>[] graph;

    /**
     * 思路: 用List数组构建图，然后使用最最小堆进行计算
     * @param n     边数
     * @param edges 连接器
     */
    public LeetCode2642(int n, int[][] edges) {
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int cost = edge[2];
            graph[x].add(new int[]{y, cost});
        }
    }

    public void addEdge(int[] edge) {
        int x = edge[0];
        int y = edge[1];
        int cost = edge[2];
        graph[x].add(new int[]{y, cost});
    }

    public int shortestPath(int node1, int node2) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[node1] = 0;
        queue.offer(new int[]{0, node1});
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int cost = arr[0];
            int cur = arr[1];
            if (cur == node2) {
                return cost;
            }
            for (int[] nextArr : graph[cur]) {
                int next = nextArr[0];
                int nextCost = nextArr[1];
                if (dist[next] > cost + nextCost) {
                    dist[next] = cost + nextCost;
                    queue.offer(new int[]{cost + nextCost, next});
                }
            }
        }
        return -1;
    }
}
