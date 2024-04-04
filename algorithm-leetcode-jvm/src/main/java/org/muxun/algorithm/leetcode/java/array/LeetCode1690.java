package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 1690
 * 题目: 石子游戏 VII
 * 链接: <a href="https://leetcode.cn/problems/stone-game-vii">石子游戏 VII</a>
 * 详情: 石子游戏中，爱丽丝和鲍勃轮流进行自己的回合，爱丽丝先开始。
 * 有 n 块石子排成一排。每个玩家的回合中，可以从行中 移除 最左边的石头或最右边的石头，并获得与该行中剩余石头值之 和 相等的得分。
 * 当没有石头可移除时，得分较高者获胜。
 * 鲍勃发现他总是输掉游戏（可怜的鲍勃，他总是输），所以他决定尽力 减小得分的差值 。
 * 爱丽丝的目标是最大限度地 扩大得分的差值 。
 * 给你一个整数数组 stones ，其中 stones[i] 表示 从左边开始 的第 i 个石头的值，如果爱丽丝和鲍勃都 发挥出最佳水平 ，请返回他们 得分的差值 。
 * @author 慕勋
 * @created 2024/2/3
 */
public class LeetCode1690 {

    /**
     * 思路: 动态规划
     * 子问题：Alice需要最大化Alice-Bob，Bob需要最小化Alice-Bob，也可以说是最大化Bob-Alice。
     * 也就是每个人都需要最大化自己得分，然后减去对手的得分。
     * dfs(i, j)表示先手得分-后手得分的最大值
     * * dfs(0, 4) = A - B
     * * dfs(0, 3) = B' - A'
     * 因为A = pt4 + A'，B = B'
     * 所以dfs(0, 4) = A - B = pt4 + A' - B' = pt4 - dfs(0, 3)
     * 一般地，如果剩余石子从 stones[i] 到 stones[j]，我们枚举先手移除的石子：
     * * 如果移除的是左边的石子，那么dfs(i, j) = s[j + 1] - s[i + 1] - dfs(i+1, j)
     * * 如果移除的是右边的石子，那么dfs(i, j) = s[j] - s[i] - dfs(i, j - 1)
     * 这两种情况下取最大值即可：dfs(i, j) = Math.max(res1, res2);
     * 递归边界：dfs(i, i)，即剩余最后一枚石子，游戏结束没有差值，返回0
     * 不过在递归过程中，很多计算已经计算过了，无需重新递归，所以可以通过空间换时间的策略
     * @param stones 石子价值
     * @return 最大发挥水平下，二者的差值
     */
    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] += sums[i] + stones[i];
        }
        int[][] memo = new int[n][n];
        return dfs(0, n - 1, sums, memo);
    }

    public int dfs(int i, int j, int[] sums, int[][] memo) {
        if (i == j) {
            return 0;
        }
        // 已经计算过
        if (memo[i][j] > 0) {
            return memo[i][j];
        }
        int res1 = sums[j + 1] - sums[i + 1] - dfs(i + 1, j, sums, memo);
        int res2 = sums[j] - sums[i] - dfs(i, j - 1, sums, memo);
        // 记忆化
        return memo[i][j] = Math.max(res1, res2);
    }
}
