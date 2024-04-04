package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/14
 */
@DisplayName("链表的中间节点测试用例")
public class LeetCode876Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = new LeetCode876().middleNode(head);
        ListNode expected = head.next.next;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode res = new LeetCode876().middleNode(head);
        ListNode expected = head.next.next.next;
        Assertions.assertEquals(expected, res);
    }

}
