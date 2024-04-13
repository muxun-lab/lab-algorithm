package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentyseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentyseven.LeetCode100250;

/**
 * @author 慕勋
 * @created 2024-03-30
 */
@DisplayName("得到更多分数的最少关卡数目测试用例")
public class LeetCode100250Test {

    @Test
    public void testOne() {
        int[] possible = {1, 0, 1, 0};
        int expected = 1;
        int res = new LeetCode100250().minimumLevels(possible);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] possible = {1, 1, 1, 1, 1};
        int expected = 3;
        int res = new LeetCode100250().minimumLevels(possible);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] possible = {0, 0};
        int expected = -1;
        int res = new LeetCode100250().minimumLevels(possible);
        Assertions.assertEquals(expected, res);
    }
}
