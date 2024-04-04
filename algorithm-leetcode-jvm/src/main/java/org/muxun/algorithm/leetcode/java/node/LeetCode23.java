package org.muxun.algorithm.leetcode.java.node;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题号: 23
 * 题目: 合并K个升序链表
 * 链接: <a href="https://leetcode.cn/problems/merge-k-sorted-lists">合并K个升序链表</a>
 * 详情: 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * @author 慕勋
 * @created 2024/2/6
 */
public class LeetCode23 {

    /**
     * 思路: 小顶堆
     * 堆顶一定是最小的元素，因为是升序的，所以每次将当前节点的下一个节点推到堆中，就可以直接获取堆顶的元素
     * @param lists 多个升序链表
     * @return 一条升序链表
     */
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode head : lists) {
            if (head != null) {
                queue.offer(head);
            }
        }
        ListNode p = new ListNode(0);
        ListNode cur = p;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            if (node.next != null) {
                queue.offer(node.next);
            }
            cur.next = node;
            cur = cur.next;
        }
        return p.next;
    }
}
