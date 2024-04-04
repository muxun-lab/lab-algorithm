package org.muxun.algorithm.leetcode.java.array;

import java.util.TreeSet;

/**
 * 题号：414
 * 题目：第三大的数
 * 详情：给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * @author 慕勋
 * @created 2020-02-09
 */
public class ThirdMax {

    /**
     * 思路：
     * @param nums 给定的数组
     * @return 第三大的数
     */
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int count = 0;
        boolean flag = true;
        for (int num : nums) {
            if (num == Integer.MIN_VALUE && flag) {
                count++;
                flag = false;
            }
            if (num > firstMax) {
                count++;
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                count++;
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != firstMax && num != secondMax) {
                count++;
                thirdMax = num;
            }
        }
        return count >= 3 ? thirdMax : firstMax;
    }

    /**
     * 思路：红黑树
     * @param nums 给定的数组
     * @return 第三大的数
     */
    public int thirdMaxUpgrade(int[] nums) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        for (int num : nums) {
            resultSet.add(num);
        }
        if (resultSet.size() >= 3) {
            resultSet.remove(resultSet.last());
            resultSet.remove(resultSet.last());
        }
        return resultSet.last();
    }
}
