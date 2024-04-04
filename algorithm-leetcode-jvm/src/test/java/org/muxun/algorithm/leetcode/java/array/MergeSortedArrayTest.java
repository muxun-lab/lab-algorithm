package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author 慕勋
 * @date 2020/1/21
 */
@DisplayName("合并两个有序数组测试类")
public class MergeSortedArrayTest {

    @Test
    public void mergedSortedArrayTestOne() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    @Test
    public void mergedSortedArrayTestTwo() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new MergeSortedArray().merge(nums1, 0, nums2, 1);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
