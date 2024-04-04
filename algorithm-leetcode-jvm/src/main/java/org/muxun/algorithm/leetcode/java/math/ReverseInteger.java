package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号：7
 * 题目：整数反转
 * 题链：https://leetcode-cn.com/problems/reverse-integer/
 * 详情：给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * @author 慕勋
 * @date 2020/6/3
 */
public class ReverseInteger {

    /**
     * 思路：
     * @param x 需要进行反转的数字
     * @return 反转之后的数字
     */
    public int reverse(int x) {
        String num = String.valueOf(x);
        boolean negative = num.startsWith("-");
        if (negative) {
            num = num.substring(1);
        }
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(num);
        resultBuilder.reverse();
        String max = negative ? String.valueOf(Integer.MIN_VALUE).substring(1) : String.valueOf(Integer.MAX_VALUE);
        if (resultBuilder.length() > max.length()) {
            return 0;
        }
        int abs;
        if (resultBuilder.length() < max.length()) {
            abs = Integer.parseInt(resultBuilder.toString());
            return negative ? -abs : abs;
        }
        for (int i = 0; i < resultBuilder.length(); i++) {
            if (resultBuilder.charAt(i) > max.charAt(i)) {
                return 0;
            }
            if (resultBuilder.charAt(i) < max.charAt(i)) {
                break;
            }
        }
        abs = Integer.parseInt(resultBuilder.toString());
        return negative ? -abs : abs;
    }

    /**
     * 思路：数学思路，尾部转移法
     * @param x 需要进行反转的数字
     * @return 反转之后的数字
     */
    public int reverseOptimization(int x) {
        int result = 0;
        while (x != 0) {
            int last = x % 10;
            // 进行范围检查
            if (result > 214748364 || (result == 214748364 && last > 7)) {
                return 0;
            }
            if (result < -214748364 || (result == -214748364 && last < -8)) {
                return 0;
            }
            // 进行尾部参数转移，直接加入到新的数的头部
            result = result * 10 + last;
            x = x / 10;
        }
        return result;
    }
}
