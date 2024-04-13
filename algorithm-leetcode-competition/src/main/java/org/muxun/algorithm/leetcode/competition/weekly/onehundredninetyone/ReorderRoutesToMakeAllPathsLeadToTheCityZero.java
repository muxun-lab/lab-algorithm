package org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 题号：5426
 * 题目：重新规划路线
 * 题链：https://leetcode-cn.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
 * 详情：n 座城市，从 0 到 n-1 编号，其间共有 n-1 条路线
 * 因此，要想在两座不同城市之间旅行只有唯一一条路线可供选择（路线网形成一颗树）
 * 去年，交通运输部决定重新规划路线，以改变交通拥堵的状况
 * 路线用 connections 表示，其中 connections[i] = [a, b] 表示从城市 a 到 b 的一条有向路线。
 * <p>
 * 今年，城市 0 将会举办一场大型比赛，很多游客都想前往城市 0
 * <p>
 * 请你帮助重新规划路线方向，使每个城市都可以访问城市 0 ，返回需要变更方向的最小路线数
 * <p>
 * 题目数据 保证 每个城市在重新规划路线方向后都能到达城市 0
 * @author sunshine
 * @created 2020-05-31
 */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {

    /**
     * 思路：BFS
     * @param n           城市个数
     * @param connections 城市之间的单项连接
     * @return 到根城市所需要修改的最少路线
     */
    public int minReorder(int n, int[][] connections) {
        HashMap<Integer, HashSet<Integer>> routeMap = new HashMap<>();
        // 生成一个双向图，即每个节点的下一个节点指向分为正方向和反方向
        for (int[] current : connections) {
            HashSet<Integer> currentRouteSet = routeMap.containsKey(current[0]) ? routeMap.get(current[0]) : new HashSet<>();
            currentRouteSet.add(current[1]);
            routeMap.put(current[0], currentRouteSet);
            HashSet<Integer> reverseSet = routeMap.containsKey(current[1]) ? routeMap.get(current[1]) : new HashSet<>();
            reverseSet.add(current[0] * -1);
            routeMap.put(current[1], reverseSet);
        }
        return bfs(routeMap, n);
    }

    public int bfs(HashMap<Integer, HashSet<Integer>> routeMap, int n) {
        boolean[] mark = new boolean[n];
        LinkedList<Integer> queue = new LinkedList<>();
        int result = 0;
        queue.add(0);
        mark[0] = true;
        // 进行BFS，如果存在正数，即需要调换方向
        while (!queue.isEmpty()) {
            for (int current : routeMap.get(queue.poll())) {
                if (mark[Math.abs(current)]) {
                    continue;
                }
                if (current > 0) {
                    result++;
                }
                mark[Math.abs(current)] = true;
                queue.add(Math.abs(current));
            }
        }
        return result;
    }
}
