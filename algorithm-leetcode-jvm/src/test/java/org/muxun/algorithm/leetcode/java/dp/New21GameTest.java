package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/3
 */
@DisplayName("新21点单元测试")
public class New21GameTest {

    @Test
    public void new21GameTestOne() {
        Assertions.assertEquals(1.0, new New21Game().new21Game(10, 1, 10));
    }

    @Test
    public void new21GameTestTwo() {
        Assertions.assertEquals(0.6, new New21Game().new21Game(6, 1, 10));
    }

    @Test
    public void new21GameTestThree() {
        Assertions.assertEquals(0.7328, new New21Game().new21Game(21, 17, 10));
    }
}
