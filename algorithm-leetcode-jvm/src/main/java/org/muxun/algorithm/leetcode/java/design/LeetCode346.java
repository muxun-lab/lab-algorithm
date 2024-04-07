package org.muxun.algorithm.leetcode.java.design;

import java.util.LinkedList;

/**
 * 题号: 346
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/moving-average-from-data-stream">数据流中的移动平均值</a>
 * <p>
 * 详情: 给定一个整数数据流和一个窗口大小，根据该滑动窗口的大小，计算其所有整数的移动平均值。
 * <p>
 * 实现 MovingAverage 类：
 * <p>
 * <li> MovingAverage(int size) 用窗口大小 size 初始化对象。
 * <li> double next(int val) 计算并返回数据流中最后 size 个值的移动平均值。
 * @author 慕勋
 * @created 2024-04-07
 */
public class LeetCode346 {

    private final int size;
    private final LinkedList<Integer> stack;

    /**
     * 思路: 使用栈存储元素
     * 优化: 可以控制栈的长度，避免超时
     * @param size 初始值
     */
    public LeetCode346(int size) {
        this.size = size;
        this.stack = new LinkedList<>();
    }

    public double next(int val) {
        if (stack.size() == size) {
            stack.removeLast();
        }
        stack.push(val);
        double sum = 0;
        for (int num : stack) {
            sum += num;
        }
        return sum / stack.size();
    }
}
