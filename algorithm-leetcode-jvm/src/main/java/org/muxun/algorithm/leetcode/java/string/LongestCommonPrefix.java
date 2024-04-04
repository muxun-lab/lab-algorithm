package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号：14
 * 题目：最长公共前缀
 * 详情：编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @author 慕勋
 * @created 2020-02-17
 */
public class LongestCommonPrefix {

    /**
     * 思路：两两个进行比较，然后将算出的子串依次往下传
     * @param strs 字符串数组
     * @return 最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        if (strs.length <= 0) {
            return longestCommonPrefix;
        }
        longestCommonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            if (current.length() == 0) {
                return "";
            }
            while (longestCommonPrefix.length() > 0) {
                // 如果命中前缀，则直接进行下一轮遍历
                if (current.startsWith(longestCommonPrefix)) {
                    break;
                }
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
            }
            if (longestCommonPrefix.length() == 0) {
                break;
            }
        }
        return longestCommonPrefix;
    }
}
