package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 题号: 2009
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/minimum-number-of-operations-to-make-array-continuous">使数组连续的最少操作数</a>
 * <p>
 * 详情: 给你一个整数数组 nums 。每一次操作中，你可以将 nums 中 任意 一个元素替换成 任意 整数。
 * <p>
 * 如果 nums 满足以下条件，那么它是 连续的 ：
 * <p>
 * <li> nums 中所有元素都是 互不相同 的。
 * <li> nums 中 最大 元素与 最小 元素的差等于 nums.length - 1 。
 * 比方说，nums = [4, 2, 5, 3] 是 连续的 ，但是 nums = [1, 2, 3, 5, 6] 不是连续的 。
 * <p>
 * 请你返回使 nums 连续 的 最少 操作次数。
 * @author 慕勋
 * @created 2024-04-08
 */
public class LeetCode2009 {

    /**
     * 思路:
     * 1. 先去重
     * 2. 进行排序
     * 3. 然后计算窗口，根据left的值确认右窗口，然后判断当前区间内需要操作的值的数量
     * @param nums 数组
     * @return 最少操作次数
     */
    public int minOperations(int[] nums) {
        int n = nums.length;
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        List<Integer> sortList = new ArrayList<>(numSet);
        Collections.sort(sortList);
        int ans = n;
        int index = 0;
        for (int i = 0; i < sortList.size(); i++) {
            int left = sortList.get(i);
            int right = left + n - 1;
            while (index < sortList.size() && sortList.get(index) <= right) {
                ans = Math.min(ans, n - (index - i + 1));
                index++;
            }
        }
        return ans;
    }
}
