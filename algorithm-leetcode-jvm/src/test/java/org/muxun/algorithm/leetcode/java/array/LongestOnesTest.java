package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-10
 */
@DisplayName("最大连续1的个数 III测试类")
public class LongestOnesTest {

    @Test
    public void longestOnesTestOne() {
        Assertions.assertEquals(6, new LongestOnes().longestOnesUpgrade(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    @Test
    public void longestOnesTestTwo() {
        Assertions.assertEquals(10, new LongestOnes().longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    @Test
    public void longestOnesTestThree() {
        Assertions.assertEquals(10, new LongestOnes().longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    @Test
    public void longestOnesTestFour() {
        Assertions.assertEquals(3, new LongestOnes().longestOnes(new int[]{0, 0, 1, 1, 1, 0, 0}, 0));
    }

    @Test
    public void longestOnesTestFive() {
        Assertions.assertEquals(4, new LongestOnes().longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 0));
    }

    @Test
    public void longestOnesTestSix() {
        Assertions.assertEquals(30, new LongestOnes().longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1}, 10));
    }
}
