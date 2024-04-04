package org.muxun.algorithm.leetcode.java.dp;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 题号：322
 * 题目：零钱兑换
 * 详情：给定不同面额的硬币 coins 和一个总金额 amount
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数
 * 如果没有任何一种硬币组合能组成总金额，返回 -1
 * <p>
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 * @author 慕勋
 * @created 2020-03-08
 */
public class CoinChange {

    private int min = -1;

    /**
     * 思路：回溯
     * 超时
     * @param coins  硬币面额
     * @param amount 硬币需要凑成的总金额
     * @return 凑成总金额的硬币数
     */
    public int coinChange(int[] coins, int amount) {
        if (coins.length <= 0) {
            return -1;
        }
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        Arrays.sort(coins);
        backtrack(coins, amount, new LinkedList<>());
        return min;
    }

    private void backtrack(int[] coins, int target, LinkedList<Integer> backtrackList) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            int currentSize = backtrackList.size() == 0 ? -1 : backtrackList.size();
            if (min == -1) {
                min = currentSize;
            } else {
                min = Math.min(min, currentSize);
            }
            return;
        }
        for (int coin : coins) {
            backtrackList.add(coin);
            backtrack(coins, target - coin, backtrackList);
            backtrackList.removeLast();
        }
    }

    /**
     * 思路：动态规划
     * @param coins  硬币面额
     * @param amount 硬币需要凑成的总金额
     * @return 凑成总金额的硬币数
     */
    public int coinChangeDp(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        int[] dpTable = new int[amount + 1];
        Arrays.fill(dpTable, amount + 1);
        dpTable[0] = 0;
        for (int i = 0; i < dpTable.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                // 看是当前解最小，还是子问题+1最小
                // 自底向上，之前的问题已经全部计算过了
                dpTable[i] = Math.min(dpTable[i - coin] + 1, dpTable[i]);
            }
        }
        return (dpTable[amount] == amount + 1) ? -1 : dpTable[amount];
    }
}
