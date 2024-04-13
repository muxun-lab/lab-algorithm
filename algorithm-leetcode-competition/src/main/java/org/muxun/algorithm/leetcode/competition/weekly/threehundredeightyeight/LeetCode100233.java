package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyeight;

import java.util.Arrays;

/**
 * 题号: 100233
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-388/problems/apple-redistribution-into-boxes">重新分装苹果</a>
 * <p>
 * 详情:
 * 给你一个长度为 n 的数组 apple 和另一个长度为 m 的数组 capacity 。
 * <p>
 * 一共有 n 个包裹，其中第 i 个包裹中装着 apple[i] 个苹果。同时，还有 m 个箱子，第 i 个箱子的容量为 capacity[i] 个苹果。
 * <p>
 * 请你选择一些箱子来将这 n 个包裹中的苹果重新分装到箱子中，返回你需要选择的箱子的 最小 数量。
 * <p>
 * 注意，同一个包裹中的苹果可以分装到不同的箱子中。
 * @author 慕勋
 * @created 2024-03-10
 */
public class LeetCode100233 {

    /**
     * 思路: 简单的贪心算法
     * @param apple    苹果包裹
     * @param capacity 箱子容量
     * @return 使用的最少箱子数量
     */
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count = 0;
        for (int n : apple) {
            count += n;
        }
        Arrays.sort(capacity);
        int m = capacity.length;
        int ans = 0;
        for (int i = m - 1; i >= 0; i--) {
            if (count <= 0) {
                break;
            }
            count -= capacity[i];
            ans++;
        }
        return ans;
    }
}
