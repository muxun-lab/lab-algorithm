package org.muxun.algorithm.leetcode.java.array;

/**
 * 题目：两数之和
 * 给定一个已按照升序排列的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * * 返回的下标值（index1 和 index2）不是从零开始的。
 * * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 题号：167
 * 利用Map之前已经用过，这里使用双指针
 * @author 慕勋
 * @created 2020-01-29
 */
public class TwoSumSortedArray {

    /**
     * 思路：双指针从索引0和索引number.length-1开始遍历
     * 由于数组是升序的，使用升序的概念缩小指针：
     * @param numbers 升序数组
     * @param target  目标和
     * @return 符合target值的索引数组
     */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[2];
    }
}
