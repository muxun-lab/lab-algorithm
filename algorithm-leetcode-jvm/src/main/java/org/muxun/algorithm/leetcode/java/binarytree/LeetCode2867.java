package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题号: 2867
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/count-valid-paths-in-a-tree">统计树中的合法路径数目</a>
 * <p>
 * 详情: 给你一棵 n 个节点的无向树，节点编号为 1 到 n 。给你一个整数 n 和一个长度为 n - 1 的二维整数数组 edges ，其中 edges[i] = [ui, vi] 表示节点 ui 和 vi 在树中有一条边。
 * <p>
 * 请你返回树中的 合法路径数目 。
 * <p>
 * 如果在节点 a 到节点 b 之间 恰好有一个 节点的编号是质数，那么我们称路径 (a, b) 是 合法的 。
 * <p>
 * 注意：
 * <p>
 * * 路径 (a, b) 指的是一条从节点 a 开始到节点 b 结束的一个节点序列，序列中的节点 互不相同 ，且相邻节点之间在树上有一条边。
 * * 路径 (a, b) 和路径 (b, a) 视为 同一条 路径，且只计入答案 一次 。
 * @author 慕勋
 * @created 2024/2/27
 */
public class LeetCode2867 {

    private final static int MX = (int) 1e5;
    private final static boolean[] np = new boolean[MX + 1]; // 质数=false 非质数=true

    static {
        np[1] = true;
        for (int i = 2; i * i <= MX; i++) {
            if (!np[i]) {
                for (int j = i * i; j <= MX; j += i) {
                    np[j] = true;
                }
            }
        }
    }

    public long countPaths(int n, int[][] edges) {
        List<Integer>[] g = new ArrayList[n + 1];
        Arrays.setAll(g, e -> new ArrayList<>());
        for (var e : edges) {
            int x = e[0], y = e[1];
            g[x].add(y);
            g[y].add(x);
        }

        long ans = 0;
        int[] size = new int[n + 1];
        var nodes = new ArrayList<Integer>();
        for (int x = 1; x <= n; x++) {
            if (np[x]) { // 跳过非质数
                continue;
            }
            int sum = 0;
            for (int y : g[x]) { // 质数 x 把这棵树分成了若干个连通块
                if (!np[y]) {
                    continue;
                }
                if (size[y] == 0) { // 尚未计算过
                    nodes.clear();
                    dfs(y, -1, g, nodes); // 遍历 y 所在连通块，在不经过质数的前提下，统计有多少个非质数
                    for (int z : nodes) {
                        size[z] = nodes.size();
                    }
                }
                // 这 size[y] 个非质数与之前遍历到的 sum 个非质数，两两之间的路径只包含质数 x
                ans += (long) size[y] * sum;
                sum += size[y];
            }
            ans += sum; // 从 x 出发的路径
        }
        return ans;
    }

    private void dfs(int x, int fa, List<Integer>[] g, List<Integer> nodes) {
        nodes.add(x);
        for (int y : g[x]) {
            if (y != fa && np[y]) {
                dfs(y, x, g, nodes);
            }
        }
    }
}
