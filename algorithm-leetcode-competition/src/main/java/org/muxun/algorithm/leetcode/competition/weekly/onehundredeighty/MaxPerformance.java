package org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题号：5359
 * 题目：最大的团队表现值
 * 详情：公司有编号为 1 到 n 的 n 个工程师，给你两个数组 speed 和 efficiency
 * 其中 speed[i] 和 efficiency[i] 分别代表第 i 位工程师的速度和效率
 * 请你返回由最多 k 个工程师组成的​​​​​​最大团队表现值
 * 由于答案可能很大，请你返回结果对10^9 + 7取余后的结果
 * 团队表现值的定义为：一个团队中「所有工程师速度的和」乘以他们「效率值中的最小值」
 * @author sunshine
 * @created 2020-03-15
 */
public class MaxPerformance {

    /**
     * 思路：贪心算法
     * 效率值中的最小值：可以视为效率数组中每个值都为最小值
     * 以效率数组中的值作为中心点，取前k个最大工作速度最大的元素，进行相乘，获取值
     * @param n          员工数量
     * @param speed      员工工作速度数组
     * @param efficiency 员工工作效率数组
     * @param k          组成团队的员工数量
     * @return 团队内表现值的最大值
     */
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] efficiencySpeedArray = new int[n][2];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            efficiencySpeedArray[i][0] = efficiency[i];
            efficiencySpeedArray[i][1] = speed[i];
        }
        // 按照效率降序排序
        Arrays.sort(efficiencySpeedArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        long sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            heap.add(efficiencySpeedArray[i][1]);
            sum += efficiencySpeedArray[i][1];
            // 超出员工数量，则将小的值去除
            if (heap.size() > k) {
                sum -= heap.poll();
            }
            // 以效率值为基准点，获取最大值，由于已经排序，则最大值会出现在k个及以后
            max = Math.max(max, sum * efficiencySpeedArray[i][0]);
        }
        return (int) (max % ((int) 1e9 + 7));
    }
}
