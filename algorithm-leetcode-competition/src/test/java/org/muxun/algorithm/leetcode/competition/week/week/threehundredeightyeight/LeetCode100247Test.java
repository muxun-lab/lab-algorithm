package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyeight.LeetCode100247;

/**
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("幸福值最大化的选择方案测试用例")
public class LeetCode100247Test {

    @Test
    public void testOne() {
        int[] happiness = {1, 2, 3};
        int k = 2;
        long expected = 4;
        long res = new LeetCode100247().maximumHappinessSum(happiness, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] happiness = {1, 1, 1, 1};
        int k = 2;
        long expected = 1;
        long res = new LeetCode100247().maximumHappinessSum(happiness, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] happiness = {2, 3, 4, 5};
        int k = 1;
        long expected = 5;
        long res = new LeetCode100247().maximumHappinessSum(happiness, k);
        Assertions.assertEquals(expected, res);
    }
}
