package org.muxun.algorithm.leetcode.competition.week.week.threehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredninety.LeetCode100258;

/**
 * @author 慕勋
 * @created 2024-03-24
 */
@DisplayName("最高频率的 ID测试用例")
public class LeetCode100258Test {

    @Test
    public void testOne() {
        int[] nums = {2, 3, 2, 1};
        int[] freq = {3, 2, -3, 1};
        long[] expected = {3, 3, 2, 2};
        long[] res = new LeetCode100258().mostFrequentIDs(nums, freq);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {5, 5, 3};
        int[] freq = {2, -2, 1};
        long[] expected = {2, 0, 1};
        long[] res = new LeetCode100258().mostFrequentIDs(nums, freq);
        Assertions.assertArrayEquals(expected, res);
    }
}
