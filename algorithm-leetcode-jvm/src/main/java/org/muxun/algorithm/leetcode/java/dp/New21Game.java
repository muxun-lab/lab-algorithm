package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：837
 * 题目：新21点
 * 题链：https://leetcode-cn.com/problems/new-21-game/
 * 详情：爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：
 * * 爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字
 * * 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计
 * * 其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率
 * * 当爱丽丝获得不少于 K 分时，她就停止抽取数字
 * * 爱丽丝的分数不超过 N 的概率是多少？
 * @author 慕勋
 * @date 2020/6/3
 */
public class New21Game {

    /**
     * 思路：动态规划
     * @param N 总分数
     * @param K 抽取阈值
     * @param W 抽取区间
     * @return 不超过N的概率
     */
    public double new21Game(int N, int K, int W) {
        double[] dp = new double[N + 1];
        for (int i = 0; i < N + 1; i++) {
            dp[i] = 1;
        }
        double sum = 0;
        // 窗口移动
        for (int i = 1; i < N + 1; i++) {
            if (i > W && i <= K + W) {
                // 左边窗口符合w中情况概率，窗口移动
                sum = sum - dp[i - W - 1];
            }
            if (i <= K) {
                // 左边不足W中概率，窗口右移，合并右侧新概率
                sum = sum + dp[i - 1];
            }
            dp[i] = sum / W;
        }
        double result = 0;
        int high = Math.min(K + W, N);
        // 获取最终结果
        for (int i = K; i <= high; i++) {
            result += dp[i];
        }
        return result;
    }
}
