package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 题号: 100279
 * <p>
 * 题目: <a href="https://leetcode.cn/contest/biweekly-contest-128/problems/minimum-time-to-visit-disappearing-nodes">访问消失节点的最少时间</a>
 * <p>
 * 详情:
 * <p>
 * 给你一个二维数组 edges 表示一个 n 个点的无向图，其中 edges[i] = [ui, vi, length] 表示节点 ui 和节点 vi 之间有一条需要 length 单位时间通过的无向边。
 * <p>
 * 同时给你一个数组 disappear ，其中 disappear[i] 表示节点 i 从图中消失的时间点，在那一刻及以后，你无法再访问这个节点。
 * <p>
 * 注意，图有可能一开始是不连通的，两个节点之间也可能有多条边。
 * <p>
 * 请你返回数组 answer ，answer[i] 表示从节点 0 到节点 i 需要的 最少 单位时间。如果从节点 0 出发 无法 到达节点 i ，那么 answer[i] 为 -1 。
 * @author 慕勋
 * @created 2024-04-13
 */
public class LeetCode100279 {

    /**
     * 思路: 图的深度优先搜索
     * @param n         节点数量
     * @param edges     节点关系
     * @param disappear 节点失效时间
     * @return 访问所有节点的最少时间
     */
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int cost = edge[2];
            graph[x].add(new int[]{y, cost});
            graph[y].add(new int[]{x, cost});
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(x -> x[1]));
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            if (ans[x] != -1 && ans[x] < y) {
                continue;
            }
            for (int[] edge : graph[x]) {
                int a = edge[0];
                int b = edge[1];
                if ((ans[a] == -1 || ans[a] > y + b) && (y + b) < disappear[a]) {
                    ans[a] = y + b;
                    queue.offer(new int[]{a, y + b});
                }
            }
        }
        return ans;
    }
}