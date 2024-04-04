package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号：8
 * 题目：字符串转整数(atoi)
 * 详情：请你来实现一个atoi函数，使其能将字符串转换成整数
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换
 * 在任何情况下，若函数不能进行有效的转换时，请返回0
 * 说明：
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为[−231,  231 − 1]
 * 如果数值超过这个范围，请返回INT_MAX(231 − 1)或INT_MIN(−231)
 * @author 慕勋
 * @created 2020-03-18
 */
public class MyAtoi {

    /**
     * 思路：缝缝补补
     * @param str 需要转换为数字的字符串
     * @return 转换成的字符串
     */
    public int myAtoi(String str) {
        int negative = -1;
        boolean hasNumber = false;
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != ' ') {
                if (((int) current) >= 48 && ((int) current) <= 57) {
                    numberBuilder.append(current);
                    hasNumber = true;
                } else if (!hasNumber && current == '-') {
                    if (negative < 0) {
                        negative = 2;
                    } else {
                        return 0;
                    }
                    hasNumber = true;
                } else if (!hasNumber && current == '+') {
                    if (negative < 0) {
                        negative = 1;
                    } else {
                        return 0;
                    }
                    hasNumber = true;
                } else {
                    break;
                }
            } else if (hasNumber) {
                break;
            }
        }
        if (numberBuilder.length() <= 0) {
            return 0;
        }
        // 去除前面的无效的0
        int zeroIndex = 0;
        for (int i = 0; i < numberBuilder.length(); i++) {
            int current = numberBuilder.charAt(i);
            if (current == 48) {
                zeroIndex++;
            } else {
                break;
            }
        }
        if (zeroIndex > 0) {
            numberBuilder = new StringBuilder(numberBuilder.substring(zeroIndex, numberBuilder.length()));
        }
        if (numberBuilder.length() <= 0) {
            return 0;
        }
        if (numberBuilder.length() > 10) {
            return negative == 2 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } else if (numberBuilder.length() == 10) {
            String max = negative == 2 ? "2147483648" : "2147483647";
            int i = 0;
            while (i < 10) {
                int temp = numberBuilder.charAt(i);
                int standard = max.charAt(i);
                if (temp > standard) {
                    return negative == 2 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else {
                    if (temp != standard) {
                        break;
                    }
                }
                i++;
            }
        }
        if (negative == 2) {
            numberBuilder = new StringBuilder("-").append(numberBuilder);
        }
        return Integer.parseInt(numberBuilder.toString());
    }

    /**
     * 思路：缝缝补补
     * @param str 需要转换为数字的字符串
     * @return 转换成的字符串
     */
    public int myAtoiSimplify(String str) {
        if (str == null) {
            return 0;
        }
        int n = str.length();
        int i = 0;
        boolean isNegative = false;
        // 去掉前面的空格
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }
        // 如果全是" "字符串，则返回0
        if (i == n) {
            return 0;
        }
        // 判断正负号
        if (str.charAt(i) == '-') {
            isNegative = true;
        }
        // 碰到正负号跳过一位
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            i++;
        }
        // 判断字符是否处于0~9之间以及Integer范围内
        int result = 0;
        while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int current = str.charAt(i) - 48;
            if (!isNegative && (result > 214748364 || (result == 214748364 && current >= 7))) {
                return 2147483647;
            }
            if (isNegative && (-result < -214748364 || (-result == -214748364 && current >= 8))) {
                return -2147483648;
            }
            result = result * 10 + current;
            i++;
        }
        if (isNegative) {
            return -result;
        }
        return result;
    }
}
