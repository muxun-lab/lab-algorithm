package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-16
 */
@DisplayName("寻找两个有序数组的中位数测试用例")
public class LeetCode4Test {

    @Test
    public void testOne() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;
        double res = new LeetCode4().findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;
        double res = new LeetCode4().findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(expected, res);
    }
}
