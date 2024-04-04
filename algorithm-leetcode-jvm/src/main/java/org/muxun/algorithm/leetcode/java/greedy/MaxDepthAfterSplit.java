package org.muxun.algorithm.leetcode.java.greedy;

import java.util.LinkedList;

/**
 * 题号：1111
 * 题目：有效括号的嵌套深度
 * 链接：https://leetcode-cn.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
 * 详情：
 * 有效括号字符串：对于每个左括号，都能找到与之对应的右括号，反之亦然。详情参见题末「有效括号字符串」部分
 * 嵌套深度depth：即有效括号字符串嵌套的层数，depth(A)表示有效括号字符串A的嵌套深度
 * 给你一个「有效括号字符串」seq，请你将其分成两个不相交的有效括号字符串，A 和 B，并使这两个字符串的深度最小
 * * 不相交：每个 seq[i] 只能分给 A 和 B 二者中的一个，不能既属于 A 也属于 B 。
 * * A 或 B 中的元素在原字符串中可以不连续
 * * A.length + B.length = seq.length
 * * 深度最小：max(depth(A), depth(B)) 的可能取值最小
 * 划分方案用一个长度为seq.length的答案数组answer表示，编码规则如下：
 * * answer[i] = 0，seq[i]分给A
 * * answer[i] = 1，seq[i]分给B
 * 如果存在多个满足要求的答案，只需返回其中任意一个即可
 * @author 慕勋
 * @created 2020-04-01
 */
public class MaxDepthAfterSplit {

    /**
     * 思路：栈
     * 先把深度标出来，然后按照奇偶分组
     * @param seq 给定的()字符串序列
     * @return 两个最小深度分配的字符串
     */
    public int[] maxDepthAfterSplit(String seq) {
        if (seq.length() <= 0) {
            return new int[0];
        }
        LinkedList<Character> stack = new LinkedList<>();
        int[] res = new int[seq.length()];
        char[] charArray = seq.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '(') {
                res[i] = stack.size() % 2;
                stack.push(c);
            } else {
                stack.pop();
                res[i] = stack.size() % 2;
            }
        }
        return res;
    }

    /**
     * 思路：我的答案的简化版
     * 先把深度标出来，然后按照奇偶分组
     * @param seq 给定的()字符串序列
     * @return 两个最小深度分配的字符串
     */
    public int[] maxDepthAfterSplitUpgrade(String seq) {
        int[] ans = new int[seq.length()];
        int idx = 0;
        for (char c : seq.toCharArray()) {
            ans[idx++] = c == '(' ? idx & 1 : ((idx + 1) & 1);
        }
        return ans;
    }
}
