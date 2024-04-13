package org.muxun.algorithm.leetcode.competition.week.week.onehundredeighty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty.MaxPerformance;

/**
 * @author sunshine
 * @created 2020-03-15
 */
@DisplayName("最大的团队表现值单元测试")
public class MaxPerformanceTest {

    @Test
    public void maxPerformanceTestOne() {
        Assertions.assertEquals(60, new MaxPerformance().maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 2));
    }

    @Test
    public void maxPerformanceTestTwo() {
        Assertions.assertEquals(68, new MaxPerformance().maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 3));
    }

    @Test
    public void maxPerformanceTestThree() {
        Assertions.assertEquals(72, new MaxPerformance().maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 4));
    }
}
