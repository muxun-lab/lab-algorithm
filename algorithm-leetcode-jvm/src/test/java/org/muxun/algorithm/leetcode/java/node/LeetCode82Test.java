package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/1/15
 */
@DisplayName("删除排序链表中的重复元素II单元测试")
public class LeetCode82Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode result = new ListNode(1);
        result.next = new ListNode(2);
        result.next.next = new ListNode(5);
        head = new DeleteDumplicates().deleteDuplicates(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        ListNode result = new ListNode(2);
        result.next = new ListNode(3);
        head = new DeleteDumplicates().deleteDuplicates(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }

    @Test
    public void testThree() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode result = new ListNode(1);
        result.next = new ListNode(2);
        result.next.next = new ListNode(5);
        head = new DeleteDumplicates().deleteDuplicatesDoublePointer(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }

    @Test
    public void testFour() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        ListNode result = new ListNode(2);
        result.next = new ListNode(3);
        head = new DeleteDumplicates().deleteDuplicatesDoublePointer(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }

    @Test
    public void testFive() {
        ListNode head = new ListNode(-3);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(-2);
        head.next.next.next = new ListNode(-1);
        head.next.next.next.next = new ListNode(-1);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(0);
        ListNode result = new ListNode(-2);
        head = new DeleteDumplicates().deleteDuplicatesDoublePointer(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }

    @Test
    public void testSix() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode result = new ListNode(1);
        result.next = new ListNode(2);
        result.next.next = new ListNode(5);
        head = new DeleteDumplicates().deleteDuplicatesRecursion(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }

    @Test
    public void testSeven() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        ListNode result = new ListNode(2);
        result.next = new ListNode(3);
        head = new DeleteDumplicates().deleteDuplicatesRecursion(head);
        while (head != null) {
            Assertions.assertEquals(result.val, head.val);
            result = result.next;
            head = head.next;
        }
    }
}
