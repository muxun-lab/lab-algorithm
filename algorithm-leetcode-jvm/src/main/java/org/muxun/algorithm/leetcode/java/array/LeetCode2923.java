package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 2923
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/find-champion-i">找到冠军 I</a>
 * <p>
 * 详情:
 * <p>
 * 一场比赛中共有 n 支队伍，按从 0 到  n - 1 编号。
 * <p>
 * 给你一个下标从 0 开始、大小为 n * n 的二维布尔矩阵 grid 。对于满足 0 <= i, j <= n - 1 且 i != j 的所有 i, j ：如果 grid[i][j] == 1，那么 i 队比 j 队 强 ；否则，j 队比 i 队 强 。
 * <p>
 * 在这场比赛中，如果不存在某支强于 a 队的队伍，则认为 a 队将会是 冠军 。
 * <p>
 * 返回这场比赛中将会成为冠军的队伍。
 * @author 慕勋
 * @created 2024-04-12
 */
public class LeetCode2923 {

    /**
     * 思路: 遍历
     * 成为冠军的条件是获胜的次数 = n - 1
     * @param grid 二维矩阵
     * @return 冠军队伍
     */
    public int findChampion(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int[] line = grid[i];
            int sum = 0;
            for (int num : line) {
                sum += num;
            }
            if (sum == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
