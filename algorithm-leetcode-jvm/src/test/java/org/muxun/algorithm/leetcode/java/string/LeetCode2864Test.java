package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-14
 */
@DisplayName("最大二进制奇数测试用例")
public class LeetCode2864Test {

    @Test
    public void testOne() {
        String s = "010";
        String expected = "001";
        String res = new LeetCode2864().maximumOddBinaryNumber(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "0101";
        String expected = "1001";
        String res = new LeetCode2864().maximumOddBinaryNumber(s);
        Assertions.assertEquals(expected, res);
    }
}
