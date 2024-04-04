package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/18
 */
@DisplayName("合并区间测试用例")
public class LeetCode56Test {

    @Test
    public void testOne() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        int[][] res = new LeetCode56().merge(intervals);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        int[][] res = new LeetCode56().merge(intervals);
        Assertions.assertArrayEquals(expected, intervals);
    }
}
