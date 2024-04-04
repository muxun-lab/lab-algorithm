package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 2673
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/make-costs-of-paths-equal-in-a-binary-tree">使二叉树所有路径值相等的最小代价</a>
 * <p>
 * 详情: 给你一个整数 n 表示一棵 满二叉树 里面节点的数目，节点编号从 1 到 n 。根节点编号为 1 ，树中每个非叶子节点 i 都有两个孩子，分别是左孩子 2 * i 和右孩子 2 * i + 1 。
 * <p>
 * 树中每个节点都有一个值，用下标从 0 开始、长度为 n 的整数数组 cost 表示，其中 cost[i] 是第 i + 1 个节点的值。每次操作，你可以将树中 任意 节点的值 增加 1 。你可以执行操作 任意 次。
 * <p>
 * 你的目标是让根到每一个 叶子结点 的路径值相等。请你返回 最少 需要执行增加操作多少次。
 * <p>
 * 注意：
 * <p>
 * * 满二叉树 指的是一棵树，它满足树中除了叶子节点外每个节点都恰好有 2 个子节点，且所有叶子节点距离根节点距离相同。
 * <p>
 * * 路径值 指的是路径上所有节点的值之和。
 * @author 慕勋
 * @created 2024/2/28
 */
public class LeetCode2673 {

    /**
     * 思路: 计算最大数值
     * @param n    满二叉树节点数目
     * @param cost 节点值
     * @return 最少执行操作次数
     */
    public int minIncrements(int n, int[] cost) {
        int ans = 0;
        for (int i = n / 2; i > 0; i--) {
            ans += Math.abs(cost[i * 2 - 1] - cost[i * 2]);
            cost[i - 1] += Math.max(cost[i * 2 - 1], cost[i * 2]);
        }
        return ans;
    }
}
