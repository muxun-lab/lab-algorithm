package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/6/3
 */
@DisplayName("K个一组翻转链表单元测试")
public class LeetCode25Test {

    @Test
    public void reverseKGroupTestOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(5);
        head = new LeetCode25().reverseKGroup(head, 2);
        while (expected != null) {
            Assertions.assertEquals(expected.val, head.val);
            expected = expected.next;
            head = head.next;
        }
    }

    @Test
    public void reverseKGroupTestTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = new ListNode(3);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(1);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);
        head = new LeetCode25().reverseKGroup(head, 3);
        while (expected != null) {
            Assertions.assertEquals(expected.val, head.val);
            expected = expected.next;
            head = head.next;
        }
    }
}
