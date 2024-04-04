package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-08
 */
@DisplayName("零钱兑换测试类")
public class CoinChangeTest {

    @Test
    public void coinChangeTestOne() {
        Assertions.assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void coinChangeTestTwo() {
        Assertions.assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
    }

    @Test
    public void coinChangeTestThree() {
        Assertions.assertEquals(20, new CoinChange().coinChange(new int[]{1, 2, 5}, 100));
    }

    @Test
    public void coinChangeDpTestOne() {
        Assertions.assertEquals(3, new CoinChange().coinChangeDp(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void coinChangeDpTestTwo() {
        Assertions.assertEquals(-1, new CoinChange().coinChangeDp(new int[]{2}, 3));
    }

    @Test
    public void coinChangeDpTestThree() {
        Assertions.assertEquals(20, new CoinChange().coinChangeDp(new int[]{1, 2, 5}, 100));
    }
}
