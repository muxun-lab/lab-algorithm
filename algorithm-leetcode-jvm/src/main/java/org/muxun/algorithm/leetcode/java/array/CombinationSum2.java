package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号：40
 * 题目：组合总和II
 * 详情：给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 说明：
 * * 所有数字（包括目标数）都是正整数。
 * * 解集不能包含重复的组合。
 * @author 慕勋
 * @created 2020-02-23
 */
public class CombinationSum2 {

    private final List<List<Integer>> resultList = new LinkedList<>();

    /**
     * 思路：回溯算法
     * @param candidates 给定的正整数数组
     * @param target     解集和
     * @return 解集元素之和等于解集和的所有解集
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (target <= 0) {
            return resultList;
        }
        if (candidates.length <= 0) {
            return resultList;
        }
        Arrays.sort(candidates);
        LinkedList<Integer> backtrack = new LinkedList<>();
        backtrack(candidates, target, backtrack, 0);
        return resultList;
    }

    public void backtrack(int[] candidates, int target, LinkedList<Integer> backtrack, int start) {
        if (target == 0) {
            resultList.add(new LinkedList<>(backtrack));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                return;
            }
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            backtrack.add(candidates[i]);
            backtrack(candidates, target - candidates[i], backtrack, i + 1);
            backtrack.removeLast();
        }
    }
}
