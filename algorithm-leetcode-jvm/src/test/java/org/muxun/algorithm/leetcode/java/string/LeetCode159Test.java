package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/24
 */
@DisplayName("至多包含两个不同字符的最长子串测试用例")
public class LeetCode159Test {

    @Test
    public void testOne() {
        String s = "eceba";
        int expected = 3;
        int res = new LeetCode159().lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String s = "ccaabbb";
        int expected = 5;
        int res = new LeetCode159().lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(expected, res);
    }
}
