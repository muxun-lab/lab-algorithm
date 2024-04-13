package org.muxun.algorithm.leetcode.competition.week.week.onehundredeightyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone.SumFourDivisors;

/**
 * @author sunshine
 * @created 2020-03-22
 */
@DisplayName("四因数单元测试")
public class SumFourDivisorsTest {

    @Test
    public void sumFourDivisorsTestOne() {
        Assertions.assertEquals(32, new SumFourDivisors().sumFourDivisors(new int[]{21, 4, 7}));
    }

    @Test
    public void sumFourDivisorsTestTwo() {
        Assertions.assertEquals(64, new SumFourDivisors().sumFourDivisors(new int[]{21, 21}));
    }
}
