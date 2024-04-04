package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：448
 * 题目：找到数组中消失的数字
 * 详情：给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * @author 慕勋
 * @created 2020-02-10
 */
public class FindDisappearedNumbers {

    /**
     * 思路：负数标记法
     * @param nums 给定的正整数数组
     * @return 消失的数字集合
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                resultList.add(i);
            }
        }
        return resultList;
    }
}
