package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("重排链表测试用例")
public class LeetCode143Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        new LeetCode143().reorderList(head);
        while (head != null) {
            Assertions.assertEquals(expected.val, head.val);
            head = head.next;
            expected = expected.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(5);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(3);
        new LeetCode143().reorderList(head);
        while (head != null) {
            Assertions.assertEquals(expected.val, head.val);
            head = head.next;
            expected = expected.next;
        }
    }
}
