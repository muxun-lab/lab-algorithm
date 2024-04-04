package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/3
 */
@DisplayName("石子游戏 VII单元测试")
public class LeetCode1690Test {

    @Test
    public void testOne() {
        int[] stones = {5, 3, 1, 4, 2};
        int res = new LeetCode1690().stoneGameVII(stones);
        int expected = 6;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] stones = {7, 90, 5, 1, 100, 10, 10, 2};
        int res = new LeetCode1690().stoneGameVII(stones);
        int expected = 122;
        Assertions.assertEquals(expected, res);
    }
}
