package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-01-30
 */
@DisplayName("四数之和测试用例")
public class LeetCode18Test {

    @Test
    public void fourSumTestOne() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> resList = new LeetCode18().fourSum(nums, target);
        List<List<Integer>> expected = List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void fourSumTestTwo() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> resList = new LeetCode18().fourSum(nums, target);
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2));
        Assertions.assertIterableEquals(expected, resList);
    }
}
