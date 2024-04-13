package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentysix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentysix.LeetCode100249;

/**
 * @author 慕勋
 * @created 2024-03-16
 */
@DisplayName("替换字符串中的问号使分数最小测试用例")
public class LeetCode100249Test {

    @Test
    public void testOne() {
        String s = "???";
        String expected = "abc";
        String res = new LeetCode100249().minimizeStringValue(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "a?a?";
        String expected = "abac";
        String res = new LeetCode100249().minimizeStringValue(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String s = "abcdefghijklmnopqrstuvwxy??";
        String expected = "abcdefghijklmnopqrstuvwxyaz";
        String res = new LeetCode100249().minimizeStringValue(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        String s = "g?xvgroui??xk?zqb?da?jan?cdhtksme";
        String expected = "gbxvgrouicfxklzqbpdawjanycdhtksme";
        String res = new LeetCode100249().minimizeStringValue(s);
        Assertions.assertEquals(expected, res);
    }
}
