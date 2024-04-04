package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号: 1997
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/first-day-where-you-have-been-in-all-the-rooms">访问完所有房间的第一天</a>
 * <p>
 * 详情: 你需要访问 n 个房间，房间从 0 到 n - 1 编号。同时，每一天都有一个日期编号，从 0 开始，依天数递增。你每天都会访问一个房间。
 * <p>
 * 最开始的第 0 天，你访问 0 号房间。给你一个长度为 n 且 下标从 0 开始 的数组 nextVisit 。在接下来的几天中，你访问房间的 次序 将根据下面的 规则 决定：
 * <li> 假设某一天，你访问 i 号房间。
 * <li> 如果算上本次访问，访问 i 号房间的次数为 奇数 ，那么 第二天 需要访问 nextVisit[i] 所指定的房间，其中 0 <= nextVisit[i] <= i 。
 * <li> 如果算上本次访问，访问 i 号房间的次数为 偶数 ，那么 第二天 需要访问 (i + 1) mod n 号房间。
 * 请返回你访问完所有房间的第一天的日期编号。题目数据保证总是存在这样的一天。由于答案可能很大，返回对 10 ^ 9 + 7 取余后的结果。
 * @author 慕勋
 * @created 2024-03-28
 */
public class LeetCode1997 {

    private static final int MOD = 1000000007;

    /**
     * 思路: 前缀和 + 动态规划
     * @param nextVisit 访问顺序
     * @return 访问次数
     */
    public int firstDayBeenInAllRooms(int[] nextVisit) {
        int n = nextVisit.length;
        int[] dp = new int[n];
        dp[0] = 2;
        for (int i = 1; i < n; i++) {
            int to = nextVisit[i];
            dp[i] = dp[i - 1] + 2;
            if (to != 0) {
                dp[i] = (dp[i] - dp[i - 1] + MOD) % MOD;
            }
            dp[i] = (dp[i] + dp[i - 1]) % MOD;
        }
        return dp[n - 2];
    }
}
