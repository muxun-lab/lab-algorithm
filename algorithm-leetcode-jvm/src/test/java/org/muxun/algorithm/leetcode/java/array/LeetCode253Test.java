package org.muxun.algorithm.leetcode.java.array;

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
 * @created 2024-04-01
 */
@DisplayName("会议室 II测试用例")
public class LeetCode253Test {

    @Test
    public void testOne() {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int expected = 2;
        int res = new LeetCode253().minMeetingRooms(intervals);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] intervals = {{7, 10}, {2, 4}};
        int expected = 1;
        int res = new LeetCode253().minMeetingRooms(intervals);
        Assertions.assertEquals(expected, res);
    }
}
