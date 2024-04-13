package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyseven;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode100243 {

    /**
     * 思路:
     * @param nums 数组
     * @return 连接后的数组
     */
    public int[] resultArray(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int lastA = getLast(a);
            int lastB = getLast(b);
            int cur = nums[i];
            if (lastA > lastB) {
                a.add(cur);
            } else {
                b.add(cur);
            }
        }
        a.addAll(b);
        int[] res = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            res[i] = a.get(i);
        }
        return res;
    }

    private int getLast(List<Integer> list) {
        return list.get(list.size() - 1);
    }
}
