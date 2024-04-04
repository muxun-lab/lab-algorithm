package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-14
 */
@DisplayName("最长上升子序列单元测试")
public class LeetCode300Test {

    @Test
    public void lengthOfLISTestOne() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        int res = new LeetCode300().lengthOfLIS(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void lengthOfLISUpgradeTestOne() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        int res = new LeetCode300().lengthOfLISByGreedy(nums);
        Assertions.assertEquals(expected, res);
    }
}
