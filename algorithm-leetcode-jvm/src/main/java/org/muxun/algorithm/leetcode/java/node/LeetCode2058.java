package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 2058
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points">找出临界点之间的最小和最大距离</a>
 * <p>
 * 详情: 链表中的 临界点 定义为一个 局部极大值点 或 局部极小值点 。
 * <p>
 * 如果当前节点的值 严格大于 前一个节点和后一个节点，那么这个节点就是一个  局部极大值点 。
 * <p>
 * 如果当前节点的值 严格小于 前一个节点和后一个节点，那么这个节点就是一个  局部极小值点 。
 * <p>
 * 注意：节点只有在同时存在前一个节点和后一个节点的情况下，才能成为一个 局部极大值点 / 极小值点 。
 * <p>
 * 给你一个链表 head ，返回一个长度为 2 的数组 [minDistance, maxDistance] ，其中 minDistance 是任意两个不同临界点之间的最小距离，maxDistance 是任意两个不同临界点之间的最大距离。
 * <p>
 * 如果临界点少于两个，则返回 [-1，-1] 。
 * @author 慕勋
 * @created 2024-03-09
 */
public class LeetCode2058 {

    /**
     * 思路: 结点记录
     * 1. 记录第一次出现局部结点的情况
     * 2. 记录上一次出现局部节点的情况
     * 3. 遇到第三个节点，分别记录和第一个节点和上一个节点的距离，分别更新最大距离和最小距离
     * @param head 头节点
     * @return 最小距离和最大距离
     */
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int first = -1;
        int prev = -1;
        int cur = -1;
        int index = 1;
        ListNode p = head;
        ListNode q = head.next;
        while (q.next != null) {
            ListNode next = q.next;
            if ((q.val > p.val && q.val > next.val) || (q.val < p.val && q.val < next.val)) {
                if (first < 0) {
                    first = index;
                }
                prev = cur;
                cur = index;
                if (prev >= 0) {
                    min = Math.min(min, cur - prev);
                    max = Math.max(max, cur - first);
                }
            }
            p = q;
            q = next;
            index++;
        }
        if (min <= max) {
            return new int[]{min, max};
        } else {
            return new int[]{-1, -1};
        }
    }
}
