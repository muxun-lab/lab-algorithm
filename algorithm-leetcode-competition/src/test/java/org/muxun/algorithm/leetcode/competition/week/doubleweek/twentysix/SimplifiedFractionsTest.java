package org.muxun.algorithm.leetcode.competition.week.doubleweek.twentysix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix.SimplifiedFractions;

import java.util.List;

/**
 * @author sunshine
 * @created 2020-05-25
 */
@DisplayName("最简分数单元测试")
public class SimplifiedFractionsTest {

    @Test
    public void simplifiedFractionsTestOne() {
        Assertions.assertIterableEquals(List.of("1/2"), new SimplifiedFractions().simplifiedFractions(2));
    }

    @Test
    public void simplifiedFractionsTestTwo() {
        Assertions.assertIterableEquals(List.of("1/2", "1/3", "2/3"), new SimplifiedFractions().simplifiedFractions(3));
    }

    @Test
    public void simplifiedFractionsTestThree() {
        Assertions.assertIterableEquals(List.of("1/2", "1/3", "2/3", "1/4", "3/4"), new SimplifiedFractions().simplifiedFractions(4));
    }

    @Test
    public void simplifiedFractionsTestFour() {
        Assertions.assertIterableEquals(List.of(), new SimplifiedFractions().simplifiedFractions(1));
    }
}
