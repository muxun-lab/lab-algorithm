package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 82
 * 题目: 删除排序链表中的重复元素II
 * 链接: <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii">删除排序链表中的重复元素II</a>
 * 详情: 给定一个已排序的链表的头 head
 * 删除原始链表中所有重复数字的节点，只留下不同的数字
 * 返回 已排序的链表
 * @author 慕勋
 * @created 2024/1/15
 */
public class LeetCode82 {

    /**
     * 思路: 双指针
     * 如果快指针和慢指针的值不同，则将慢指针移动到快指针的位置
     * 如果相同，则找到不同的节点，然后tail=快指针
     * @param head 头节点
     * @return 已排序的链表
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode q = head;
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
}
