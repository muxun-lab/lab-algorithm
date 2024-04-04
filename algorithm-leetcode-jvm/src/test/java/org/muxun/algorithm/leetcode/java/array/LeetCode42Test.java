package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/1
 */
@DisplayName("接雨水单元测试")
public class LeetCode42Test {

    @Test
    public void trapTestOne() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int res = new LeetCode42().trap(height);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void trapByDoublePointerTestTwo() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int res = new LeetCode42().trapByDoublePointer(height);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void trapByDPTestThree() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int res = new LeetCode42().trapByDP(height);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }
}
