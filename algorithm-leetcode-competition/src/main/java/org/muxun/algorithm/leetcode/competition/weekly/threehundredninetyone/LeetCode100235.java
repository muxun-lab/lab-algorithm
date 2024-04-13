package org.muxun.algorithm.leetcode.competition.weekly.threehundredninetyone;

/**
 * 题号: 100235
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-391/problems/water-bottles-ii/">换水问题</a>
 * <p>
 * 详情: 给你两个整数 numBottles 和 numExchange 。
 * <p>
 * numBottles 代表你最初拥有的满水瓶数量。在一次操作中，你可以执行以下操作之一：
 * <p>
 * <li> 喝掉任意数量的满水瓶，使它们变成空水瓶。
 * <li> 用 numExchange 个空水瓶交换一个满水瓶。然后，将 numExchange 的值增加 1 。
 * 注意，你不能使用相同的 numExchange 值交换多批空水瓶。例如，如果 numBottles == 3 并且 numExchange == 1 ，则不能用 3 个空水瓶交换成 3 个满水瓶。
 * <p>
 * 返回你 最多 可以喝到多少瓶水。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode100235 {

    /**
     * 思路: 枚举
     * @param numBottles  满水瓶数量
     * @param numExchange 交换空水瓶的数量
     * @return 最多喝水瓶数
     */
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum = numBottles;
        int empty = numBottles;
        while (empty - numExchange >= 0) {
            empty = empty - numExchange;
            numExchange++;
            sum += 1;
            empty += 1;
        }
        return sum;
    }
}
