package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/16
 */
@DisplayName("找到字符串中所有字母异位词测试用例")
public class LeetCode438Test {

    @Test
    public void testOne() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> resList = new LeetCode438().findAnagrams(s, p);
        List<Integer> expected = List.of(0, 6);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        String s = "abab";
        String p = "ab";
        List<Integer> resList = new LeetCode438().findAnagrams(s, p);
        List<Integer> expected = List.of(0, 1, 2);
        Assertions.assertIterableEquals(expected, resList);
    }
}
