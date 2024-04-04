package org.muxun.algorithm.leetcode.java.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-14
 */
@DisplayName("加油站测试类")
public class CanCompleteCircuitTest {

    @Test
    public void canCompleteCircuitTestOne() {
        Assertions.assertEquals(-1, new CanCompleteCircuit().canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    public void canCompleteCircuitTestTwo() {
        Assertions.assertEquals(3, new CanCompleteCircuit().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void canCompleteCircuitTestThree() {
        Assertions.assertEquals(4, new CanCompleteCircuit().canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
    }

    @Test
    public void canCompleteCircuitTestFour() {
        Assertions.assertEquals(0, new CanCompleteCircuit().canCompleteCircuit(new int[]{3, 1, 1,}, new int[]{1, 2, 2}));
    }
}
