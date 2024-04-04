package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/7
 */
@DisplayName("找出字符串的可整除数组测试用例")
public class LeetCode2575Test {

    @Test
    public void testOne() {
        String word = "998244353";
        int m = 3;
        int[] expected = {1, 1, 0, 0, 0, 1, 1, 0, 0};
        int[] res = new LeetCode2575().divisibilityArray(word, m);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String word = "1010";
        int m = 10;
        int[] expected = {0, 1, 0, 1};
        int[] res = new LeetCode2575().divisibilityArray(word, m);
        Assertions.assertArrayEquals(expected, res);
    }
}
