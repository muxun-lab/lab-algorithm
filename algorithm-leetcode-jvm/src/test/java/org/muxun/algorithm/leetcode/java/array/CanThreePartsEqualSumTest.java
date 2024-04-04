package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-11
 */
@DisplayName("将数组等分成和相等的三个部分单元测试")
public class CanThreePartsEqualSumTest {

    @Test
    public void canThreePartsEqualSumTestOne() {
        Assertions.assertTrue(new CanThreePartsEqualSum().canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }

    @Test
    public void canThreePartsEqualSumTestTwo() {
        Assertions.assertFalse(new CanThreePartsEqualSum().canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
    }

    @Test
    public void canThreePartsEqualSumTestThree() {
        Assertions.assertTrue(new CanThreePartsEqualSum().canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

    @Test
    public void canThreePartsEqualSumDoublePointerTestOne() {
        Assertions.assertTrue(new CanThreePartsEqualSum().canThreePartsEqualSumDoublePointer(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }

    @Test
    public void canThreePartsEqualSumDoublePointerTestTwo() {
        Assertions.assertFalse(new CanThreePartsEqualSum().canThreePartsEqualSumDoublePointer(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
    }

    @Test
    public void canThreePartsEqualSumDoublePointerTestThree() {
        Assertions.assertTrue(new CanThreePartsEqualSum().canThreePartsEqualSumDoublePointer(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }
}
