package org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号：1449
 * 题目：数位成本和为目标值的最大数字
 * 题链：https://leetcode-cn.com/problems/form-largest-integer-with-digits-that-add-up-to-target/
 * 详情：给你一个整数数组 cost 和一个整数 target 。请你返回满足如下规则可以得到的 最大 整数：
 * * 给当前结果添加一个数位（i + 1）的成本为 cost[i] （cost 数组下标从 0 开始）
 * * 总成本必须恰好等于 target
 * * 添加的数位中没有数字 0
 * 由于答案可能会很大，请你以字符串形式返回
 * 如果按照上述要求无法得到任何整数，请你返回 "0"
 * @author sunshine
 * @created 2020-05-25
 */
public class FormLargestIntegerWithDigitsThatAddUpToTarget {

    /**
     * 思路：动态规划
     * @param cost   成本
     * @param target 目标值
     * @return 满足条件的最大整数
     */
    public String largestNumber(int[] cost, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // cst --> number
        for (int i = cost.length - 1; i >= 0; i--) {
            //cost数组中，相同的数字只留下下标大的数
            if (!map.containsKey(cost[i])) {
                map.put(cost[i], i + 1);
            }
        }
        //dp[i]表示cost为i时最大数字
        String[] dp = new String[target + 1];
        dp[0] = "";
        for (int i = 1; i <= target; i++) {
            for (int cst : map.keySet()) {
                if (cst <= i && dp[i - cst] != null) {
                    // 如果选择花掉这个成本，得到的数字
                    String b = dp[i - cst] + map.get(cst);
                    dp[i] = compare(dp[i], b);
                }
            }
        }
        return dp[target] == null ? "0" : dp[target];
    }

    //比较两个数的大小
    public String compare(String a, String b) {
        if (a == null) {
            return b;
        }
        if (a.length() > b.length()) {
            return a;
        }
        if (a.length() == b.length()) {
            if (a.compareTo(b) > 0) {
                return a;
            } else {
                return b;
            }
        }
        return b;
    }
}
