package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-01-29
 */
@DisplayName("缺失数字测试类")
public class MissingNumberTest {

    @Test
    public void missingNumberTestOne() {
        Assertions.assertEquals(2, new MissingNumber().missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    public void missingNumberTestTwo() {
        Assertions.assertEquals(8, new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    public void missingNumberTestThree() {
        Assertions.assertEquals(2, new MissingNumber().missingNumberUpgradeTwo(new int[]{3, 0, 1}));
    }

    @Test
    public void missingNumberTestFour() {
        Assertions.assertEquals(8, new MissingNumber().missingNumberUpgradeTwo(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

}
