package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号：21
 * <p>
 * 题链：<a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">合并两个有序链表</a>
 * <p>
 * 详情：将两个升序链表合并为一个新的升序链表并返回
 * <p>
 * 新链表是通过拼接给定的两个链表的所有节点组成的
 * @author 慕勋
 * @created 2020-05-13
 */
public class LeetCode21 {

    /**
     * 思路：开辟新的链表空间
     * @param l1 第一个升序链表
     * @param l2 第二个升序链表
     * @return 合并后的链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode q = new ListNode(0);
        p.next = q;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                q.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                q.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                q.next = new ListNode(l1.val);
                q = q.next;
                q.next = new ListNode(l2.val);
                l1 = l1.next;
                l2 = l2.next;
            }
            q = q.next;
        }
        q.next = (l1 == null) ? l2 : l1;
        return p.next.next;
    }
}
