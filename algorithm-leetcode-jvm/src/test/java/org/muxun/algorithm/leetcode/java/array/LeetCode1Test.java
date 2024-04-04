package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author 慕勋
 * @created 2020-01-29
 */
@DisplayName("两数之和数组升序版测试类")
public class LeetCode1Test {

    @Test
    public void twoSumSortedArrayTestOne() {
        Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
    }

    @Test
    public void twoSumSortedArrayTestTwo() {
        Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2}, 9)).forEach(System.out::println);
    }

    @Test
    public void twoSumSortedArrayTestThree() {
        Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2, 3}, 9)).forEach(System.out::println);
    }

    @Test
    public void twoSumSortedArrayTestFour() {
        Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2, 7}, 9)).forEach(System.out::println);
    }

    @Test
    public void twoAdderTestOne() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = new LeetCode1().twoSumFirstSolution(nums, 9);
        Arrays.stream(result).forEach(System.out::println);
    }

    @Test
    public void twoAdderTestTwo() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = new LeetCode1().twoSumSecondSolution(nums, 9);
        Arrays.stream(result).forEach(System.out::println);
    }

    @Test
    public void twoAdderTestThree() {
        int[] nums = new int[]{3, 2, 4};
        int[] result = new LeetCode1().twoSumSecondSolution(nums, 6);
        Arrays.stream(result).forEach(System.out::println);
    }
}
