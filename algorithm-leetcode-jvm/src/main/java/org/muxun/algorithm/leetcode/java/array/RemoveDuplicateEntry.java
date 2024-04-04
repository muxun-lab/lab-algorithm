package org.muxun.algorithm.leetcode.java.array;

/**
 * 第27题，移除元素
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-21 14:51
 */
public class RemoveDuplicateEntry {

    public int removeDuplicates(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果值不相同，进行替换，i是快指针
            if (nums[i] != val) {
                nums[index] = nums[i];
                // index是慢指针
                index++;
            }
        }
        return index;
    }
}
