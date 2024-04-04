package org.muxun.algorithm.leetcode.java.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：43
 * 题目：字符串相乘
 * 详情：给定两个以字符串形式表示的非负整数 num1 和 num2
 * 返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式
 * <p>
 * 说明：
 * * num1 和 num2 的长度小于110。
 * * num1 和 num2 只包含数字 0-9。
 * * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 * @author 慕勋
 * @created 2020-02-21
 */
public class StringMultiply {

    /**
     * 思路：乘法公式
     * @param num1 非负整数
     * @param num2 非负整数
     * @return 两个非负整数的乘积
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        List<StringBuilder> tempList = new ArrayList<>();
        StringBuilder zero = new StringBuilder();
        for (int i = num2.length() - 1; i >= 0; i--) {
            int left = num2.charAt(i) - '0';
            StringBuilder tempZero = new StringBuilder(zero.toString());
            for (int j = num1.length() - 1; j >= 0; j--) {
                int right = num1.charAt(j) - '0';
                int product = left * right;
                StringBuilder productBuilder = new StringBuilder();
                // 用String补0
                productBuilder.append(product);
                productBuilder.append(tempZero);
                tempList.add(productBuilder);
                tempZero.append("0");
            }
            zero.append("0");
        }
        // 加String
        String sum = "0";
        for (StringBuilder stringBuilder : tempList) {
            sum = addString(sum, stringBuilder.toString());
        }
        return sum;
    }

    /**
     * @return 字符串按位相加
     */
    public String addString(String num1, String num2) {
        StringBuilder sumBuilder = new StringBuilder();
        int start = 0;
        boolean flag = false;
        while (start < num1.length() || start < num2.length()) {
            int sum = 0;
            // 需要进位
            if (flag) {
                sum += 1;
            }
            if (start < num1.length()) {
                int leftIndex = num1.length() - start - 1;
                int left = num1.charAt(leftIndex) - '0';
                sum += left;
            }
            if (start < num2.length()) {
                int rightIndex = num2.length() - start - 1;
                int right = num2.charAt(rightIndex) - '0';
                sum += right;
            }
            // 取每一位的和
            flag = sum >= 10;
            sumBuilder.append(sum % 10);
            start++;
        }
        if (flag) {
            sumBuilder.append(1);
        }
        return sumBuilder.reverse().toString();
    }

    /**
     * 思路：优化乘法公式
     * 每一次乘法最多两位数
     * 每一位存储在[i+j][i+j+1上]，[i+j]需要计算出上一次计算的加和
     * @param num1 非负整数
     * @param num2 非负整数
     * @return 两个非负整数的乘积
     */
    public String multiplyUpgrade(String num1, String num2) {
        int n = num1.length() + num2.length();
        int[] tempArray = new int[n];
        boolean flag = false;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int left = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int right = num2.charAt(j) - '0';
                // 此时已经处理上一次的高位进位
                int sum = tempArray[i + j + 1] + left * right;
                tempArray[i + j] += sum / 10;
                tempArray[i + j + 1] = sum % 10;
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < tempArray.length; i++) {
            if (i == 0 && tempArray[i] == 0) {
                continue;
            }
            resultBuilder.append(tempArray[i]);
        }
        return resultBuilder.toString();
    }
}
