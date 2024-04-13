package org.muxun.algorithm.leetcode.competition.doubleweekly.onehundredtwentysix;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 100262
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/biweekly-contest-126/problems">求出加密整数的和</a>
 * <p>
 * 详情: 给你一个整数数组 nums ，数组中的元素都是 正 整数。
 * <p>
 * 定义一个加密函数 encrypt ，encrypt(x) 将一个整数 x 中 每一个 数位都用 x 中的 最大 数位替换。
 * <p>
 * 比方说 encrypt(523) = 555 且 encrypt(213) = 333 。
 * <p>
 * 请你返回数组中所有元素加密后的 和 。
 * @author 慕勋
 * @created 2024-03-16
 */
public class LeetCode100262 {

    /**
     * 思路: 暴力解决
     * @param nums 数组
     * @return 加密元素之和
     */
    public int sumOfEncryptedInt(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            String str = String.valueOf(num);
            int max = str.charAt(0) - '0';
            for (int i = 1; i < str.length(); i++) {
                max = Math.max(max, str.charAt(i) - '0');
            }
            numList.add(Integer.valueOf(String.valueOf(max).repeat(str.length())));
        }
        int sum = 0;
        for (int num : numList) {
            sum += num;
        }
        return sum;
    }
}
