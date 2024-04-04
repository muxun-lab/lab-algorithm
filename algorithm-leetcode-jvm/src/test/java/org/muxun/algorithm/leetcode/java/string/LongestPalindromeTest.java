package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-11
 */
@DisplayName("最长回文字符串测试类")
public class LongestPalindromeTest {

    @Test
    public void longestPalindromeTestOne() {
        Assertions.assertEquals("aba", new LongestPalindrome().longestPalindrome("babad"));
    }

    @Test
    public void longestPalindromeTestTwo() {
        Assertions.assertEquals("bb", new LongestPalindrome().longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindromeTestThree() {
        Assertions.assertEquals("bb", new LongestPalindrome().longestPalindrome("bb"));
    }

    @Test
    public void longestPalindromeTestFour() {
        Assertions.assertEquals("cc", new LongestPalindrome().longestPalindrome("ccd"));
    }

    @Test
    public void longestPalindromeTestFive() {
        Assertions.assertEquals("aaaa", new LongestPalindrome().longestPalindrome("aaaa"));
    }
}
