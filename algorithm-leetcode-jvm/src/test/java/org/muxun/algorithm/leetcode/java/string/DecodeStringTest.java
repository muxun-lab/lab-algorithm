package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/5/28
 */
@DisplayName("字符串解码")
public class DecodeStringTest {

    @Test
    public void decodeStringTestOne() {
        Assertions.assertEquals("aaabcbc", new DecodeString().decodeString("3[a]2[bc]"));
    }

    @Test
    public void decodeStringTestTwo() {
        Assertions.assertEquals("accaccacc", new DecodeString().decodeString("3[a2[c]]"));
    }

    @Test
    public void decodeStringTestThree() {
        Assertions.assertEquals("abcabccdcdcdef", new DecodeString().decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void decodeStringTestFour() {
        Assertions.assertEquals("abccdcdcdxyz", new DecodeString().decodeString("abc3[cd]xyz"));
    }
}
