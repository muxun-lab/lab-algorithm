package org.muxun.algorithm.leetcode.java.backtrack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/1
 */
@DisplayName("分割回文串测试用例")
public class LeetCode131Test {

    @Test
    public void testOne() {
        String s = "aab";
        List<List<String>> expected = List.of(List.of("a", "a", "b"), List.of("aa", "b"));
        List<List<String>> res = new LeetCode131().partition(s);
    }

    @Test
    public void testTwo() {
        String s = "a";
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> res = new LeetCode131().partition(s);
    }
}
