package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-18
 */
@DisplayName("字符串转换整数(atoi)单元测试")
public class MyAtoiTest {

    @Test
    public void myAtoiTestOne() {
        Assertions.assertEquals(42, new MyAtoi().myAtoi("42"));
    }

    @Test
    public void myAtoiTestTwo() {
        Assertions.assertEquals(-42, new MyAtoi().myAtoi("-42"));
    }

    @Test
    public void myAtoiTestThree() {
        Assertions.assertEquals(4193, new MyAtoi().myAtoi("4193 with words"));
    }

    @Test
    public void myAtoiTestFour() {
        Assertions.assertEquals(0, new MyAtoi().myAtoi("words and 987"));
    }

    @Test
    public void myAtoiTestFive() {
        Assertions.assertEquals(-2147483648, new MyAtoi().myAtoi("-91283472332"));
    }

    @Test
    public void myAtoiTestSix() {
        Assertions.assertEquals(Integer.MAX_VALUE, new MyAtoi().myAtoi("2147483648"));
    }

    @Test
    public void myAtoiTestSeven() {
        Assertions.assertEquals(Integer.MIN_VALUE, new MyAtoi().myAtoi("-2147483648"));
    }

    @Test
    public void myAtoiTestEight() {
        Assertions.assertEquals(1, new MyAtoi().myAtoi("+1"));
    }

    @Test
    public void myAtoiTestNine() {
        Assertions.assertEquals(12345678, new MyAtoi().myAtoi("  0000000000012345678"));
    }

    @Test
    public void myAtoiTestTen() {
        Assertions.assertEquals(0, new MyAtoi().myAtoi("  00000000000"));
    }

    @Test
    public void myAtoiTestEleven() {
        Assertions.assertEquals(0, new MyAtoi().myAtoi("+-2"));
    }

    @Test
    public void myAtoiTestTwelve() {
        Assertions.assertEquals(10, new MyAtoi().myAtoi("010"));
    }

    @Test
    public void myAtoiTestThirteen() {
        Assertions.assertEquals(0, new MyAtoi().myAtoi("   +0 123"));
    }

    @Test
    public void myAtoiTestFourteen() {
        Assertions.assertEquals(0, new MyAtoi().myAtoi("0-1"));
    }

    @Test
    public void myAtoiTestFifteen() {
        Assertions.assertEquals(1095502006, new MyAtoi().myAtoi("1095502006p8"));
    }

    @Test
    public void myAtoiSimplifyTestOne() {
        Assertions.assertEquals(42, new MyAtoi().myAtoiSimplify("42"));
    }

    @Test
    public void myAtoiSimplifyTestTwo() {
        Assertions.assertEquals(-42, new MyAtoi().myAtoiSimplify("-42"));
    }

    @Test
    public void myAtoiSimplifyTestThree() {
        Assertions.assertEquals(4193, new MyAtoi().myAtoiSimplify("4193 with words"));
    }

    @Test
    public void myAtoiSimplifyTestFour() {
        Assertions.assertEquals(0, new MyAtoi().myAtoiSimplify("words and 987"));
    }

    @Test
    public void myAtoiSimplifyTestFive() {
        Assertions.assertEquals(-2147483648, new MyAtoi().myAtoiSimplify("-91283472332"));
    }

    @Test
    public void myAtoiSimplifyTestSix() {
        Assertions.assertEquals(Integer.MAX_VALUE, new MyAtoi().myAtoiSimplify("2147483648"));
    }

    @Test
    public void myAtoiSimplifyTestSeven() {
        Assertions.assertEquals(Integer.MIN_VALUE, new MyAtoi().myAtoiSimplify("-2147483648"));
    }

    @Test
    public void myAtoiSimplifyTestEight() {
        Assertions.assertEquals(1, new MyAtoi().myAtoiSimplify("+1"));
    }

    @Test
    public void myAtoiSimplifyTestNine() {
        Assertions.assertEquals(12345678, new MyAtoi().myAtoiSimplify("  0000000000012345678"));
    }

    @Test
    public void myAtoiSimplifyTestTen() {
        Assertions.assertEquals(0, new MyAtoi().myAtoiSimplify("  00000000000"));
    }

    @Test
    public void myAtoiSimplifyTestEleven() {
        Assertions.assertEquals(0, new MyAtoi().myAtoiSimplify("+-2"));
    }

    @Test
    public void myAtoiSimplifyTestTwelve() {
        Assertions.assertEquals(10, new MyAtoi().myAtoiSimplify("010"));
    }

    @Test
    public void myAtoiSimplifyTestThirteen() {
        Assertions.assertEquals(0, new MyAtoi().myAtoiSimplify("   +0 123"));
    }

    @Test
    public void myAtoiSimplifyTestFourteen() {
        Assertions.assertEquals(0, new MyAtoi().myAtoiSimplify("0-1"));
    }

    @Test
    public void myAtoiSimplifyTestFifteen() {
        Assertions.assertEquals(1095502006, new MyAtoi().myAtoiSimplify("1095502006p8"));
    }
}
