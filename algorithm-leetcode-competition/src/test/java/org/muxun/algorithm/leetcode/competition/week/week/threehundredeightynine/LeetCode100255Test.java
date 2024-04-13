package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightynine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightynine.LeetCode100255;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("成为 K 特殊字符串需要删除的最少字符数测试用例")
public class LeetCode100255Test {

    @Test
    public void testOne() {
        String word = "aabcaba";
        int k = 0;
        int expected = 3;
        int res = new LeetCode100255().minimumDeletions(word, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String word = "dabdcbdcdcd";
        int k = 2;
        int expected = 2;
        int res = new LeetCode100255().minimumDeletions(word, k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String word = "aaabaaa";
        int k = 2;
        int expected = 1;
        int res = new LeetCode100255().minimumDeletions(word, k);
        Assertions.assertEquals(expected, res);
    }
}
