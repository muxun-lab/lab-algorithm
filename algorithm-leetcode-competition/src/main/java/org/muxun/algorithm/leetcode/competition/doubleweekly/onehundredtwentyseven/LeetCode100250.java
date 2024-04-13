package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyseven;

/**
 * 题号: 100250
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/biweekly-contest-127/problems/minimum-levels-to-gain-more-points">得到更多分数的最少关卡数目</a>
 * <p>
 * 详情: 给你一个长度为 n 的二进制数组 possible 。
 * <p>
 * 莉叩酱和冬坂五百里正在玩一个有 n 个关卡的游戏，游戏中有一些关卡是 困难 模式，其他的关卡是 简单 模式。如果 possible[i] == 0 ，那么第 i 个关卡是 困难 模式。一个玩家通过一个简单模式的关卡可以获得 1 分，通过困难模式的关卡将失去 1 分。
 * <p>
 * 游戏的一开始，莉叩酱将从第 0 级开始 按顺序 完成一些关卡，然后冬坂五百里会完成剩下的所有关卡。
 * <p>
 * 假设两名玩家都采取最优策略，目的是 最大化 自己的得分，莉叩酱想知道自己 最少 需要完成多少个关卡，才能获得比冬坂五百里更多的分数。
 * <p>
 * 请你返回莉叩酱获得比冬坂五百里更多的分数所需要完成的 最少 关卡数目，如果 无法 达成，那么返回 -1 。
 * <p>
 * 注意，每个玩家都至少需要完成 1 个关卡。
 * @author 慕勋
 * @created 2024-03-30
 */
public class LeetCode100250 {

    /**
     * 思路: 前缀和
     * @param possible 难度数组
     * @return 胜利的最小回合数
     */
    public int minimumLevels(int[] possible) {
        int n = possible.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = possible[0] == 0 ? -1 : 1;
        for (int i = 1; i < n; i++) {
            int cur = possible[i] == 0 ? -1 : 1;
            prefix[i] = prefix[i - 1] + cur;
        }
        suffix[n - 1] = possible[n - 1] == 0 ? -1 : 1;
        for (int i = n - 2; i >= 0; i--) {
            int cur = possible[i] == 0 ? -1 : 1;
            suffix[i] = suffix[i + 1] + cur;
        }
        for (int i = 0; i < n - 1; i++) {
            int p = prefix[i];
            int q = suffix[i + 1];
            if (p > q) {
                return i + 1;
            }
        }
        return -1;
    }
}
