package org.muxun.algorithm.leetcode.java.node;

import java.util.HashMap;

/**
 * 题号：82
 * 题目：删除排序链表中的重复元素II
 * 详情：给定一个排序链表，删除所有含有重复数字的节点
 * 只保留原始链表中「没有重复出现」的数字
 * @author 慕勋
 * @created 2020-03-17
 */
public class DeleteDumplicates {

    /**
     * 思路：哈希表
     * @param head 给定链表的头结点
     * @return 移除重复元素的链表
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = new ListNode(0);
        q.next = head;
        ListNode r = q;
        ListNode s = q;
        HashMap<Integer, Boolean> duplicateRemarkMap = new HashMap<>();
        while (p != null) {
            if (duplicateRemarkMap.containsKey(p.val)) {
                duplicateRemarkMap.put(p.val, Boolean.TRUE);
            } else {
                duplicateRemarkMap.put(p.val, Boolean.FALSE);
            }
            p = p.next;
        }
        while (r.next != null) {
            r = r.next;
            if (duplicateRemarkMap.get(r.val)) {
                s.next = r.next;
            } else {
                s = r;
            }
        }
        return q.next;
    }

    /**
     * 思路：双指针
     * @param head 给定链表的头结点
     * @return 移除重复元素的链表
     */
    public ListNode deleteDuplicatesDoublePointer(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = new ListNode(0);
        p.next = head;
        // 先锋节点
        ListNode q = head;
        // 在不重复位置上的节点
        ListNode r = p;
        boolean flag = false;
        while (q != null) {
            if (q.next != null && q.val == q.next.val) {
                while (q.next != null && q.val == q.next.val) {
                    q = q.next;
                }
                flag = true;
            } else {
                if (flag) {
                    r.next = q;
                    flag = false;
                }
                r = q;
            }
            q = q.next;
        }
        if (flag) {
            r.next = null;
        }
        return p.next;
    }

    /**
     * 思路：递归
     * @param head 给定链表的头结点
     * @return 移除重复元素的链表
     */
    public ListNode deleteDuplicatesRecursion(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}
