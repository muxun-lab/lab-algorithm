package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-01
 */
@DisplayName("故障键盘测试用例")
public class LeetCode2810Test {

    @Test
    public void testOne() {
        String s = "string";
        String expected = "rtsng";
        String res = new LeetCode2810().finalString(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "poiinter";
        String expected = "ponter";
        String res = new LeetCode2810().finalString(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String s = "string";
        String expected = "rtsng";
        String res = new LeetCode2810().finalStringByDeque(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        String s = "poiinter";
        String expected = "ponter";
        String res = new LeetCode2810().finalStringByDeque(s);
        Assertions.assertEquals(expected, res);
    }
}
