package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightynine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightynine.LeetCode100236;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("统计以给定字符开头和结尾的子字符串总数测试用例")
public class LeetCode100236Test {

    @Test
    public void testOne() {
        String s = "abada";
        char c = 'a';
        long expected = 6;
        long res = new LeetCode100236().countSubstrings(s, c);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "zzz";
        char c = 'z';
        long expected = 6;
        long res = new LeetCode100236().countSubstrings(s, c);
        Assertions.assertEquals(expected, res);
    }
}
