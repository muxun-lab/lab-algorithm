package org.muxun.algorithm.leetcode.competition.week.doubleweek.onehundredtwentysix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentysix.LeetCode100262;

/**
 * @author 慕勋
 * @created 2024-03-16
 */
@DisplayName("求出加密整数的和测试用例")
public class LeetCode100262Test {

    @Test
    public void testOne() {
        int[] nums = {10, 21, 31};
        int expected = 66;
        int res = new LeetCode100262().sumOfEncryptedInt(nums);
        Assertions.assertEquals(expected, res);
    }
}
