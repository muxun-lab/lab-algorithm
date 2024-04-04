package org.muxun.algorithm.leetcode.java.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 78
 * 题目: 子集
 * 链接: <a href="https://leetcode.cn/problems/subsets">子集</a>
 * 详情: 给你一个整数数组 nums ，数组中的元素 互不相同
 * 返回该数组所有可能的子集（幂集）
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集
 * @author 慕勋
 * @created 2024/2/1
 */
public class LeetCode78 {

    private List<List<Integer>> backtracks;

    private int n;

    /**
     * 思路: 回溯
     * @param nums 指定整数数组
     * @return 所有子集
     */
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        backtracks = new ArrayList<>();
        List<Integer> backtrack = new ArrayList<>();
        backtrack(nums, 0, backtrack);
        return backtracks;
    }

    private void backtrack(int[] nums, int x, List<Integer> backtrack) {
        if (x == n) {
            backtracks.add(new ArrayList<>(backtrack));
            return;
        }
        backtrack.add(nums[x]);
        backtrack(nums, x + 1, backtrack);
        backtrack.remove(backtrack.size() - 1);
        backtrack(nums, x + 1, backtrack);
    }
}
