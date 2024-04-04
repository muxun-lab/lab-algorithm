package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-01-30
 */
@DisplayName("下一个排列测试")
public class NextGenerationTest {

    @Test
    public void nextGenerationTestOne() {
        int[] nums = new int[]{1, 2, 3};
        new NextGeneration().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    public void nextGenerationTestTwo() {
        int[] nums = new int[]{1, 1, 5};
        new NextGeneration().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

    @Test
    public void nextGenerationTestThree() {
        int[] nums = new int[]{3, 2, 1};
        new NextGeneration().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    public void nextGenerationTestFour() {
        int[] nums = new int[]{1, 3, 2};
        new NextGeneration().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{2, 1, 3}, nums);
    }
}
