package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyeight.LeetCode100251;

/**
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("数组中的最短非公共子字符串测试用例")
public class LeetCode100251Test {

    @Test
    public void testOne() {
        String[] arr = {"cab", "ad", "bad", "c"};
        String[] expected = {"ab", "", "ba", ""};
        String[] resArr = new LeetCode100251().shortestSubstrings(arr);
        Assertions.assertArrayEquals(expected, resArr);
    }

    @Test
    public void testTwo() {
        String[] arr = {"abc", "bcd", "abcd"};
        String[] expected = {"", "", "abcd"};
        String[] resArr = new LeetCode100251().shortestSubstrings(arr);
        Assertions.assertArrayEquals(expected, resArr);
    }
}
