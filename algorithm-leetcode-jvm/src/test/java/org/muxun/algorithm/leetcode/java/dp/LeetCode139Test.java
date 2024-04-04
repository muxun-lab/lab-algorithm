package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("LeetCode 139题测试用例")
public class LeetCode139Test {

    @Test
    public void testOne() {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        boolean expected = true;
        boolean res = new LeetCode139().wordBreak(s, wordDict);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");
        boolean expected = true;
        boolean res = new LeetCode139().wordBreak(s, wordDict);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        boolean expected = false;
        boolean res = new LeetCode139().wordBreak(s, wordDict);
        Assertions.assertEquals(expected, res);
    }
}
