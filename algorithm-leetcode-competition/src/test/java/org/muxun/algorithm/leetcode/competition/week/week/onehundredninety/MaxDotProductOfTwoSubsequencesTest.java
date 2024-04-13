package org.muxun.algorithm.leetcode.competition.week.week.onehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninety.MaxDotProductOfTwoSubsequences;

/**
 * @author sunshine
 * @created 2020-05-24
 */
@DisplayName("两个子序列的最大点积单元测试")
public class MaxDotProductOfTwoSubsequencesTest {

    @Test
    public void maxDotProductTestOne() {
        Assertions.assertEquals(18, new MaxDotProductOfTwoSubsequences().maxDotProduct(new int[]{2, 1, -2, 5}, new int[]{3, 0, -6}));
    }

    @Test
    public void maxDotProductTestTwo() {
        Assertions.assertEquals(21, new MaxDotProductOfTwoSubsequences().maxDotProduct(new int[]{3, -2}, new int[]{2, -6, 7}));
    }

    @Test
    public void maxDotProductTestThree() {
        Assertions.assertEquals(-1, new MaxDotProductOfTwoSubsequences().maxDotProduct(new int[]{-1, -1}, new int[]{1, 1}));
    }
}
