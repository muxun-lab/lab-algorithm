package org.muxun.algorithm.leetcode.java.greedy;

/**
 * 题号：1221
 * 题目：分割平衡字符串
 * 详情：在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量。
 * <p>
 * 写完之后发现，中文翻译的根本不对
 * 对比了下英文，发现需要剩余的部分，L R个数也要相同
 * 注意，不是要求RRRLLL这样的相同，而仅仅是要求L R的个数相同
 * @author 慕勋
 * @created 2020-02-14
 */
public class BalanceStringSplit {

    /**
     * 思路：考虑字符个数相等，则分别计算L、R字符的个数，如果两个字符个数相等，相当于可以进行一次分割
     * @param s 给定的平衡字符串
     * @return 可分割的平衡字符串的最大数量
     */
    public int balancedStringSplit(String s) {
        int countL = 0;
        int countR = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                countL++;
            }
            if (s.charAt(i) == 'R') {
                countR++;
            }
            if (countL == countR) {
                sum++;
            }
        }
        return sum;
    }

    /**
     * 思路：
     * @param s 给定的平衡字符串
     * @return 可分割的平衡字符串的最大数量
     */
    public int balancedStringSplitOld(String s) {
        if (s.length() <= 1) {
            return 0;
        }
        int index = 1;
        int max = 0;
        while (s.length() > 1) {
            char head = s.charAt(0);
            if (s.charAt(index) == head) {
                index++;
            } else {
                boolean flag = true;
                for (int i = 0; i < index; i++) {
                    if (s.charAt(i) == s.charAt(i + index)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    s = s.substring(2 * index);
                    max++;
                } else {
                    s = s.substring(index);
                }
                index = 1;
            }
        }
        return max;
    }
}
