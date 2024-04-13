package org.muxun.algorithm.leetcode.competition.weekly.onehundredseventynine;

/**
 * 题号：5353
 * 题目：灯泡开关III
 * 详情：房间中有 n 枚灯泡，编号从 1 到 n，自左向右排成一排
 * 最初，所有的灯都是关着的
 * 在 k  时刻（ k 的取值范围是 0 到 n - 1），我们打开 light[k] 这个灯
 * 灯的颜色要想 变成蓝色 就必须同时满足下面两个条件：
 * * 灯处于打开状态。
 * * 排在它之前（左侧）的所有灯也都处于打开状态。
 * <p>
 * 请返回能够让 所有开着的 灯都 变成蓝色 的时刻 数目 。
 * <p>
 * 提示：
 * * n == light.length
 * * 1 <= n <= 5 * 10^4
 * * light 是 [1, 2, ..., n] 的一个排列。
 * @author sunshine
 * @created 2020-03-08
 */
public class NumTimesAllBlue {

    /**
     * 思路：
     * @param light
     * @return
     */
    public int numTimesAllBlue(int[] light) {
        if (light.length <= 0) {
            return 0;
        }
        if (light.length == 1) {
            return 1;
        }
        int count = 0;
        int[] array = new int[light.length];
        for (int i = 0; i < light.length; i++) {
            array[light[i] - 1] = 1;
            if (isLeftAllLight(array, light[i] - 1)) {
                count++;
            }
        }
        return count;
    }

    private boolean isLeftAllLight(int[] lightArray, int end) {
        for (int i = 0; i < end; i++) {
            if (lightArray[i] == 0) {
                return false;
            }
        }
        int firstZeroIndex = -2;
        for (int i = end; i < lightArray.length; i++) {
            if (lightArray[i] == 0) {
                firstZeroIndex = i;
                break;
            }
        }
        for (int i = firstZeroIndex + 1; i < lightArray.length && i > 0; i++) {
            if (lightArray[i] == 1) {
                return false;
            }
        }
        return true;
    }
}
