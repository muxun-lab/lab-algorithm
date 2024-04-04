package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/1/30
 */
@DisplayName("和为 K 的子数组测试用例")
public class LeetCode560Test {

    @Test
    public void testOne() {
        int[] nums = new int[]{1, 1, 1};
        int res = new LeetCode560().subarraySum(nums, 2);
        Assertions.assertEquals(2, res);
    }

    @Test
    public void testTwo() {
        int[] nums = new int[]{1, 2, 3};
        int res = new LeetCode560().subarraySum(nums, 3);
        Assertions.assertEquals(2, res);
    }

    @Test
    public void testThree() {
        int[] nums = new int[]{1, 1, 1};
        int res = new LeetCode560().subarraySumForce(nums, 2);
        Assertions.assertEquals(2, res);
    }

    @Test
    public void testFour() {
        int[] nums = new int[]{1, 2, 3};
        int res = new LeetCode560().subarraySumForce(nums, 3);
        Assertions.assertEquals(2, res);
    }
}
