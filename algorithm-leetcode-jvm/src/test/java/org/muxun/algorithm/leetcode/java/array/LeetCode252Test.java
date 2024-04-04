package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("会议室测试用例")
public class LeetCode252Test {

    @Test
    public void testOne() {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean expected = false;
        boolean res = new LeetCode252().canAttendMeetings(intervals);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[][] intervals = {{7, 10}, {2, 4}};
        boolean expected = true;
        boolean res = new LeetCode252().canAttendMeetings(intervals);
        Assertions.assertEquals(expected, res);
    }
}
