package org.muxun.algorithm.leetcode.java.math;

/**
 * 题号: 136
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/single-number">只出现一次的数字</a>
 * <p>
 * 详情: 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode136 {

    /**
     * 思路: 异或运算
     * 1. 任何数字和0进行异或运算，结果是数字本身
     * 2. 任何数字和自身进行异或运算，结果是0
     * 3. 所以对数组中所有的数字进行异或运算，结果最后为0^b，即为b
     * @param nums 数组
     * @return 只出现一次的数字
     */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
