package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightynine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightynine.LeetCode100248;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("字符串及其反转中是否存在同一子字符串测试用例")
public class LeetCode100248Test {

    @Test
    public void testOne() {
        String s = "ausoee";
        boolean expected = true;
        boolean res = new LeetCode100248().isSubstringPresent(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "leetcode";
        boolean expected = true;
        boolean res = new LeetCode100248().isSubstringPresent(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String s = "abcba";
        boolean expected = true;
        boolean res = new LeetCode100248().isSubstringPresent(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        String s = "abcd";
        boolean expected = false;
        boolean res = new LeetCode100248().isSubstringPresent(s);
        Assertions.assertEquals(expected, res);
    }
}
