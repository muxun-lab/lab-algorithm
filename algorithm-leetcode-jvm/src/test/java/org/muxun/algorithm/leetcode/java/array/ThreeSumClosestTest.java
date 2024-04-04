package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-01-30
 */
@DisplayName("最接近的三数之和测试类")
public class ThreeSumClosestTest {

    @Test
    public void threeSumClosestTestOne() {
        Assertions.assertEquals(2, new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
