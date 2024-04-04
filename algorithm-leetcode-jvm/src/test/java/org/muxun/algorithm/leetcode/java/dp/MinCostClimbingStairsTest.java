package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-14
 */
@DisplayName("使用最小花费爬楼梯单元测试")
public class MinCostClimbingStairsTest {

    @Test
    public void minCostClimbingStairsTestOne() {
        Assertions.assertEquals(15, new MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    public void minCostClimbingStairsTestTwo() {
        Assertions.assertEquals(6, new MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
