package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-14
 */
@DisplayName("打家劫舍单元测试")
public class RobTest {

    @Test
    public void robTestOne() {
        Assertions.assertEquals(4, new Rob().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void robTestTwo() {
        Assertions.assertEquals(12, new Rob().rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void robTestThree() {
        Assertions.assertEquals(2, new Rob().rob(new int[]{1, 2}));
    }
}
