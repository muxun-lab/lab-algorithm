package org.muxun.algorithm.leetcode.competition.weekly.onehundredseventynine;

/**
 * 题号：5352
 * 题目：生成每种字符都是奇数个的字符串
 * 详情：给你一个整数 n，请你返回一个含 n 个字符的字符串
 * 其中每种字符在该字符串中都恰好出现 奇数次
 * 返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可
 * <p>
 * 提示：
 * * 1 <= n <= 500
 * @author sunshine
 * @created 2020-03-08
 */
public class GenerateTheString {

    /**
     * @param n
     * @return
     */
    public String generateTheString(int n) {
        if (n == 1) {
            return "a";
        }
        String first = "a";
        String second = "b";
        StringBuilder resultBuilder = new StringBuilder();
        if (n % 2 != 0) {
            resultBuilder.append("c");
        }
        int center = n % 2 != 0 ? (n - 1) / 2 : n / 2;
        int firstCapSize;
        int secondCapSize;
        if (center % 2 == 0) {
            firstCapSize = center + 1;
            secondCapSize = center - 1;
        } else {
            firstCapSize = center;
            secondCapSize = center;
        }
        for (int i = 0; i < firstCapSize; i++) {
            resultBuilder.append(first);
        }
        for (int i = 0; i < secondCapSize; i++) {
            resultBuilder.append(second);
        }
        return resultBuilder.toString();
    }
}
