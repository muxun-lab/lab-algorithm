package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-27
 */
@DisplayName("长度为 K 的无重复字符子串测试用例")
public class LeetCode1100Test {

    @Test
    public void testOne() {
        String S = "havefunonleetcode";
        int K = 5;
        int expected = 6;
        int res = new LeetCode1100().numKLenSubstrNoRepeats(S, K);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String S = "home";
        int K = 5;
        int expected = 0;
        int res = new LeetCode1100().numKLenSubstrNoRepeats(S, K);
        Assertions.assertEquals(expected, res);
    }
}
