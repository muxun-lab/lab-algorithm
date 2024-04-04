package org.muxun.algorithm.leetcode.java.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/11
 */
@DisplayName("每日温度单元测试")
public class DailyTemperaturesTest {

    @Test
    public void dailyTemperaturesTestOne() {
        Assertions.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, new DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    public void dailyTemperaturesStackTestOne() {
        Assertions.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, new DailyTemperatures().dailyTemperaturesStack(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
}
