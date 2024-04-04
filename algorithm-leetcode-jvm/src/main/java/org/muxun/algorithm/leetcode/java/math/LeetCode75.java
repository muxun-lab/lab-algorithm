package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号: 75
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/sort-colors">颜色分类</a>
 * <p>
 * 详情: 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode75 {

    /**
     * 思路: 两次排序
     * 1. 第一次排序中置换0的位置
     * 2. 第二次接着上次排序继续，置换1的位置
     * @param nums 数组
     */
    public void sortColors(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        for (int i = index; i < n; i++) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}
