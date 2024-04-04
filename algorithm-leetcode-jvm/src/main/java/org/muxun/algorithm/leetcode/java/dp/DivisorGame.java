package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：1025
 * 题目：除数博弈
 * 详情：爱丽丝和鲍勃一起玩游戏，他们轮流行动，爱丽丝先手开局
 * 最初，黑板上有一个数字N
 * 在每个玩家的回合，玩家需要执行以下操作：
 * * 选出任一x，满足0 < x < N且N % x == 0
 * * 用N - x替换黑板上的数字N
 * 如果玩家无法执行这些操作，就会输掉游戏
 * 只有在爱丽丝在游戏中取得胜利时才返回True，否则返回 false，假设两个玩家都以最佳状态参与游戏
 * @author 慕勋
 * @created 2020-03-17
 */
public class DivisorGame {

    /**
     * 思路：动态规划
     * 状态定义：dp[i]记录Alice是否获胜
     * 转移方程：如果dp[i]为Alice选取，d[n-i]为Bob获胜，若dp[n-i]=false，则dp[i]=true
     * 初始值：dp[1]=false, dp[2]=true;
     * 返回值：dp[N]
     * @param N 游戏边界
     * @return 爱丽丝能否赢得游戏
     */
    public boolean divisorGame(int N) {
        if (N <= 1) {
            return false;
        }
        boolean[] dp = new boolean[N + 1];
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i < N + 1; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];
    }
}
