package org.muxun.algorithm.leetcode.java.greedy;

import java.util.Arrays;

/**
 * 题号: 2952
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/minimum-number-of-coins-to-be-added">需要添加的硬币的最小数量</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数数组 coins，表示可用的硬币的面值，以及一个整数 target 。
 * <p>
 * 如果存在某个 coins 的子序列总和为 x，那么整数 x 就是一个 可取得的金额 。
 * <p>
 * 返回需要添加到数组中的 任意面值 硬币的 最小数量 ，使范围 [1, target] 内的每个整数都属于 可取得的金额 。
 * <p>
 * 数组的 子序列 是通过删除原始数组的一些（可能不删除）元素而形成的新的 非空 数组，删除过程不会改变剩余元素的相对位置。
 * @author 慕勋
 * @created 2024-03-30
 */
public class LeetCode2952 {

    /**
     * 思路: 贪心算法
     * @param coins  现有硬币
     * @param target 目标值
     * @return 添加硬币的最小次数
     */
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int ans = 0;
        int x = 1;
        int n = coins.length;
        int index = 0;
        while (x <= target) {
            if (index < n && coins[index] <= x) {
                x += coins[index];
                index++;
            } else {
                x = x * 2;
                ans++;
            }
        }
        return ans;
    }
}
