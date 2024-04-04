package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-09
 */
@DisplayName("第三大的数测试类")
public class ThirdMaxTest {

    @Test
    public void thirdMaxTestOne() {
        Assertions.assertEquals(1, new ThirdMax().thirdMax(new int[]{3, 2, 1}));
    }

    @Test
    public void thirdMaxTestTwo() {
        Assertions.assertEquals(2, new ThirdMax().thirdMax(new int[]{1, 2}));
    }

    @Test
    public void thirdMaxTestThree() {
        Assertions.assertEquals(1, new ThirdMax().thirdMax(new int[]{2, 2, 3, 1}));
    }

    @Test
    public void thirdMaxTestFour() {
        Assertions.assertEquals(2, new ThirdMax().thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
    }

    @Test
    public void thirdMaxTestFive() {
        Assertions.assertEquals(1, new ThirdMax().thirdMax(new int[]{-2147483648, -2147483648, -2147483648, -2147483648, 1, 1, 1}));
    }
}
