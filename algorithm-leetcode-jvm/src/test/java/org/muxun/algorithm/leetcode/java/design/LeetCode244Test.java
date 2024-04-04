package org.muxun.algorithm.leetcode.java.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("最短单词距离 II测试用例")
public class LeetCode244Test {

    @Test
    public void testOne() {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        int expected1 = 3;
        int expected2 = 1;
        LeetCode244 wordDistance = new LeetCode244(wordsDict);
        String word1 = "coding";
        String word2 = "practice";
        int res1 = wordDistance.shortest(word1, word2);
        word1 = "makes";
        word2 = "coding";
        int res2 = wordDistance.shortest(word1, word2);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
    }
}
