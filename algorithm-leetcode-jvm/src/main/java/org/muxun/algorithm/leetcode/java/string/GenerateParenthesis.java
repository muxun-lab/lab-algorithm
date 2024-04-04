package org.muxun.algorithm.leetcode.java.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：22
 * 题目：括号生成
 * 详情：给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 例如：给出n=3，生成的结果为：
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * @author 慕勋
 * @created 2020-03-13
 */
public class GenerateParenthesis {

    int maxLength = 0;

    /**
     * 思路：回溯
     * @param n 给定的需要生成括号的对数
     * @return 所有可能切有效的括号组合情况
     */
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        if (n <= 1) {
            return new ArrayList<>() {{
                add("()");
            }};
        }
        List<String> resultList = new ArrayList<>();
        // 实际需要组合的()，因为字符串的开始必然是"("，结束必然是")"
        List<String> selectList = new ArrayList<>() {
            {
                add("(");
                add(")");
            }
        };
        maxLength = 2 * n;
        String backtrack = "(";
        backtrack(selectList, backtrack, resultList);
        return resultList;
    }

    private void backtrack(List<String> selectList, String backtrack, List<String> resultList) {
        if (backtrack.length() == maxLength - 1) {
            backtrack += ")";
            if (isComplete(backtrack)) {
                resultList.add(backtrack);
            }
            return;
        }
        for (int i = 0; i < selectList.size(); i++) {
            backtrack += selectList.get(i);
            backtrack(selectList, backtrack, resultList);
            backtrack = backtrack.substring(0, backtrack.length() - 1);
        }
    }

    private boolean isComplete(String str) {
        int leftCount = 0, rightCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftCount++;
            } else {
                rightCount++;
            }
            if (leftCount < rightCount) {
                return false;
            }
        }
        return leftCount == rightCount;
    }

    /**
     * 思路：回溯优化
     * 对于下一个位置，可以这么做：
     * * 没有超过最大数量，放置一个"("
     * * 没有超过左括号的数量，可以放置一个")"
     * @param n 给定的需要生成括号的对数
     * @return 所有可能切有效的括号组合情况
     */
    public List<String> generateParenthesisBacktrackUpgrade(int n) {
        List<String> resultList = new ArrayList<>();
        backtrack(resultList, "", 0, 0, n);
        return resultList;
    }

    private void backtrack(List<String> resultList, String backtrack, int leftCount, int rightCount, int max) {
        if (backtrack.length() == max * 2) {
            resultList.add(backtrack);
            return;
        }
        if (leftCount < max) {
            backtrack += "(";
            backtrack(resultList, backtrack, ++leftCount, rightCount, max);
        }
        if (rightCount < leftCount) {
            backtrack += ")";
            backtrack(resultList, backtrack, leftCount, ++rightCount, max);
        }
    }

    /**
     * 思路：闭合数
     * 总体思路不变，但是分别计算左括号和右括号的情况，放入到=>"(" + "左括号解" + ")" + "右括号解" 的公式中
     * 对于任意一个括号组合，若left，right两部分组合的括号总数有n-1对，那么新的组合"(" + "左括号解" + ")" + "右括号解"则有n对
     * 将对n对括号组合，转化为n-1对的求解，以此类推
     * @param n 给定的需要生成括号的对数
     * @return 所有可能切有效的括号组合情况
     */
    public List<String> generateParenthesisUpgrade(int n) {
        List<String> resultList = new ArrayList<>();
        if (n == 0) {
            resultList.add("");
        }
        for (int i = 0; i < n; i++) {
            // 左括号的生成数量
            for (String left : generateParenthesisUpgrade(i)) {
                // 右括号的生成数量
                for (String right : generateParenthesisUpgrade(n - i - 1)) {
                    resultList.add("(" + left + ")" + right);
                }
            }
        }
        return resultList;
    }
}
