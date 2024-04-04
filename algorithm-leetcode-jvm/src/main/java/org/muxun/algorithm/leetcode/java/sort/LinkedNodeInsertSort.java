package org.muxun.algorithm.leetcode.java.sort;

/**
 * 第147题：对链表进行插入排序
 * @author 慕勋
 * @date 2019-08-27
 */
public class LinkedNodeInsertSort {

    public ListNode insertionSortList(ListNode head) {
        // 思路：创建一个新的链表
        // 将head中的节点按照顺序插入到新链表中
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            if (cur.val < result.next.val) {
                ListNode temp = result.next;
                pre.next = cur.next;
                result.next = cur;
                cur.next = temp;
            } else if (cur.val >= pre.val) {
                pre = cur;
            } else {
                ListNode temp = result.next;
                while (temp.next != cur) {
                    if (cur.val < temp.next.val) {
                        ListNode tempTwo = temp.next;
                        temp.next = cur;
                        pre.next = cur.next;
                        cur.next = tempTwo;
                        break;
                    }
                }
            }
            cur = pre.next;
        }
        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
