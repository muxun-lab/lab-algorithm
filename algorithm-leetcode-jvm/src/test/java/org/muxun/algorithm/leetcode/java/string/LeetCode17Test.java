package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-03-06
 */
@DisplayName("电话号码的字母组合测试用例")
public class LeetCode17Test {

    @Test
    public void testOne() {
        String digits = "23";
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> resList = new LeetCode17().letterCombinations(digits);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        String digits = "";
        List<String> expected = List.of();
        List<String> resList = new LeetCode17().letterCombinations(digits);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        String digits = "2";
        List<String> expected = List.of("a", "b", "c");
        List<String> resList = new LeetCode17().letterCombinations(digits);
        Assertions.assertIterableEquals(expected, resList);
    }
}
