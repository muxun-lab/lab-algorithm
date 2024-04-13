package org.muxun.algorithm.leetcode.competition.week.doubleweek.twentysix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.twentysix.ConsecutiveCharacters;

/**
 * @author sunshine
 * @created 2020-05-25
 */
@DisplayName("连续字符单元测试")
public class ConsecutiveCharactersTest {

    @Test
    public void maxPowerTestOne() {
        Assertions.assertEquals(2, new ConsecutiveCharacters().maxPower("leetcode"));
    }

    @Test
    public void maxPowerTestTwo() {
        Assertions.assertEquals(5, new ConsecutiveCharacters().maxPower("abbcccddddeeeeedcba"));
    }

    @Test
    public void maxPowerTestThree() {
        Assertions.assertEquals(5, new ConsecutiveCharacters().maxPower("triplepillooooow"));
    }

    @Test
    public void maxPowerTestFour() {
        Assertions.assertEquals(11, new ConsecutiveCharacters().maxPower("hooraaaaaaaaaaay"));
    }

    @Test
    public void maxPowerTestFive() {
        Assertions.assertEquals(1, new ConsecutiveCharacters().maxPower("tourist"));
    }
}
