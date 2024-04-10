package org.muxun.algorithm.leetcode.java.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-10
 */
@DisplayName("修改后的最大二进制字符串测试用例")
public class LeetCode1702Test {

    @Test
    public void testOne() {
        String binary = "000110";
        String expected = "111011";
        String res = new LeetCode1702().maximumBinaryString(binary);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String binary = "01";
        String expected = "01";
        String res = new LeetCode1702().maximumBinaryString(binary);
        Assertions.assertEquals(expected, res);
    }
}
