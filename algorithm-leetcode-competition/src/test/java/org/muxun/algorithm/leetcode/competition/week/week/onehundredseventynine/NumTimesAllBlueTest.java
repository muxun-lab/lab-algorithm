package org.muxun.algorithm.leetcode.competition.week.week.onehundredseventynine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredseventynine.NumTimesAllBlue;

/**
 * @author sunshine
 * @created 2020-03-08
 */
@DisplayName("")
public class NumTimesAllBlueTest {

    @Test
    public void numTimesAllBlueTestOne() {
        Assertions.assertEquals(3, new NumTimesAllBlue().numTimesAllBlue(new int[]{2, 1, 3, 5, 4}));
    }

    @Test
    public void numTimesAllBlueTestTwo() {
        Assertions.assertEquals(1, new NumTimesAllBlue().numTimesAllBlue(new int[]{4, 1, 2, 3}));
    }
}
