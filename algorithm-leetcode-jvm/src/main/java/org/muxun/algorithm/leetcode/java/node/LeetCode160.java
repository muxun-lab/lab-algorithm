package org.muxun.algorithm.leetcode.java.node;

import java.util.HashSet;

/**
 * 题号: 160
 * 题目: 相交链表
 * 链接: <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists">相交链表</a>
 * 详情: 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 * 请看链接中的图示。
 * @author 慕勋
 * @created 2024/2/3
 */
public class LeetCode160 {

    /**
     * 思路: 哈希集合
     * 不要错误的理解题意，本意是比较节点，即A和B共用相同的节点，地址也是相同的
     * @param headA 链表A
     * @param headB 链表B
     * @return 链表相交的起始节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> aSet = new HashSet<>();
        ListNode p = headA;
        ListNode q = headB;
        while (p != null) {
            aSet.add(p);
            p = p.next;
        }
        while (q != null) {
            if (aSet.contains(q)) {
                return q;
            }
            q = q.next;
        }
        return null;
    }

    /**
     * 思路: 双指针
     * 降低空间复杂度到O(1)
     * * 指针每一次同时递进
     * * 如果A或者B为null，则指向另一条链表，避免出现重复
     * @param headA 链表A
     * @param headB 链表B
     * @return 链表相交的起始节点
     */
    public ListNode getIntersectionNodeByTwoPointer(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            if (p == null) {
                p = headB;
            } else {
                p = p.next;
            }
            if (q == null) {
                q = headA;
            } else {
                q = q.next;
            }
        }
        return p;
    }
}
