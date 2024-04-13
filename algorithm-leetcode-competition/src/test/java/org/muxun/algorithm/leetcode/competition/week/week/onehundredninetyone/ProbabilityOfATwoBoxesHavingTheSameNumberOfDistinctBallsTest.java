package org.muxun.algorithm.leetcode.competition.week.week.onehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone.ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBalls;

/**
 * @author sunshine
 * @created 2020-05-31
 */
@DisplayName("两个盒子中求的颜色数相同的概率单元测试")
public class ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBallsTest {

    @Test
    public void getProbabilityTestOne() {
        int[] balls = {1, 1};
        Assertions.assertEquals(1.0, new ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBalls().getProbability(balls));
    }

    @Test
    public void getProbabilityTestTwo() {
        int[] balls = {2, 1, 1};
        Assertions.assertEquals(0.66667, new ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBalls().getProbability(balls));
    }

    @Test
    public void getProbabilityTestThree() {
        int[] balls = {1, 2, 1, 2};
        Assertions.assertEquals(0.60000, new ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBalls().getProbability(balls));
    }

    @Test
    public void getProbabilityTestFour() {
        int[] balls = {3, 2, 1};
        Assertions.assertEquals(0.30000, new ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBalls().getProbability(balls));
    }

    @Test
    public void getProbabilityTestFive() {
        int[] balls = {6, 6, 6, 6, 6, 6};
        Assertions.assertEquals(0.90327, new ProbabilityOfATwoBoxesHavingTheSameNumberOfDistinctBalls().getProbability(balls));
    }
}
