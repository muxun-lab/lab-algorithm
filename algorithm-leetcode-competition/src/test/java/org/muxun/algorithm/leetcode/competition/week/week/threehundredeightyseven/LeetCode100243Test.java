package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyseven.LeetCode100243;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("")
public class LeetCode100243Test {

    @Test
    public void testOne() {
        int[] nums = {1, 2, 14, 15};
        int[] expected = {1, 2, 14, 15};
        int[] res = new LeetCode100243().resultArray(nums);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {2, 1, 3};
        int[] expected = {2, 3, 1};
        int[] res = new LeetCode100243().resultArray(nums);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = {5, 4, 3, 8};
        int[] expected = {5, 3, 4, 8};
        int[] res = new LeetCode100243().resultArray(nums);
        Assertions.assertArrayEquals(expected, res);
    }
}
