package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：2400
 * 题目：恰好移动 k 步到达某一位置的方法数目
 * 题链：<a href="https://leetcode.cn/problems/number-of-ways-to-reach-a-position-after-exactly-k-steps">恰好移动 k 步到达某一位置的方法数目</a>
 * 详情：给你两个 正 整数 startPos 和 endPos 。
 * 最初，你站在 无限 数轴上位置 startPos 处。在一步移动中，你可以向左或者向右移动一个位置。
 * 给你一个正整数 k ，返回从 startPos 出发、恰好 移动 k 步并到达 endPos 的 不同 方法数目。
 * 由于答案可能会很大，返回对 109 + 7 取余 的结果。
 * 如果所执行移动的顺序不完全相同，则认为两种方法不同。
 * 注意：数轴包含负整数。
 * @author 慕勋
 * @date 2024/2/8
 */
public class LeetCode2400 {

    /**
     * 思路: 动态规划
     * 从startPos移动K步到endPos，那么移动K-1步就是endPos-1或者endPos+1
     * 因此dp[i][j] = dp[i-1][j-1]+dp[i-1][j+1]
     * 边界情况：
     * * dp[i][0]=dp[i-1][1]
     * * dp[i][2k]=dp[i-1][2k-1]
     * @param startPos 起始位置
     * @param endPos   结束位置
     * @param k        移动K步
     * @return 移动方法数量
     */
    public int numberOfWays(int startPos, int endPos, int k) {
        if (Math.abs(endPos - startPos) > k) {
            return 0;
        }
        int[][] dp = new int[k + 1][2 * k + 1];
        dp[0][k] = 1;
        for (int i = 1; i <= k; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j < 2 * k; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000007;
            }
            dp[i][2 * k] = dp[i - 1][2 * k - 1];
        }
        return dp[k][endPos + k - startPos];
    }
}
