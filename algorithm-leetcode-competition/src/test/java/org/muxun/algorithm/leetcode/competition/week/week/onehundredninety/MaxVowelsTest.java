package org.muxun.algorithm.leetcode.competition.week.week.onehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninety.MaxVowels;

/**
 * @author sunshine
 * @created 2020-05-24
 */
@DisplayName("定长子串中元音的最大数目单元测试")
public class MaxVowelsTest {

    @Test
    public void maxVowelsTestOne() {
        Assertions.assertEquals(3, new MaxVowels().maxVowels("abciiidef", 3));
    }

    @Test
    public void maxVowelsTestTwo() {
        Assertions.assertEquals(2, new MaxVowels().maxVowels("aeiou", 2));
    }

    @Test
    public void maxVowelsTestThree() {
        Assertions.assertEquals(2, new MaxVowels().maxVowels("leetcode", 3));
    }

    @Test
    public void maxVowelsTestFour() {
        Assertions.assertEquals(0, new MaxVowels().maxVowels("rhythms", 4));
    }

    @Test
    public void maxVowelsTestFive() {
        Assertions.assertEquals(1, new MaxVowels().maxVowels("tryhard", 4));
    }

    @Test
    public void maxVowelsTestSix() {
        Assertions.assertEquals(4, new MaxVowels().maxVowels("weallloveyou", 7));
    }

    @Test
    public void maxVowelsOptimizeTestOne() {
        Assertions.assertEquals(3, new MaxVowels().maxVowelsOptimize("abciiidef", 3));
    }

    @Test
    public void maxVowelsOptimizeTestTwo() {
        Assertions.assertEquals(2, new MaxVowels().maxVowelsOptimize("aeiou", 2));
    }

    @Test
    public void maxVowelsOptimizeTestThree() {
        Assertions.assertEquals(2, new MaxVowels().maxVowelsOptimize("leetcode", 3));
    }

    @Test
    public void maxVowelsOptimizeTestFour() {
        Assertions.assertEquals(0, new MaxVowels().maxVowelsOptimize("rhythms", 4));
    }

    @Test
    public void maxVowelsOptimizeTestFive() {
        Assertions.assertEquals(1, new MaxVowels().maxVowelsOptimize("tryhard", 4));
    }

    @Test
    public void maxVowelsOptimizeTestSix() {
        Assertions.assertEquals(4, new MaxVowels().maxVowelsOptimize("weallloveyou", 7));
    }
}
