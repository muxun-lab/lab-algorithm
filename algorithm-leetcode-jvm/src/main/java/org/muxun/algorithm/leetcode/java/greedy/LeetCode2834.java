package org.muxun.algorithm.leetcode.java.greedy;

/**
 * 题号: 2834
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-the-minimum-possible-sum-of-a-beautiful-array">找出美丽数组的最小和</a>
 * <p>
 * 详情: 给你两个正整数：n 和 target 。
 * <p>
 * 如果数组 nums 满足下述条件，则称其为 美丽数组 。
 * <p>
 * * nums.length == n.
 * * nums 由两两互不相同的正整数组成。
 * <p>
 * 在范围 [0, n-1] 内，不存在 两个 不同 下标 i 和 j ，使得 nums[i] + nums[j] == target 。
 * <p>
 * 返回符合条件的美丽数组所可能具备的 最小 和，并对结果进行取模 109 + 7。
 * @author 慕勋
 * @created 2024-03-08
 */
public class LeetCode2834 {

    /**
     * 思路: 要想让数组元素之和最小，需要满足下面的条件：
     * 1. 从1开始，一直到target / 2，这样既满足元素之和最小，又满足不会有任意两个下标元素之和 = target
     * 2. 如果数组还未填满，那么继续使用 > target的部分，这样也可以满足不会有人一个两个下标元素之和 = target
     * @param n      数组元素个数
     * @param target 一对目标之和
     * @return 符合条件数组的元素之和的最小值
     */
    public int minimumPossibleSum(int n, int target) {
        final int MOD = (int) 1e9 + 7;
        int m = target / 2;
        if (n <= m) {
            return (int) ((long) (1 + n) * n / 2 % MOD);
        }
        return (int) (((long) (1 + m) * m / 2 + ((long) target + target + (n - m) - 1) * (n - m) / 2) % MOD);
    }
}
