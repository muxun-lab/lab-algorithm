package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/1
 */
@DisplayName("零钱兑换 II测试用例")
public class LeetCode518Test {

    @Test
    public void changeTestOne() {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int expected = 4;
        int res = new LeetCode518().change(amount, coins);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void changeTestTwo() {
        int[] coins = {2};
        int amount = 3;
        int expected = 0;
        int res = new LeetCode518().change(amount, coins);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void changeTestThree() {
        int[] coins = {10};
        int amount = 10;
        int expected = 1;
        int res = new LeetCode518().change(amount, coins);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void changeTestFour() {
        int[] coins = {};
        int amount = 0;
        int expected = 1;
        int res = new LeetCode518().change(amount, coins);
        Assertions.assertEquals(expected, res);
    }
}
