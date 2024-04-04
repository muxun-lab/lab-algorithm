package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/1/30
 */
@DisplayName("滑动窗口最大值测试用例")
public class LeetCode239Test {

    @Test
    public void testOne() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = new LeetCode239().maxSlidingWindow(nums, 3);
        int[] expected = new int[]{3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = new int[]{1};
        int[] res = new LeetCode239().maxSlidingWindow(nums, 1);
        int[] expected = new int[]{1};
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testThree() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = new LeetCode239().maxSlidingWindowDeque(nums, 3);
        int[] expected = new int[]{3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testFour() {
        int[] nums = new int[]{1};
        int[] res = new LeetCode239().maxSlidingWindowDeque(nums, 1);
        int[] expected = new int[]{1};
        Assertions.assertArrayEquals(expected, res);
    }
}
