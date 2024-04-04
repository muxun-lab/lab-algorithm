package org.muxun.algorithm.leetcode.java.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024-03-30
 */
@DisplayName("需要添加的硬币的最小数量测试用例")
public class LeetCode2952Test {

    @Test
    public void testOne() {
        int[] coins = {1, 4, 10};
        int target = 19;
        int expected = 2;
        int res = new LeetCode2952().minimumAddedCoins(coins, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] coins = {1, 4, 10, 5, 7, 19};
        int target = 19;
        int expected = 1;
        int res = new LeetCode2952().minimumAddedCoins(coins, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] coins = {1, 1, 1};
        int target = 20;
        int expected = 3;
        int res = new LeetCode2952().minimumAddedCoins(coins, target);
        Assertions.assertEquals(expected, res);
    }
}
