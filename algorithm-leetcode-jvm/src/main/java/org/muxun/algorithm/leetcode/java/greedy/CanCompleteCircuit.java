package org.muxun.algorithm.leetcode.java.greedy;

/**
 * 题号：134
 * 题目：加油站
 * 详情：
 * 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * <p>
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 * <p>
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 * <p>
 * 说明:
 * 如果题目有解，该答案即为唯一答案。
 * 输入数组均为非空数组，且长度相同。
 * 输入数组中的元素均为非负数。
 * @author 慕勋
 * @created 2020-02-14
 */
public class CanCompleteCircuit {

    /**
     * 思路：总油量的剩余值必须都≥0，所有点都在处于总油量≥0的情况时，最低点即为出发点
     * @param gas  加油汽油
     * @param cost 从i到第i+1个汽油站，消耗的汽油
     * @return 是否可以绕路行驶一周的起始索引，不能绕路行驶一周，则返 回-1
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < min) {
                min = sum;
                index = i;
            }
        }
        return sum < 0 ? -1 : (index + 1) % gas.length;
    }

    /**
     * 思路：有点类似双重循环
     * 可以优化为一次循环
     * @param gas  加油汽油
     * @param cost 从i到第i+1个汽油站，消耗的汽油
     * @return 是否可以绕路行驶一周的起始索引，不能绕路行驶一周，则返 回-1
     */
    public int canCompleteCircuitOld(int[] gas, int[] cost) {
        int result = -1;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] < cost[i]) {
                continue;
            }
            // 以i为起点，看是否能走一圈
            int gasCount = gas[i];
            int cosCount = cost[i];
            int index = i + 1;
            boolean flag = true;
            while (true) {
                if (index > gas.length - 1) {
                    index = 0;
                }
                gasCount += gas[index];
                cosCount += cost[index];
                if (gasCount < cosCount || (gasCount == cosCount && (index + 1) % gas.length != i)) {
                    flag = false;
                    break;
                }
                if (++index % gas.length == i) {
                    break;
                }
            }
            if (!flag) {
                continue;
            }
            return i;
        }
        return result;
    }
}
