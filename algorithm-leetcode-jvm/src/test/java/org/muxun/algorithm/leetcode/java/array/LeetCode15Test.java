package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/1/20
 */
@DisplayName("三数之和测试类")
public class LeetCode15Test {

    private int[] nums;

    @Test
    public void threeSumTestOne() {
        nums = new int[]{-1, 0, 1, 2, -1, -4};
        new LeetCode15().threeSum(nums).forEach(System.out::println);
    }

    @Test
    public void threeSumTestTwo() {
        nums = new int[]{-2, 0, 0, 2, 2};
        new LeetCode15().threeSum(nums).forEach(System.out::println);
    }

    @Test
    public void threeSumTestThree() {
        nums = new int[]{-1, 0, 1, 2, -1, -4};
        new LeetCode15().threeSum(nums).forEach(System.out::println);
    }

    @Test
    public void threeSumTestFour() {
        nums = new int[]{0, -4, -1, -4, -2, -3, 2};
        new LeetCode15().threeSum(nums).forEach(System.out::println);
    }
}
