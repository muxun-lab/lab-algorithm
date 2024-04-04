package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 143
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/reorder-list">重排链表</a>
 * <p>
 * 详情: 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 * <p>
 * L0 L1 L2 ... Ln-2 Ln
 * 请将其重新排列后变为：
 * L0 Ln L1 Ln-2 ....
 * @author 慕勋
 * @created 2024/3/2
 */
public class LeetCode143 {

    /**
     * 思路: 先反转链表，然后再双指针递进修改
     * 思路没问题，但是不需要完全反转链表，只需要反转一半即可
     * @param head 头节点
     */
    public void reorderList(ListNode head) {
        // 寻找链表中间节点
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 反转链表
        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        l2 = reverse(l2);
        // 合并链表
        merge(l1, l2);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    private void merge(ListNode l1, ListNode l2) {
        ListNode temp1 = null;
        ListNode temp2 = null;
        while (l1 != null && l2 != null) {
            temp1 = l1.next;
            temp2 = l2.next;

            l1.next = l2;
            l1 = temp1;

            l2.next = l1;
            l2 = temp2;
        }
    }
}
