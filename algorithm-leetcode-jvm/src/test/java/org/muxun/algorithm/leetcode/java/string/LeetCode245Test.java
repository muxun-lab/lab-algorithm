package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-15
 */
@DisplayName("最短单词距离 III")
public class LeetCode245Test {

    @Test
    public void testOne() {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        int expected = 1;
        int res = new LeetCode245().shortestWordDistance(wordsDict, word1, word2);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "makes";
        int expected = 3;
        int res = new LeetCode245().shortestWordDistance(wordsDict, word1, word2);
        Assertions.assertEquals(expected, res);
    }
}
