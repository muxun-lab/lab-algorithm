package org.muxun.algorithm.leetcode.java.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/13
 */
@DisplayName("寻找重复数测试用例")
public class LeetCode287Test {

    @Test
    public void testOne() {
        int[] nums = {1, 3, 4, 2, 2};
        int res = new LeetCode287().findDuplicate(nums);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {3, 1, 3, 4, 2};
        int res = new LeetCode287().findDuplicate(nums);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }
}
