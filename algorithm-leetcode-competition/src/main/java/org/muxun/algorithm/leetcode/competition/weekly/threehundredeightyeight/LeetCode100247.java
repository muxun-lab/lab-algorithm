package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyeight;

import java.util.Arrays;

/**
 * 题号: 100247
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-388/problems/maximize-happiness-of-selected-children">幸福值最大化的选择方案</a>
 * <p>
 * 详情:
 * 给你一个长度为 n 的数组 happiness ，以及一个 正整数 k 。
 * <p>
 * n 个孩子站成一队，其中第 i 个孩子的 幸福值 是 happiness[i] 。你计划组织 k 轮筛选从这 n 个孩子中选出 k 个孩子。
 * <p>
 * 在每一轮选择一个孩子时，所有 尚未 被选中的孩子的 幸福值 将减少 1 。注意，幸福值 不能 变成负数，且只有在它是正数的情况下才会减少。
 * <p>
 * 选择 k 个孩子，并使你选中的孩子幸福值之和最大，返回你能够得到的 最大值 。
 * @author 慕勋
 * @created 2024-03-10
 */
public class LeetCode100247 {

    /**
     * 思路: 常规思路
     * 排序之后，从指定位置开始依次向后获取
     * 取超过0的数值
     * @param happiness 幸福值
     * @param k         选择数量
     * @return 幸福值之和
     */
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            int cur = happiness[n - i];
            sum += Math.max(0, cur - (i - 1));
        }
        return sum;
    }
}
