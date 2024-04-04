package org.muxun.algorithm.leetcode.java.backtrack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/2/1
 */
@DisplayName("子集测试用例")
public class LeetCode78Test {

    @Test
    public void testOne() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = List.of(List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
        List<List<Integer>> res = new LeetCode78().subsets(nums);
    }

    @Test
    public void testTwo() {
        int[] nums = new int[]{0};
        List<List<Integer>> expected = List.of(List.of(), List.of(0));
        List<List<Integer>> res = new LeetCode78().subsets(nums);
    }
}
