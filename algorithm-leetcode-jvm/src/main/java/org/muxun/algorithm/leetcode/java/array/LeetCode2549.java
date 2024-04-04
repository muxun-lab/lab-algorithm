package org.muxun.algorithm.leetcode.java.array;

import java.util.Arrays;

/**
 * 题号: 2549
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/count-distinct-numbers-on-board">统计桌面上的不同数字</a>
 * <p>
 * 详情: 给你一个正整数 n ，开始时，它放在桌面上。在 109 天内，每天都要执行下述步骤：
 * <p>
 * <li> 对于出现在桌面上的每个数字 x ，找出符合 1 <= i <= n 且满足 x % i == 1 的所有数字 i 。
 * <li> 然后，将这些数字放在桌面上。
 * 返回在 109 天之后，出现在桌面上的 不同 整数的数目。
 * @author 慕勋
 * @created 2024-03-23
 */
public class LeetCode2549 {

    /**
     * 思路: 使用数组记录出现在桌面上的次数
     * @param n 正整数
     * @return 出现在桌面上的不同整数的数目
     */
    public int distinctIntegers(int n) {
        int[] nums = new int[n + 1];
        nums[n] = 1;
        for (int k = 0; k < n; k++) {
            for (int x = 1; x <= n; x++) {
                if (nums[x] == 0) {
                    continue;
                }
                for (int i = 1; i <= n; i++) {
                    if (x % i == 1) {
                        nums[i] = 1;
                    }
                }
            }
        }
        return Arrays.stream(nums).sum();
    }
}
