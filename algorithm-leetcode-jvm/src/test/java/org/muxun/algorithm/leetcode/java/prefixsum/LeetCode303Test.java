package org.muxun.algorithm.leetcode.java.prefixsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-18
 */
@DisplayName("区域和检索 - 数组不可变测试用例")
public class LeetCode303Test {

    @Test
    public void testOne() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        LeetCode303 numsArray = new LeetCode303(nums);
        int expected1 = 1;
        int res1 = numsArray.sumRange(0, 2);
        int expected2 = -1;
        int res2 = numsArray.sumRange(2, 5);
        int expected3 = -3;
        int res3 = numsArray.sumRange(0, 5);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
    }
}
