package org.muxun.algorithm.leetcode.competition.week.week.threehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredninety.LeetCode100245;

/**
 * @author 慕勋
 * @created 2024-03-24
 */
@DisplayName("每个字符最多出现两次的最长子字符串测试用例")
public class LeetCode100245Test {

    @Test
    public void testOne() {
        String s = "bcbbbcba";
        int expected = 4;
        int res = new LeetCode100245().maximumLengthSubstring(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "aaaa";
        int expected = 2;
        int res = new LeetCode100245().maximumLengthSubstring(s);
        Assertions.assertEquals(expected, res);
    }
}
