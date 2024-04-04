package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("最短单词距离测试用例")
public class LeetCode243Test {

    @Test
    public void testOne() {
        String[] wordDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        int expected = 3;
        int res = new LeetCode243().shortestDistance(wordDict, word1, word2);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String[] wordDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        int expected = 1;
        int res = new LeetCode243().shortestDistance(wordDict, word1, word2);
        Assertions.assertEquals(expected, res);
    }
}
