package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-27
 */
@DisplayName("统计将重叠区间合并成组的方案数测试用例")
public class LeetCode2580Test {

    @Test
    public void testOne() {
        int[][] ranges = {{6, 10}, {5, 15}};
        int expected = 2;
        int res = new LeetCode2580().countWays(ranges);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] ranges = {{1, 3}, {10, 20}, {2, 5}, {4, 8}};
        int expected = 4;
        int res = new LeetCode2580().countWays(ranges);
        Assertions.assertEquals(expected, res);
    }
}
