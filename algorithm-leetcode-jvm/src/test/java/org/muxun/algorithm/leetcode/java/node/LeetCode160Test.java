package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/3
 */
@DisplayName("相交链表测试用例")
public class LeetCode160Test {

    @Test
    public void testOne() {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = new ListNode(8);
        headB.next.next.next.next = new ListNode(4);
        headB.next.next.next.next.next = new ListNode(5);
        ListNode res = new LeetCode160().getIntersectionNode(headA, headB);
    }
}
