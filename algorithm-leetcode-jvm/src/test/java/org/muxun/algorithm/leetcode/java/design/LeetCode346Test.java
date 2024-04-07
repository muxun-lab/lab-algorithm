package org.muxun.algorithm.leetcode.java.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-04-07
 */
@DisplayName("数据流中的移动平均值测试用例")
public class LeetCode346Test {

    @Test
    public void testOne() {
        int size = 3;
        double expected1 = 1.0;
        double expected2 = 5.5;
        double expected3 = 4.666666666666667;
        double expected4 = 6.0;
        LeetCode346 movingAverage = new LeetCode346(size);
        double res1 = movingAverage.next(1);
        double res2 = movingAverage.next(10);
        double res3 = movingAverage.next(3);
        double res4 = movingAverage.next(5);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
        Assertions.assertEquals(expected4, res4);
    }
}
