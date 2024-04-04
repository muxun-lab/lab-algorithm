package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/10
 */
@DisplayName("罗马数字转整数单元测试")
public class RomanToIntegerTest {

    @Test
    public void romanToIntTestOne() {
        Assertions.assertEquals(3, new RomanToInteger().romanToInt("III"));
    }

    @Test
    public void romanToIntTestTwo() {
        Assertions.assertEquals(4, new RomanToInteger().romanToInt("IV"));
    }

    @Test
    public void romanToIntTestThree() {
        Assertions.assertEquals(9, new RomanToInteger().romanToInt("IX"));
    }

    @Test
    public void romanToIntTestFour() {
        Assertions.assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
    }

    @Test
    public void romanToIntTestFive() {
        Assertions.assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
    }

    @Test
    public void romanToIntSimplifyTestOne() {
        Assertions.assertEquals(3, new RomanToInteger().romanToIntSimplify("III"));
    }

    @Test
    public void romanToIntSimplifyTestTwo() {
        Assertions.assertEquals(4, new RomanToInteger().romanToIntSimplify("IV"));
    }

    @Test
    public void romanToIntSimplifyTestThree() {
        Assertions.assertEquals(9, new RomanToInteger().romanToIntSimplify("IX"));
    }

    @Test
    public void romanToIntSimplifyTestFour() {
        Assertions.assertEquals(58, new RomanToInteger().romanToIntSimplify("LVIII"));
    }

    @Test
    public void romanToIntSimplifyTestFive() {
        Assertions.assertEquals(1994, new RomanToInteger().romanToIntSimplify("MCMXCIV"));
    }
}
