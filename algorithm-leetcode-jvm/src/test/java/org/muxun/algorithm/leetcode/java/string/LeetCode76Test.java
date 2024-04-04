package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/16
 */
@DisplayName("最小覆盖子串测试用例")
public class LeetCode76Test {

    @Test
    public void testOne() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = new LeetCode76().minWindow(s, t);
        String expected = "BANC";
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "a";
        String t = "a";
        String res = new LeetCode76().minWindow(s, t);
        String expected = "a";
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String s = "a";
        String t = "aa";
        String res = new LeetCode76().minWindow(s, t);
        String expected = "";
        Assertions.assertEquals(expected, res);
    }
}
