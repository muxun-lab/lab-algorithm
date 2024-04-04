package org.muxun.algorithm.leetcode.java.stack;

import java.util.LinkedList;

/**
 * 题号: 155
 * 题目: 最小栈
 * 链接: <a href="https://leetcode.cn/problems/min-stack/description">最小栈</a>
 * 详情: 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * 实现 MinStack 类:
 * * MinStack() 初始化堆栈对象。
 * * void push(int val) 将元素val推入堆栈。
 * * void pop() 删除堆栈顶部的元素。
 * * int top() 获取堆栈顶部的元素。
 * * int getMin() 获取堆栈中的最小元素。
 * @author 慕勋
 * @created 2024/2/11
 */
public class LeetCode155 {

    private final LinkedList<Integer> min;

    private final LinkedList<Integer> stack;

    /**
     * 思路: 需要使用辅助栈，计算最小值，只记录每次push的时刻的最小值即可
     * 出栈的时候也要对相应的值进行出栈
     */
    public LeetCode155() {
        min = new LinkedList<>();
        min.push(Integer.MAX_VALUE);
        stack = new LinkedList<>();
    }

    public void push(int val) {
        stack.push(val);
        min.push(Math.min(min.peek(), val));
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
