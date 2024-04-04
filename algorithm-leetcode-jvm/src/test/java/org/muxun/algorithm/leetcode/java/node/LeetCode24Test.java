package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-12
 */
@DisplayName("两两交换链表中的节点单元测试")
public class LeetCode24Test {

    @Test
    public void swapPairsTestOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = new ListNode(2);
        result.next = new ListNode(1);
        result.next.next = new ListNode(4);
        result.next.next.next = new ListNode(3);
        head = new LeetCode24().swapPairs(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            head = head.next;
            result = result.next;
        }
    }

    @Test
    public void swapPairsTestTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = new ListNode(2);
        result.next = new ListNode(1);
        result.next.next = new ListNode(4);
        result.next.next.next = new ListNode(3);
        head = new LeetCode24().swapPairsRecursion(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            head = head.next;
            result = result.next;
        }
    }
}
