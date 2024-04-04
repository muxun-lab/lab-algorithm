package org.muxun.algorithm.leetcode.java.array;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * 题号: 239
 * 题目: 滑动窗口最大值
 * 链接: <a href="https://leetcode.cn/problems/sliding-window-maximum">滑动窗口最大值</a>
 * 详情: 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位
 * 返回 滑动窗口中的最大值
 * @author 慕勋
 * @created 2024/1/30
 */
public class LeetCode239 {

    /**
     * 思路: 单调队列
     * 对于两个相邻的窗口，只有一个元素是发生变化的
     * @param nums 指定数组
     * @param k    看到的数字个数
     * @return 滑动窗口最大值
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 1 - k, j = 0; j < nums.length; i++, j++) {
            // 删除deque中对应的nums[i-1]
            if (i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            // 保持deque递减
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if (i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }

    /**
     * 思路: 双向队列
     * 双向队列是通俗易懂的单调队列
     * @param nums 指定数组
     * @param k    看到的数字个数
     * @return 滑动窗口最大值
     */
    public int[] maxSlidingWindowDeque(int[] nums, int k) {
        if (Objects.isNull(nums) || nums.length < 2) {
            return nums;
        }
        // 双向队列
        // 保存当前窗口的最大值的数组位置
        // 保证队列中数组位置的数值按照从大到小进行排序
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            // 保证从大到小，如果前面的数字小，则弹出队列，直到满足需求
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            // 添加下标，便于取值方便
            queue.addLast(i);
            // 判断当前队列中队首的值是否有效
            if (queue.peekFirst() <= i - k) {
                queue.poll();
            }
            // 当形成窗口的时候，保存当前窗口的最大值
            if (i + 1 >= k) {
                res[i + 1 - k] = nums[queue.peek()];
            }
        }
        return res;
    }
}
