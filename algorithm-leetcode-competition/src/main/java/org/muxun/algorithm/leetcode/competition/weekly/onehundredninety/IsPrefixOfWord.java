package org.muxun.algorithm.leetcode.competition.weekly.onehundredninety;

/**
 * 题号：5416
 * 题目：检查单词是否为句中其他单词的前缀
 * 题链：https://leetcode-cn.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 * 详情：给你一个字符串 sentence 作为句子并指定检索词为 searchWord
 * 其中句子由若干用 单个空格 分隔的单词组成
 * 请你检查检索词 searchWord 是否为句子 sentence 中任意单词的前缀
 * * 如果 searchWord 是某一个单词的前缀，则返回句子 sentence 中该单词所对应的下标（下标从 1 开始）
 * * 如果 searchWord 是多个单词的前缀，则返回匹配的第一个单词的下标（最小下标）
 * * 如果 searchWord 不是任何单词的前缀，则返回 -1
 * @author sunshine
 * @created 2020-05-24
 */
public class IsPrefixOfWord {

    /**
     * 思路：迭代
     * @param sentence   含有多个单词的语句
     * @param searchWord 需要匹配的前缀
     * @return 前缀是否匹配，及第一次匹配的单词位置
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        if (sentence.length() <= 0) {
            return -1;
        }
        if (searchWord.length() <= 0) {
            return -1;
        }
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            String current = sentenceArray[i];
            if (current.length() >= searchWord.length() && current.startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
