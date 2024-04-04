package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("给单链表加一测试用例")
public class LeetCode369Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(4);
        ListNode resNode = new LeetCode369().plusOne(head);
        while (resNode != null) {
            Assertions.assertEquals(expected.val, resNode.val);
            resNode = resNode.next;
            expected = expected.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(0);
        ListNode expected = new ListNode(1);
        ListNode resNode = new LeetCode369().plusOne(head);
        while (resNode != null) {
            Assertions.assertEquals(expected.val, resNode.val);
            resNode = resNode.next;
            expected = expected.next;
        }
    }
}
