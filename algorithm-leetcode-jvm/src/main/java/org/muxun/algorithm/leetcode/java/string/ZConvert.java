package org.muxun.algorithm.leetcode.java.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：6
 * 题目：Z字形变换
 * 详情：将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * @author 慕勋
 * @created 2020-02-12
 */
public class ZConvert {

    /**
     * 思路：SUNSHINE
     * 相当于按顺序从1到numRows每行写入到S[1]到S[numRows]数组中，然后再折回来，从S[numRows-1]写入到S[1]数组中
     * [1]代表第几行
     * @param s       给定的字符串
     * @param numRows Z的行数
     * @return Z的从左到右输出字符串
     */
    public String convert(String s, int numRows) {
        if (s.length() < numRows || numRows < 2) {
            return s;
        }
        List<StringBuilder> rowsStringList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rowsStringList.add(new StringBuilder());
        }
        int n = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            rowsStringList.get(n).append(c);
            if (n == 0 || n == numRows - 1) {
                flag = -flag;
            }
            n += flag;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : rowsStringList) {
            result.append(stringBuilder);
        }
        return result.toString();
    }
}
