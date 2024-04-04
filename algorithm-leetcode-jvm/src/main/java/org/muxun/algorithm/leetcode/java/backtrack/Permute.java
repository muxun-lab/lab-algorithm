package org.muxun.algorithm.leetcode.java.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号：46
 * 题目：全排列
 * 详情：给定一个没有重复数字的序列，返回其所有可能的全排列
 * @author 慕勋
 * @created 2020-03-18
 */
public class Permute {

    private List<List<Integer>> permute;

    /**
     * 思路：回溯算法
     * @param nums 没有重复数字的序列
     * @return 给定数字的全排列
     */
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length <= 0) {
            return permute;
        }
        if (nums.length == 1) {
            return new ArrayList<>() {{
                add(new ArrayList<>() {{
                    add(nums[0]);
                }});
            }};
        }
        permute = new ArrayList<>();
        LinkedList<Integer> backtrackList = new LinkedList<>();
        backtrack(nums, backtrackList);
        return permute;
    }

    private void backtrack(int[] nums, LinkedList<Integer> backtrackList) {
        if (backtrackList.size() == nums.length) {
            permute.add(new ArrayList<>(backtrackList));
            return;
        }
        for (int current : nums) {
            if (backtrackList.contains(current)) {
                continue;
            }
            backtrackList.add(current);
            backtrack(nums, backtrackList);
            backtrackList.removeLast();
        }
    }
}
