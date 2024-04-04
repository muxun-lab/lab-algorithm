package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/19
 */
@DisplayName("字母异位词分组测试用例")
public class LeetCode49Test {

    @Test
    public void testOne() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        List<List<String>> resList = new LeetCode49().groupAnagrams(strs);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        String[] strs = {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> resList = new LeetCode49().groupAnagrams(strs);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        String[] strs = {""};
        List<List<String>> expected = List.of(List.of(""));
        List<List<String>> resList = new LeetCode49().groupAnagrams(strs);
        Assertions.assertIterableEquals(expected, resList);
    }
}
