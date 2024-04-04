package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号：9
 * 题目：回文数
 * 详情：判断一个整数是否是回文数。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 * @author 慕勋
 * @created 2020-03-07
 */
public class IntegerIsPalindrome {

    /**
     * 思路：反转字符串
     * @param x 给定的整数
     * @return 给定的整数是否是回文字符串
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        StringBuilder tempBuilder = new StringBuilder(String.valueOf(x));
        long reverse = Long.parseLong(tempBuilder.reverse().toString());
        return reverse - x == 0;
    }

    /**
     * 思路：对半比较
     * 将数折过来应该是相等的
     * @param x 给定的整数
     * @return 给定的整数是否是回文字符串
     */
    public boolean isPalindromeUpgrade(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        // 末尾为0的数，必不可能是回文数
        if (x % 10 == 0) {
            return false;
        }
        int y = 0;
        // 此处拿1221举例
        while (x > y) {
            // y = 1 x = 122
            // y = 12 x = 12
            y = y * 10 + x % 10;
            x = x / 10;
        }
        // 再以121举例
        // y = 1 x = 12
        // y = 12 x= 1
        // 偶数位比较 x == y
        // 奇数位需要将回文数中的共同位去掉，所以 x == y / 10
        return x == y || x == y / 10;
    }
}
