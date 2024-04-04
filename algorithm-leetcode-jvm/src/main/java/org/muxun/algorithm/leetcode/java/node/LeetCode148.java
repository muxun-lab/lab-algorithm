package org.muxun.algorithm.leetcode.java.node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题号: 148
 * 题目: 排序链表
 * 链接: <a href="https://leetcode.cn/problems/sort-list">排序链表</a>
 * 详情: 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表
 * @author 慕勋
 * @created 2024/1/31
 */
public class LeetCode148 {

    /**
     * 思路: 数组排序，重建链表
     * @param head 头节点
     * @return 排序后的链表
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        head = new ListNode(list.get(0));
        ListNode p = head;
        for (int i = 1; i < list.size(); i++) {
            p.next = new ListNode(list.get(i));
            p = p.next;
        }
        return head;
    }

    /**
     * 思路: 最适合链表排序的是归并排序
     * 找到链表的中点，以中点为分界，可以将链表分为两个子链表
     * 1. 寻找链表的中点可以用快慢指针的做法，快指针每次移动2步，慢指针每次移动1步
     * 当快指针到达链表的末尾时，慢指针指向链表的中点
     * 2. 对两个子链表分别进行排序
     * 3. 将两个排序后的子链表合并，得到完整的排序后的链表
     * 上述过程可以通过递归进行实现，递归的终止条件是子链表数组无法继续拆分
     * @param head 头节点
     * @return 排序后的链表
     */
    public ListNode sortListByMerge(ListNode head) {
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return null;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode left = sortList(head, mid);
        ListNode right = sortList(mid, tail);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode temp1 = left;
        ListNode temp2 = right;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }
        return dummy.next;
    }
}
