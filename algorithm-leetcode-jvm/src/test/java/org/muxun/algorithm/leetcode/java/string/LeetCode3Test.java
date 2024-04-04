package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-11
 */
@DisplayName("无重复字符的最长子串测试用例")
public class LeetCode3Test {

    @Test
    public void lengthOfLongestSubstringTestOne() {
        String s = "abcabcbb";
        int res = new LeetCode3().lengthOfLongestSubstring(s);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringTestTwo() {
        String s = "bbbbb";
        int res = new LeetCode3().lengthOfLongestSubstring(s);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringTestThree() {
        String s = "pwwkew";
        int res = new LeetCode3().lengthOfLongestSubstring(s);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringTestFour() {
        String s = "abba";
        int res = new LeetCode3().lengthOfLongestSubstring(s);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringByDoublePointerTestOne() {
        String s = "abcabcbb";
        int res = new LeetCode3().lengthOfLongestSubstringByDoublePointer(s);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringByDoublePointerTestTwo() {
        String s = "bbbbb";
        int res = new LeetCode3().lengthOfLongestSubstringByDoublePointer(s);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringByDoublePointerTestThree() {
        String s = "pwwkew";
        int res = new LeetCode3().lengthOfLongestSubstringByDoublePointer(s);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLongestSubstringByDoublePointerTestFour() {
        String s = "abba";
        int res = new LeetCode3().lengthOfLongestSubstringByDoublePointer(s);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }
}
