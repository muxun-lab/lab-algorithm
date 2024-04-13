package org.muxun.algorithm.leetcode.competition.week.week.onehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone.MaximumProductOfTwoElementsInAnArray;

/**
 * @author sunshine
 * @created 2020-05-31
 */
@DisplayName("数组中两元素的最大乘积单元测试")
public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void maxProductTestOne() {
        int[] nums = {3, 4, 5, 2};
        Assertions.assertEquals(12, new MaximumProductOfTwoElementsInAnArray().maxProduct(nums));
    }

    @Test
    public void maxProductTestTwo() {
        int[] nums = {1, 5, 4, 5};
        Assertions.assertEquals(16, new MaximumProductOfTwoElementsInAnArray().maxProduct(nums));
    }

    @Test
    public void maxProductTestThree() {
        int[] nums = {3, 7};
        Assertions.assertEquals(12, new MaximumProductOfTwoElementsInAnArray().maxProduct(nums));
    }
}
