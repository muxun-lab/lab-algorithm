package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;

/**
 * 题号: 1686
 * 题目: 石子游戏 VI
 * 链接: <a href="https://leetcode.cn/problems/stone-game-vi">石子游戏 VI</a>
 * 详情: Alice 和 Bob 轮流玩一个游戏，Alice 先手。
 * 一堆石子里总共有 n 个石子，轮到某个玩家时，他可以 移出 一个石子并得到这个石子的价值。
 * Alice 和 Bob 对石子价值有 不一样的的评判标准 。双方都知道对方的评判标准。
 * 给你两个长度为 n 的整数数组 aliceValues 和 bobValues 。
 * aliceValues[i] 和 bobValues[i] 分别表示 Alice 和 Bob 认为第 i 个石子的价值。
 * 所有石子都被取完后，得分较高的人为胜者。如果两个玩家得分相同，那么为平局。两位玩家都会采用 最优策略 进行游戏。
 * 请你推断游戏的结果，用如下的方式表示：
 * * 如果 Alice 赢，返回 1 。
 * * 如果 Bob 赢，返回 -1 。
 * * 如果游戏平局，返回 0 。
 * @author 慕勋
 * @created 2024/2/2
 */
public class LeetCode1686 {

    /**
     * 思路: 贪心算法
     * @param aliceValues alice石子的价值
     * @param bobValues   bob石子的价值
     * @return 比较结果
     */
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int m = aliceValues.length;
        int n = bobValues.length;
        int[][] values = new int[m][3];
        for (int i = 0; i < n; i++) {
            values[i][0] = aliceValues[i] + bobValues[i];
            values[i][1] = aliceValues[i];
            values[i][2] = bobValues[i];
        }
        Arrays.sort(values, (a, b) -> b[0] - a[0]);
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                aliceSum += values[i][1];
            } else {
                bobSum += values[i][2];
            }
        }
        if (aliceSum > bobSum) {
            return 1;
        } else if (aliceSum == bobSum) {
            return 0;
        } else {
            return -1;
        }
    }
}
