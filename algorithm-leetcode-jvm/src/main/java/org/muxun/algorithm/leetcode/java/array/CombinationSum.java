package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号：39
 * 题目：组合总和
 * 详情：
 * 给定一个无重复元素的数组 candidates 和一个目标数 target
 * 找出 candidates 中所有可以使数字和为 target 的组合
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * 说明：
 * * 所有数字（包括 target）都是正整数。
 * * 解集不能包含重复的组合。
 * @author 慕勋
 * @created 2020-02-21
 */
public class CombinationSum {

    private final List<List<Integer>> resultList = new LinkedList<>();

    /**
     * 思路：回溯算法
     * @param candidates 给定的数组
     * @param target     相加的目标值
     * @return 所有可能结果集
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (target < 0) {
            return resultList;
        }
        if (candidates.length <= 0) {
            return resultList;
        }
        Arrays.sort(candidates);
        LinkedList<Integer> backtrack = new LinkedList<>();
        backtrack(candidates, 0, backtrack, target);
        return resultList;
    }

    public void backtrack(int[] candidates, int start, LinkedList<Integer> backtrack, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            resultList.add(new LinkedList<>(backtrack));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) {
                return;
            }
            backtrack.add(candidates[i]);
            backtrack(candidates, i, backtrack, target - candidates[i]);
            backtrack.removeLast();
        }
    }
}
