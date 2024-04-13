package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyeight.LeetCode100270;

/**
 * @author 慕勋
 * @created 2024-04-13
 */
@DisplayName("字符串分数测试用例")
public class LeetCode100270Test {

    @Test
    public void testOne() {
        String s = "hello";
        int expected = 13;
        int res = new LeetCode100270().scoreOfString(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "zaz";
        int expected = 50;
        int res = new LeetCode100270().scoreOfString(s);
        Assertions.assertEquals(expected, res);
    }
}
