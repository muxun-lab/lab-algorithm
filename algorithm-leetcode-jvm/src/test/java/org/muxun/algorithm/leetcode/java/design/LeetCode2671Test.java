package org.muxun.algorithm.leetcode.java.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-21
 */
@DisplayName("频率跟踪器测试用例")
public class LeetCode2671Test {

    @Test
    public void testOne() {
        LeetCode2671 tracker = new LeetCode2671();
        tracker.add(3);
        tracker.add(3);
        boolean expected = true;
        boolean res = tracker.hasFrequency(2);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        LeetCode2671 tracker = new LeetCode2671();
        tracker.add(1);
        tracker.deleteOne(1);
        boolean expected = false;
        boolean res = tracker.hasFrequency(1);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        LeetCode2671 tracker = new LeetCode2671();
        boolean res1 = tracker.hasFrequency(2);
        tracker.add(3);
        boolean res2 = tracker.hasFrequency(1);
        boolean expected1 = false;
        boolean expected2 = true;
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
    }
}
