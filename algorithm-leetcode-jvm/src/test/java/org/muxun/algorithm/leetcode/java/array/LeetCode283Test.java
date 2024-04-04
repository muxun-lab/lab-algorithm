package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-01-29
 */
@DisplayName("移动零测试")
public class LeetCode283Test {

    @Test
    public void moveZeroesTestOne() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void moveZeroesTestTwo() {
        int[] nums = new int[]{0, 0, 1};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    public void moveZeroesTestThree() {
        int[] nums = new int[]{0, 0};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{0, 0}, nums);
    }

    @Test
    public void moveZeroesTestFour() {
        int[] nums = new int[]{1, 0, 1};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 1, 0}, nums);
    }

    @Test
    public void moveZeroesOptimizationTestOne() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void moveZeroesOptimizationTestTwo() {
        int[] nums = new int[]{0, 0, 1};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    public void moveZeroesOptimizationTestThree() {
        int[] nums = new int[]{0, 0};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{0, 0}, nums);
    }

    @Test
    public void moveZeroesOptimizationTestFour() {
        int[] nums = new int[]{1, 0, 1};
        new LeetCode283().moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 1, 0}, nums);
    }
}
