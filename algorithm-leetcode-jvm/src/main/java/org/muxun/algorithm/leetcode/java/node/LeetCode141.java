package org.muxun.algorithm.leetcode.java.node;

import java.util.HashSet;

/**
 * 题号: 141
 * 题目: 环形链表
 * 链接: <a href="https://leetcode.cn/problems/linked-list-cycle">环形链表</a>
 * 详情: 给你一个链表的头节点 head ，判断链表中是否有环
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）
 * 注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false
 * @author 慕勋
 * @created 2024/1/31
 */
public class LeetCode141 {

    /**
     * 思路: 哈希表
     * 记录访问过的节点
     * @param head 头节点
     * @return 链表是否有环
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        HashSet<ListNode> has = new HashSet<>();
        while (head.next != null) {
            if (has.contains(head)) {
                return true;
            }
            has.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 思路: 快慢指针
     * 快指针快速移动，慢指针慢速移动，当快指针进入环内后，则一定会在一个时刻追上慢指针
     * 退出条件是
     * @param head 头节点
     * @return 链表是否有环
     */
    public boolean hasCycleOptimization(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
