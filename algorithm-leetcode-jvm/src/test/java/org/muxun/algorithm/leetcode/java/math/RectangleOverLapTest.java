package org.muxun.algorithm.leetcode.java.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-18
 */
@DisplayName("矩形重叠单元测试")
public class RectangleOverLapTest {

    @Test
    public void isRectangleOverLapTestOne() {
        Assertions.assertTrue(new RectangleOverLap().isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
    }

    @Test
    public void isRectangleOverLapTestTwo() {
        Assertions.assertFalse(new RectangleOverLap().isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
    }

    @Test
    public void isRectangleOverLapTestThree() {
        Assertions.assertTrue(new RectangleOverLap().isRectangleOverlap(new int[]{7, 8, 13, 15}, new int[]{10, 8, 12, 20}));
    }

    @Test
    public void isRectangleOverLapTestFour() {
        Assertions.assertFalse(new RectangleOverLap().isRectangleOverlap(new int[]{206110757, 199595273, 851054072, 983256382}, new int[]{-898677230, -47320317, -858614307, 736177810}));
    }
}
