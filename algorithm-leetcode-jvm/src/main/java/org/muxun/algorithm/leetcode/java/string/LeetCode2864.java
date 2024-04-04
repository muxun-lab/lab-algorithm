package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号: 2864
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/maximum-odd-binary-number">最大二进制奇数</a>
 * <p>
 * 详情: 给你一个 二进制 字符串 s ，其中至少包含一个 '1' 。
 * <p>
 * 你必须按某种方式 重新排列 字符串中的位，使得到的二进制数字是可以由该组合生成的 最大二进制奇数 。
 * <p>
 * 以字符串形式，表示并返回可以由给定组合生成的最大二进制奇数。
 * <p>
 * 注意 返回的结果字符串 可以 含前导零。
 * @author 慕勋
 * @created 2024-03-14
 */
public class LeetCode2864 {

    /**
     * 思路: 计算1的个数，把1排在前面即为最大，同时需要留1个1给最后一位作为奇数
     * @param s 二进制字符串
     * @return 最大二进制奇数
     */
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int count = 0;
        for (char c : s.toCharArray()) {
            count += c - '0';
        }
        return "1".repeat(count - 1) + "0".repeat(n - count) + "1";
    }
}
