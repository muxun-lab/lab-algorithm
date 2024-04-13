package org.muxun.algorithm.leetcode.competition.week.week.onehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone.MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts;

/**
 * @author sunshine
 * @created 2020-05-31
 */
@DisplayName("切割后面积最大的蛋糕单元测试")
public class MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    @Test
    public void maxAreaTestOne() {
        Assertions.assertEquals(4, new MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts().maxArea(5, 4, new int[]{1, 2, 4}, new int[]{1, 3}));
    }

    @Test
    public void maxAreaTestTwo() {
        Assertions.assertEquals(6, new MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts().maxArea(5, 4, new int[]{3, 1}, new int[]{1}));
    }

    @Test
    public void maxAreaTestThree() {
        Assertions.assertEquals(9, new MaxAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts().maxArea(5, 4, new int[]{3}, new int[]{3}));
    }
}
