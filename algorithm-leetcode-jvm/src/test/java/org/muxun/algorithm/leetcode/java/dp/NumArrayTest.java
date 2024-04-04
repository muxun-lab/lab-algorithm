package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-14
 */
@DisplayName("区域和检索 - 数组不可变单元测试")
public class NumArrayTest {

    @Test
    public void numArrayTestOne() {
        Assertions.assertEquals(1, new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 2));
    }

    @Test
    public void numArrayTestTwo() {
        Assertions.assertEquals(-1, new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(2, 5));
    }

    @Test
    public void numArrayTestThree() {
        Assertions.assertEquals(-3, new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 5));
    }

    @Test
    public void numArrayUpgradeTestOne() {
        Assertions.assertEquals(1, new NumArray(new int[]{-2, 0, 3, -5, 2, -1}, 1).sumRange(0, 2, 1));
    }

    @Test
    public void numArrayUpgradeTestTwo() {
        Assertions.assertEquals(-1, new NumArray(new int[]{-2, 0, 3, -5, 2, -1}, 1).sumRange(2, 5, 1));
    }

    @Test
    public void numArrayUpgradeTestThree() {
        Assertions.assertEquals(-3, new NumArray(new int[]{-2, 0, 3, -5, 2, -1}, 1).sumRange(0, 5, 1));
    }
}
