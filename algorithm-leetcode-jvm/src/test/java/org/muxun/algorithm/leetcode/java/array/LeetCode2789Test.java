package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-14
 */
@DisplayName("合并后数组中的最大元素测试用例")
public class LeetCode2789Test {

    @Test
    public void testOne() {
        int[] nums = {2, 3, 7, 9, 3};
        long expected = 21;
        long res = new LeetCode2789().maxArrayValue(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {5, 3, 3};
        long expected = 11;
        long res = new LeetCode2789().maxArrayValue(nums);
        Assertions.assertEquals(expected, res);
    }
}
