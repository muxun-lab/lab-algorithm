package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-25 20:23
 */
@DisplayName("股票最大收益测试类")
public class MaxProfitTest {

    @Test
    public void maxProfitTest() {
        Assertions.assertEquals(5, new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(4, new MaxProfit().maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertEquals(0, new MaxProfit().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
