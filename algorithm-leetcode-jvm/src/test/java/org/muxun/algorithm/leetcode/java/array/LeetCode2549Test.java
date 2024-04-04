package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-23
 */
@DisplayName("统计桌面上的不同数字测试用例")
public class LeetCode2549Test {

    @Test
    public void testOne() {
        int n = 5;
        int expected = 4;
        int res = new LeetCode2549().distinctIntegers(n);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 3;
        int expected = 2;
        int res = new LeetCode2549().distinctIntegers(n);
        Assertions.assertEquals(expected, res);
    }
}
