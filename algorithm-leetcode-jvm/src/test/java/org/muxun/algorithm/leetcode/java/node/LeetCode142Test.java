package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/1/31
 */
@DisplayName("环形链表II")
public class LeetCode142Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = second;
        ListNode res = new LeetCode142().detectCycle(head);
        Assertions.assertEquals(second, res);
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        second.next = head;
        ListNode res = new LeetCode142().detectCycle(head);
        Assertions.assertEquals(head, res);
    }

    @Test
    public void testThree() {
        ListNode head = new ListNode(1);
        ListNode res = new LeetCode142().detectCycle(head);
        Assertions.assertNull(res);
    }
}
