package org.muxun.algorithm.leetcode.java.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/3
 */
@DisplayName("整数反转单元测试")
public class ReverseIntegerTest {

    @Test
    public void reverseTestOne() {
        Assertions.assertEquals(123, new ReverseInteger().reverse(321));
    }

    @Test
    public void reverseTestTwo() {
        Assertions.assertEquals(-123, new ReverseInteger().reverse(-321));
    }

    @Test
    public void reverseTestThree() {
        Assertions.assertEquals(21, new ReverseInteger().reverse(120));
    }

    @Test
    public void reverseTestFour() {
        Assertions.assertEquals(0, new ReverseInteger().reverse(-2147483648));
    }

    @Test
    public void reverseTestFive() {
        Assertions.assertEquals(0, new ReverseInteger().reverse(2147483647));
    }

    @Test
    public void reverseTestSix() {
        Assertions.assertEquals(-2143847412, new ReverseInteger().reverse(-2147483412));
    }

    @Test
    public void reverseOptimizationTestOne() {
        Assertions.assertEquals(123, new ReverseInteger().reverseOptimization(321));
    }

    @Test
    public void reverseOptimizationTestTwo() {
        Assertions.assertEquals(-123, new ReverseInteger().reverseOptimization(-321));
    }

    @Test
    public void reverseOptimizationTestThree() {
        Assertions.assertEquals(21, new ReverseInteger().reverseOptimization(120));
    }

    @Test
    public void reverseOptimizationTestFour() {
        Assertions.assertEquals(0, new ReverseInteger().reverseOptimization(-2147483648));
    }

    @Test
    public void reverseOptimizationTestFive() {
        Assertions.assertEquals(0, new ReverseInteger().reverseOptimization(2147483647));
    }

    @Test
    public void reverseOptimizationTestSix() {
        Assertions.assertEquals(-2143847412, new ReverseInteger().reverseOptimization(-2147483412));
    }
}
