package org.muxun.algorithm.leetcode.java.array;

/**
 * 加一
 * 题目：No.66
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位，数组中每个元素只存储单个数字。
 * 你可以假设除了整数0之外，这个整数不会以零开头。
 * @author 慕勋
 * @date 2020/1/20
 */
public class PlusOne {

    /**
     * 1. 正常情况
     * 2. 99 => 100
     * 3. 49 => 50
     * @param digits 数组
     * @return +1处理后的数组
     */
    public int[] plusOne(int[] digits) {
        if (digits.length <= 0) {
            return new int[0];
        }
        // 正常情况
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        // 进位处理
        boolean append = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 1 && digits[i - 1] == 9) {
                append = true;
            }
            if (i == 0 && digits[i] == 9) {
                append = true;
            }
            digits[i] = 0;
            // 只有一次进位
            if (i > 0 && digits[i - 1] != 9) {
                digits[i - 1] = digits[i - 1] + 1;
                break;
            }
            // 多次进位，继续循环
            if (i > 0 && digits[i - 1] == 9) {
                digits[i - 1] = 0;
            }
        }
        if (append) {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            if (temp.length - 1 >= 0) {
                System.arraycopy(digits, 0, temp, 1, temp.length - 1);
            }
            return temp;
        }
        return digits;
    }
}
