package org.muxun.algorithm.leetcode.competition.doubleweekly.twentyone;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 题号：5336
 * 题目：上升下降字符串
 * 详情：
 * 给你一个字符串 s ，请你根据下面的算法重新构造字符串：
 * 1. 从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
 * 2. 从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
 * 3. 重复步骤 2 ，直到你没法从 s 中选择字符。
 * 4. 从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
 * 5. 从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
 * 6. 重复步骤 5 ，直到你没法从 s 中选择字符。
 * 7. 重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
 * 在任何一步中，如果最小或者最大字符不止一个 ，你可以选择其中任意一个，并将其添加到结果字符串。
 * <p>
 * 请你返回将 s 中字符重新排序后的 结果字符串 。
 * <p>
 * 提示：
 * 1 <= s.length <= 500
 * s 只包含小写英文字母。
 * @author sunshine
 * @created 2020-03-07
 */
public class SortString {

    /**
     * 思路：队列
     * 抽取一个字符，并进行移除
     * @param s 给定需要进行规则排列的字符串
     * @return 规则排列后的字符串
     */
    public String sortString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] array = s.toCharArray();
        Arrays.sort(array);
        LinkedList<Character> queue = new LinkedList<>();
        for (char c : array) {
            queue.add(c);
        }
        StringBuilder resultBuilder = new StringBuilder();
        while (!queue.isEmpty()) {
            resultBuilder.append(smallToLarge(queue));
            resultBuilder.append(largeToSmall(queue));
        }
        return resultBuilder.toString();
    }

    /**
     * 由小到大
     * @param queue 候选队列
     * @return 抽取的由小到大字符串
     */
    private String smallToLarge(LinkedList<Character> queue) {
        if (queue.size() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char smallest = queue.removeFirst();
        result.append(smallest);
        int count = 0;
        while (count < queue.size()) {
            boolean needRemove = false;
            // 获取最后一次出现的位置
            for (int i = count; i < queue.size(); i++) {
                char current = queue.get(i);
                if (result.indexOf(String.valueOf(current)) == -1) {
                    needRemove = true;
                    smallest = current;
                    break;
                }
                count++;
            }
            if (needRemove) {
                queue.removeFirstOccurrence(smallest);
                result.append(smallest);
            }
        }
        return result.toString();
    }

    /**
     * 由大到小
     * @param queue 候选队列
     * @return 抽取的由大到小字符串
     */
    private String largeToSmall(LinkedList<Character> queue) {
        if (queue.size() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char smallest = queue.removeLast();
        result.append(smallest);
        int count = queue.size() - 1;
        while (count >= 0) {
            boolean needRemove = false;
            for (int i = count; i >= 0; i--) {
                char current = queue.get(i);
                count--;
                if (result.indexOf(String.valueOf(current)) == -1) {
                    needRemove = true;
                    smallest = current;
                    break;
                }
            }
            if (needRemove) {
                queue.removeLastOccurrence(smallest);
                result.append(smallest);
            }
        }
        return result.toString();
    }
}
