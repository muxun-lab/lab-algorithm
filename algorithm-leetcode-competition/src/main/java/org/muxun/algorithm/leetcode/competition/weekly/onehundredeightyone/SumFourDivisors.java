package org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone;

/**
 * 题号：5178
 * 题目：四因数
 * 详情：给你一个整数数组nums，请你返回该数组中恰有四个因数的这些整数的各因数之和
 * 如果数组中不存在满足题意的整数，则返回0
 * 注意：返回结果是四个因数的的和，比如数组中有两个数符合四个因数的条件，则返回这两个数的四个因数之和
 * 由于数的大小限制，暴力破解会超出时间限制
 * @author sunshine
 * @created 2020-03-22
 */
public class SumFourDivisors {

    /**
     * 思路：
     * @param nums 给定的数组
     * @return 因数为4的所有因数之和
     */
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int count = 0, sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    count++;
                    break;
                }
                if (num % i == 0) {
                    count += 2;
                    sum += i + num / i;
                }
                if (count > 4) {
                    break;
                }
            }
            if (count == 4) {
                ans += sum;
            }
        }
        return ans;
    }
}
