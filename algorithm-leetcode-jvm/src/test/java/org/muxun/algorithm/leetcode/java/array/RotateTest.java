package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author 慕勋
 * @date 2018-12-26 20:47
 */
@DisplayName("旋转数组测试类")
public class RotateTest {

    @Test
    public void rotateTestOne() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Rotate().rotate(nums, 3);
        Arrays.stream(nums).forEach(System.out::println);
    }

    @Test
    public void rotateTestTwo() {
        int[] nums = new int[]{-1, -100, 3, 99};
        new Rotate().rotate(nums, 2);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
