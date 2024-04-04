package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 多数元素测试类
 * @author 慕勋
 * @created 2020-01-29
 */
public class MajorityElementTest {

    @Test
    public void majorityElementTestOne() {
        Assertions.assertEquals(3, new MajorityElement().majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void majorityElementTestTwo() {
        Assertions.assertEquals(2, new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    public void majorityElementTestThree() {
        Assertions.assertEquals(3, new MajorityElement().majorityElementUpgrade(new int[]{3, 2, 3}));
    }

    @Test
    public void majorityElementTestFour() {
        Assertions.assertEquals(2, new MajorityElement().majorityElementUpgrade(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
