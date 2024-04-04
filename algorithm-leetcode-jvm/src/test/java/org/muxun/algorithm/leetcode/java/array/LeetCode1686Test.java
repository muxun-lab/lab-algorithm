package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/2
 */
@DisplayName("石子游戏 VI测试用例")
public class LeetCode1686Test {

    @Test
    public void testOne() {
        int[] aliceValues = {1, 3};
        int[] bobValues = {2, 1};
        int res = new LeetCode1686().stoneGameVI(aliceValues, bobValues);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] aliceValues = {1, 2};
        int[] bobValues = {3, 1};
        int res = new LeetCode1686().stoneGameVI(aliceValues, bobValues);
        int expected = 0;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] aliceValues = {2, 4, 3};
        int[] bobValues = {1, 6, 7};
        int res = new LeetCode1686().stoneGameVI(aliceValues, bobValues);
        int expected = -1;
        Assertions.assertEquals(expected, res);
    }
}
