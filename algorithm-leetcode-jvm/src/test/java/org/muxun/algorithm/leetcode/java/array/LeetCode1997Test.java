package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-28
 */
@DisplayName("访问完所有房间的第一天测试用例")
public class LeetCode1997Test {

    @Test
    public void testOne() {
        int[] nextVisit = {0, 0};
        int expected = 2;
        int res = new LeetCode1997().firstDayBeenInAllRooms(nextVisit);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nextVisit = {0, 0, 2};
        int expected = 6;
        int res = new LeetCode1997().firstDayBeenInAllRooms(nextVisit);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nextVisit = {0, 1, 2, 0};
        int expected = 6;
        int res = new LeetCode1997().firstDayBeenInAllRooms(nextVisit);
        Assertions.assertEquals(expected, res);
    }
}
