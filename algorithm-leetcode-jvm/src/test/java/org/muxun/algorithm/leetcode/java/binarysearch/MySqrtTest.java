package org.muxun.algorithm.leetcode.java.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-16
 */
@DisplayName("x的平方根单元测试")
public class MySqrtTest {

    @Test
    public void mySqrtTestOne() {
        Assertions.assertEquals(2, new MySqrt().mySqrt(4));
    }

    @Test
    public void mySqrtTestTwo() {
        Assertions.assertEquals(2, new MySqrt().mySqrt(8));
    }

    @Test
    public void mySqrtTestThree() {
        Assertions.assertEquals(46339, new MySqrt().mySqrt(2147395599));
    }

    @Test
    public void mySqrtBinarySearchTestOne() {
        Assertions.assertEquals(2, new MySqrt().mySqrtBinarySearch(4));
    }

    @Test
    public void mySqrtBinarySearchTestTwo() {
        Assertions.assertEquals(2, new MySqrt().mySqrtBinarySearch(8));
    }

    @Test
    public void mySqrtTestBinarySearchThree() {
        Assertions.assertEquals(46339, new MySqrt().mySqrtBinarySearch(2147395599));
    }
}
