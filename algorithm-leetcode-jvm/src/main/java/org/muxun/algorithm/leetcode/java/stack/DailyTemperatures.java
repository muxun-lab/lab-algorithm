package org.muxun.algorithm.leetcode.java.stack;

import java.util.Objects;
import java.util.Stack;

/**
 * 题号：739
 * 题目：每日温度
 * 题链：https://leetcode-cn.com/problems/daily-temperatures/
 * 详情：请根据每日 气温 列表，重新生成一个列表
 * 对应位置的输出为：
 * * 要想观测到更高的气温，至少需要等待的天数
 * * 如果气温在这之后都不会升高，请在该位置用 0 来代替
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数
 * @author 慕勋
 * @date 2020/6/11
 */
public class DailyTemperatures {

    /**
     * 思路：暴力
     * @param T 温度区间
     * @return 温度波动结果
     */
    public int[] dailyTemperatures(int[] T) {
        if (Objects.isNull(T)) {
            return new int[]{};
        }
        int[] result = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int distance = 0;
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    distance = j - i;
                    break;
                }
            }
            result[i] = distance;
        }
        return result;
    }

    /**
     * 思路：递减栈
     * @param T 温度区间
     * @return 温度波动结果
     */
    public int[] dailyTemperaturesStack(int[] T) {
        if (Objects.isNull(T)) {
            return new int[]{};
        }
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                result[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
