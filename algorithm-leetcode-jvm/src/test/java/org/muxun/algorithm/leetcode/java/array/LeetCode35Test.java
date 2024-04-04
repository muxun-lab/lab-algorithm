package org.muxun.algorithm.leetcode.java.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/1/20
 */
@DisplayName("搜索传入位置测试用例")
public class LeetCode35Test {

    @Test
    public void testOne() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int res = new LeetCode35().searchInsert(nums, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        int res = new LeetCode35().searchInsert(nums, target);
        Assertions.assertEquals(expected, res);
        System.out.println(new LeetCode35().searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void testThree() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        int res = new LeetCode35().searchInsert(nums, target);
        Assertions.assertEquals(expected, res);
        System.out.println(new LeetCode35().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    public void testFour() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int expected = 0;
        int res = new LeetCode35().searchInsert(nums, target);
        Assertions.assertEquals(expected, res);
    }
}
